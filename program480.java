import java.util.*;

class program480
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int iCount = 0,i = 0;
        
        char Arr[] = str.toCharArray();     //$

        for(i=0;i < Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                iCount++;
            }
        }
        System.out.println("Number of White Spaces are : "+iCount);
    }
}