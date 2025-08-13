//Word count

//_ _ _India_ _ _ _is_ _my_country_ _ _ _
//After trim
//India_ _ _ _is_ _my_country

import java.util.*;

class program516
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("  "," ");

        System.out.println(str);
    }
}