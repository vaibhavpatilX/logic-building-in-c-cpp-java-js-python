/*
hello demo madam nayan ppa level for radar
nayan madam level radar
*/

import java.util.*;

class program534
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the word : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("//s"," ");
        String tokens[] = str.split(" ");

        StringBuilder sb = new StringBuilder(str);

        for(String s : tokens)
        {
            sb = new StringBuilder(s);
            sb.reverse();
    
            if(s.equals(new String(sb)))              //str is string // sb is stringbuilder
            {
                System.out.println(s);
            }
        }
    }
}

