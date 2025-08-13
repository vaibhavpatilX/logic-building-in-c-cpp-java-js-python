import java.util.*;
import java.io.*;

class program474
{
    public static void main(String A[])
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            Scanner sobj = new Scanner(System.in);

            int FileSize = 0,iRet = 0;
    
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
            
            while((iRet = fiobj.read(HeaderBuffer,0,100)) != -1)
            {

                //Convert byte array to String
                Header = new String(HeaderBuffer);

                Header = Header.trim();

                String Tokens[] = Header.split(" ");

                fobjnew = new File(Tokens[0]);

                fobjnew.createNewFile();

                FileSize = Integer.parseInt(Tokens[1]);

                byte Buffer[] = new byte[FileSize];

                FileOutputStream foobj = new FileOutputStream(fobjnew);

                fiobj.read(Buffer,0,FileSize);
                
                foobj.write(Buffer,0,FileSize);

                foobj.close();
            } // End of while           
            fiobj.close();
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program474 class