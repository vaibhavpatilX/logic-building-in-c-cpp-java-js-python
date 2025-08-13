
//Word count

import java.util.*;

class program521
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String tokens[] = str.split(" ");

        for(int i = 0;i< tokens.length;i++)
        {
            System.out.println(tokens[i]);
        }
    }
}

