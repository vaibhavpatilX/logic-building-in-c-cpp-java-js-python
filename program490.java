import java.util.*;

class program490
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        String sRet = str.trim();

        System.out.println("Updated String is : "+sRet);
        System.out.println("Updated String length is : "+sRet.length());

    }
}