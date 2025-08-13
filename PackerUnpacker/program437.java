//File Handling in java
import java.util.*;
import java.io.*;

class program437
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
                FileOutputStream foobj = new FileOutputStream(fobj);
                String str = "Jay Ganesh...";

                byte Arr[] = str.getBytes();
                
                foobj.write(Arr);       
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