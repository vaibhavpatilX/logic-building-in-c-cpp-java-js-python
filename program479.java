import java.util.*;

class program479
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int iCount = 0,i = 0;

        for(i=0;i < str.length();i++)
        {
            if(str.charAt(i) == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of White Soaces are : "+iCount);
    }
}