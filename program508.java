//India is my country
//Word count
import java.util.*;

class program508
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();

        char Arr[] = str.toCharArray();

        int iCount = 0,i = 0;

        for(i=0;i<Arr.length;i++)
        {
            if(((Arr[i] == ' ') && (Arr[i+1] <= 'a') && (Arr[i+1] >= 'z')) || ((Arr[i] == ' ') && (Arr[i+1] <= 'A') && (Arr[i+1] >= 'Z')))
            {
                iCount++;
            }

            /*if(Arr[i] == ' ')
            {
                iCount++;
            }*/
        }
        System.out.println("Number of word are : "+(iCount+1));
    }
}