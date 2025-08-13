import java.util.*;

class program481
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        int i = 0;
        
        char Arr[] = str.toCharArray();     //$

        for(i=0;i < Arr.length;i++)
        {
            if(Arr[i] == ' ')
            {
                Arr[i] = '_';
            }
        }
        String newstr = new String(Arr);

        System.out.println("Updated string is : "+newstr);
    }
}