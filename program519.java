
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
        System.out.println("Number of word are : "+tokens.length);
    }
}


/*//Word count

import java.util.*;

class program519
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        char Arr[] = str.toCharArray();       
        int iCount = 0;

        System.out.println(str);
        
        for(int i = 0; i<Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of word are : "+(iCount+1));
    }
}*/