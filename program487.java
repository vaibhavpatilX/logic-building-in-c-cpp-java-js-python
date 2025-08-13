import java.util.*;

class StringX
{
    public static String Trim(String str)      //$
    {
        int i = 0,iStart = 0, iEnd = 0;
        
        char Arr[] = str.toCharArray();     //_ _ _JAY_ _GANESH_ _ _

        if(Arr[0] == ' ')
        {
            while((Arr[i] == ' ') && (i < Arr.length))      //$$
            {
                i++;
            }
        }
        
        iStart = i;

//        i = 0;
        i = Arr.length-1;

        if(Arr[Arr.length-1] == ' ')        //        if(Arr(i) == ' ')
        {
            while(Arr[i] == ' ')            //$$
            {
                i--;
            }
        }
        iEnd  = i;

        char Brr[] = new char[iEnd-iStart+1 ];      //$
        int j = 0;

        for(i = iStart,j = 0;i <= iEnd;i++,j++)
        {
            Brr[j] = Arr[i];
        }

        return new String (Brr);
    }
}

class program487
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        String sRet = StringX.Trim(str);
        System.out.println("Updated String is : "+sRet);
        System.out.println("Updated String length is : "+sRet.length());

    }
}