import java.util.*;
import java.io.*;

class program473
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
    
            System.out.println("Enter the name of file which contains Packed Data : ");        //all in one file
            String PackName = sobj.nextLine();

            File fobj = new File(PackName);

            if(!fobj.exists())
            {
                System.out.println("Unable to access packed file...");
                return;
            }
            System.out.println("Packed file gets successsfully opened...");
            
            FileInputStream fiobj = new FileInputStream(fobj);

            //Buffer to read the header
            byte HeaderBuffer[] = new byte[100];
            
            fiobj.read(HeaderBuffer,0,100);
            
            //Convert byte array to String
            String Header = new String(HeaderBuffer);

            System.out.println(Header);

            Header = Header.trim();

            String Tokens[] = Header.split(" ");

            System.out.println("File Name is : "+Tokens[0]);
            System.out.println("File Size is : "+Tokens[1]);

            File fobjnew = new File(Tokens[0]);

            fobjnew.createNewFile();

            int FileSize = 0;

            FileSize = Integer.parseInt(Tokens[1]);

            byte Buffer[] = new byte[FileSize];

            FileOutputStream foobj = new FileOutputStream(fobjnew);

            fiobj.read(Buffer,0,FileSize);
            
            foobj.write(Buffer,0,FileSize);

            
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program473 class