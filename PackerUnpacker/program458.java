import java.util.*;
import java.io.*;

class program458
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystems Pune     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();
            
            System.out.println("Updated length : "+str.length());

            String Arr[] = str.split(" ");         //word split after space
            System.out.println("Number of Tokens are : "+Arr.length);
        }
        catch(Exception eobj)
        {}
    }
}