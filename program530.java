//display reverse string

import java.util.*;

class program530
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String tokens[] = str.split(" ");

        StringBuilder sb = null;

        for(String s : tokens )
        {
            sb = new StringBuilder(s);
            System.out.println(sb.reverse());
        }
    }
}

