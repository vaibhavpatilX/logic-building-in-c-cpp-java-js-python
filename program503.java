import java.util.*;

class program503
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.replaceAll(" ","");

        System.out.println(str);
    }
}