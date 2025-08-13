import java.util.*;

class program491
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        String sRet = str.replaceAll(" ","");

        System.out.println("Updated String is : "+sRet);
        System.out.println("Updated String length is : "+sRet.length());

    }
}