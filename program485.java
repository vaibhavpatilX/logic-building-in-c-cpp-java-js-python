import java.util.*;

class program485
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        String sRet = str.replaceAll("a","A");  //$

        System.out.println("Updated string is : "+sRet);
    }
}