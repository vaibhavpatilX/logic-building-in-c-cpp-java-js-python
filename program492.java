import java.util.*;

class program492
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int aCount = 0,bCount = 0,cCount = 0;
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == 'a')
            {
                aCount++;
            }
            else if(Arr[i] == 'b')
            {
                bCount++;
            }
            else if(Arr[i] == 'c')
            {
                cCount++;
            }
        }

        System.out.println("Frequency of a : "+aCount);
        System.out.println("Frequency of b: "+bCount);
        System.out.println("Frequency of c : "+cCount);
    }
}