package MarvellousPackerUnPacker;
import java.util.*;
import java.io.*;

public class MarvellousUnpacker
{
    private String PackName;

    public MarvellousUnpacker(String A)
    {
        this.PackName = A;
    }

    public void UnpackingActivity()
    {
        try
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("---------------------- Marvellous Packer UnPacker----------------------");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("-------------------------- UnPacking Activity -------------------------");
            System.out.println("-----------------------------------------------------------------------");

            String Header = null;
            File fobjnew = null;

            int FileSize = 0,iRet = 0,iCountFile = 0;
    
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
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("-------------------------- Statistical Report -------------------------");
            System.out.println("-----------------------------------------------------------------------");              

            System.out.println("Total number of files unpacked : "+iCountFile);
            
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("------------------- Thank you for using Application -------------------");
            System.out.println("-----------------------------------------------------------------------");
            fiobj.close();
        }
        catch(Exception eobj)
        {}
    }
}