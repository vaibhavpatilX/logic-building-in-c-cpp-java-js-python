//File Handling in java
import java.util.*;
import java.io.*;

class program434
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of file that you want to create: ");
        String Fname = sobj.nextLine();

        try
        {
            File fobj = new File(Fname);

            if(fobj.exists())
            {
                System.out.println("File Already Exists..");
            }
            else
            {
                fobj.createNewFile();            //create system call in C
                System.out.println("File Successfully Created...!");
            }
        }
        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}

    }
}