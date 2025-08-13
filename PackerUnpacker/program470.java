import java.util.*;
import java.io.*;

class program470
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
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program467 class