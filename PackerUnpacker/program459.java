import java.util.*;
import java.io.*;

class program459
{
    public static void main(String A[])
    {
        try
        {
            String str = "     Marvellous Infosystems Pune By Piyush Manohar Khainrar     ";

            System.out.println("Original length : "+str.length());

            str = str.trim();
            
            System.out.println("Updated length : "+str.length());

            String Arr[] = str.split(" ");         //word split after space     //str.tok in c
            System.out.println("Number of Tokens are : "+Arr.length);

            int i = 0;
            for(i = 0;i < Arr.length;i++)
            {
                System.out.println(Arr[i]);
            }
        }
        catch(Exception eobj)
        {}
    }
}