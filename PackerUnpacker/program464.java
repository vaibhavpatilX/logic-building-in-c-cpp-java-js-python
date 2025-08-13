import java.util.*;
import java.io.*;

class program464
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory that you want to pack : ");
            String DirName = sobj.nextLine();
            
            System.out.println("Enter the name of file that you want to create for packing : ");        //all in one file
            String PackName = sobj.nextLine();

            File Packobj = new File(PackName);
            boolean bRet = Packobj.createNewFile();

            if(bRet = false)
            {
                System.out.println("Unable to create a file");
                return;
            }

            File fobj = new File(DirName);
            
            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present..");

                File Arr[] = fobj.listFiles();           //file class objects after that into Arr[]

                System.out.println("Number of Files in the directory are : "+Arr.length);

                int i = 0,j = 0,iRet = 0;

                //Packed File object
                FileOutputStream foobj = new FileOutputStream(Packobj);

                //Buffer for Read and Write Activity
                byte Buffer[] = new byte[1024];

                String Header = null;

                //Directory Traversal
                for(i=0;i < Arr.length;i++)
                {
                    Header = Arr[i].getName()+" "+Arr[i].length();

                    //Loop to form 100 bytes Header
                    for(j=Header.length();j<100;j++)
                    {
                        Header = Header + " ";
                    }
                    //write Header into packed file
                    
                    foobj.write(Header.getBytes());
                }
                System.out.println("Packing Activity Done..!");
            }
            else
            {
                System.out.println("There is no such directory..");
            }
        }
        catch(Exception eobj)
        {}
    }
}