//File Handling in java
import java.util.*;
import java.io.*;

class program435
{
    public static void main(String A[]) throws Exception
    {
        File fobj = new File("Marvellous.txt");

        System.out.println("File Name is : "+fobj.getName());
        System.out.println("File Size is : "+fobj.length());            //No. os Bytes into the file

    }
}