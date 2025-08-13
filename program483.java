import java.util.*;

class StringX
{
    public String Replace(String str,char A,char B)
    {
        int i = 0;
        
        char Arr[] = str.toCharArray();     //$

        for(i=0;i < Arr.length;i++)
        {
            if(Arr[i] == A)
            {
                Arr[i] = B;
            }
        }
        String newstr = new String(Arr);

       return newstr;
    }
}

class program483
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        StringX strobj = new StringX();

        String sRet = strobj.Replace(str,'a','A');

        System.out.println("Updated string is : "+sRet);
    }
}