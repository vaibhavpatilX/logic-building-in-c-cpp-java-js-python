import java.util.*;
import java.io.*;

class program450
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);

            System.out.println("Enter the name of Directory : ");
            String DirName = sobj.nextLine();

            File fobj = new File(DirName);

            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println("Directory is present..");

                File Arr[] = fobj.listFiles();           //file class objects after that into Arr[]

                System.out.println("Number of Files in the directory are : "+Arr.length);

                int i = 0;
                for(i=0;i < Arr.length;i++)
                {
                    System.out.println("File Name is : "+Arr[i].getName()+" File Size is : "+Arr[i].length());

                }
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