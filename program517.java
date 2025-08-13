//Word count

import java.util.*;

class program517
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");       //regulR expression ///(one or more," ")

        System.out.println(str);
    }
}