import java.util.*;
import java.io.*;

class program475
{
    public static void main(String A[])
    {
        try
        {
            String Header = null;
            File fobjnew = null;
            Scanner sobj = new Scanner(System.in);

            int FileSize = 0,iRet = 0,iCountFile = 0;
    
            System.out.println("Enter the name of file which contains Packed Data : ");        //all in one file
            String PackName = sobj.nextLine();

            File fobj = new File(PackName);

            // If packed file is not present
            if(!fobj.exists())
            {
                System.out.println("Unable to access packed file...");
                return;
            }

            System.out.println("Packed file gets successsfully opened...");
            
            FileInputStream fiobj = new FileInputStream(fobj);

            //Buffer to read the header
            byte HeaderBuffer[] = new byte[100];
            
            //Scan the packed file to extract the files from it
            while((iRet = fiobj.read(HeaderBuffer,0,100)) != -1)
            {

                //Convert byte array to String
                Header = new String(HeaderBuffer);

                Header = Header.trim();

                //Tokenize the Header into 2 parts
                String Tokens[] = Header.split(" ");

                fobjnew = new File(Tokens[0]);

                //Create new file to extract
                fobjnew.createNewFile();

                FileSize = Integer.parseInt(Tokens[1]);
                
                //Create new Buffer to store FileData
                byte Buffer[] = new byte[FileSize];

                FileOutputStream foobj = new FileOutputStream(fobjnew);

                // Read the data from Packed file
                fiobj.read(Buffer,0,FileSize);
                
                // Write the data into Extracted file
                foobj.write(Buffer,0,FileSize);

                System.out.println("File Unpacked with name : "+Tokens[0] + " having Size "+Tokens[1]);
                
                iCountFile++;

                foobj.close();
            } // End of while           
            
            System.out.println("Total number of files unpacked : "+iCountFile);

            fiobj.close();
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program474 class