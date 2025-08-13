import java.util.*;
import java.io.*;

class program460
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

                int i = 0;

                FileOutputStream foobj = new FileOutputStream(Packobj);

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                for(i=0;i < Arr.length;i++)
                {
                    System.out.println("File Name is : "+Arr[i].getName()+" File Size is : "+Arr[i].length());

                    FileInputStream fiobj = new FileInputStream(Arr[i]);

                    while((iRet = fiobj.read(Buffer))!= -1)    
                    {
                        foobj.write(Buffer,0,iRet);
                    }
                    fiobj.close();
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