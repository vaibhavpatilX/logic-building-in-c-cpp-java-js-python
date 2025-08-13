//File Handling in java
import java.util.*;
import java.io.*;

class program433
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("PPA.txt");

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