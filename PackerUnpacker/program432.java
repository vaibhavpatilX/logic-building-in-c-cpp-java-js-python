//File Handling in java
import java.util.*;
import java.io.*;

class program432
{
    public static void main(String A[])
    {
        try
        {
            File fobj = new File("Marvellous.txt");

            fobj.createNewFile();            //create system call in C
        }
        catch(IOException iobj)
        {}

        catch(Exception eobj)
        {}

    }
}