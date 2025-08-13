//display reverse string

import java.util.*;

class program533
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String str = sobj.nextLine();

        StringBuilder sb = new StringBuilder(str);

        sb.reverse();

        if(str.equals(new String(sb)))              //str is string // sb is stringbuilder
        {
            System.out.println("String is palindrome");
        }
        else
        {
            System.out.println("String is not palindrome");
        }
    }
}

