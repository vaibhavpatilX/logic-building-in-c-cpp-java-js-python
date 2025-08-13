import java.util.*;

class program493
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
        
        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int Count[] = {0,0,0};  
        int i = 0;

        char Arr[] = str.toCharArray();

        for(i = 0;i < Arr.length;i++)
        {
            if(Arr[i] == 'a')
            {
                Count[0]++;
            }
            else if(Arr[i] == 'b')
            {
                Count[1]++;
            }
            else if(Arr[i] == 'c')
            {
                Count[2]++;
            }
        }

        System.out.println("Frequency of a : "+Count[0]);
        System.out.println("Frequency of b: "+Count[1]);
        System.out.println("Frequency of c : "+Count[2]);
    }
}