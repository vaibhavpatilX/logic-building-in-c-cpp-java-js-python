//display reverse string

import java.util.*;

class program531
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
        StringBuilder newstr = null;

        for(String s : tokens )
        {
            sb = new StringBuilder(s);
            //newstr = newstr+sb.reverse();
            newstr.append(sb.reverse());
            //newstr = newstr + " ";
            newstr.append(" ");
        }

        String finalstr = new String(newstr);

        System.out.println(finalstr.trim());
    }
}

