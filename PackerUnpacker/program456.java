import java.util.*;
import java.io.*;

class program456
{
    public static void main(String A[])
    {
        try
        {
            String str = "Marvellous Infosystems Pune";

            System.out.println("Original length : "+str.length());

            str = str.trim();
            
            System.out.println("Updated length : "+str.length());
        }
        catch(Exception eobj)
        {}
    }
}