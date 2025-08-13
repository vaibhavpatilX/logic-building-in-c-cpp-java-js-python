//File Handling in java
import java.util.*;
import java.io.*;

class program443
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file that you want to open: ");
        String Fname = sobj.nextLine();

        try
        {
            File fobj = new File(Fname);

            if(fobj.exists())
            {
                FileInputStream fiobj = new FileInputStream(fobj);

                byte Arr[] = new byte[10];                

                int iRet = 0;

                System.out.println("Data from file is : ");

                while((iRet = fiobj.read(Arr)) != -1)       //0  Error
                {
                    String str = new String(Arr,0,iRet);
                    System.out.println(str);
                    //System.out.println(str.length());
                }
                System.out.println("Value of iRet at the end : "+iRet);
            }
            else
            {
                System.out.println("File not present in current directory...!");
                return;
            }
        }
        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}

    }
}