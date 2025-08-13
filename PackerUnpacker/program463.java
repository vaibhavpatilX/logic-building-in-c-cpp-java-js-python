import java.util.*;
import java.io.*;

class program463
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

                int i = 0,j = 0;

                FileOutputStream foobj = new FileOutputStream(Packobj);

                byte Buffer[] = new byte[1024];
                int iRet = 0;

                String Header = null;


                //Directory Traversal
                for(i=0;i < Arr.length;i++)
                {
                    Header = Arr[i].getName()+" "+Arr[i].length();
                    System.out.println(Header+ " Length of Header is : "+Header.length());

                    for(j=Header.length();j<100;j++)
                    {
                        Header = Header + " ";
                    }
                    System.out.println(Header+ " Length of Header is : "+Header.length());
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