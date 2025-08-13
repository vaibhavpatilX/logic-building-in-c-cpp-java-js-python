import java.util.*;

class StringX
{
    public static void Trim(String str)      //$
    {
        int i = 0,iStart = 0, iEnd = 0;
        
        char Arr[] = str.toCharArray();     //_ _ _JAY_ _GANESH_ _ _

        if(Arr[0] == ' ')
        {
            System.out.println("Inside first if");
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
            System.out.println("Inside Second if");
            while(Arr[i] == ' ')            //$$
            {
                i--;
            }
        }
        iEnd  = i;

        System.out.println("iStart is : "+iStart);
        System.out.println("iEnd is : "+iEnd);

        for(i = iStart;i <= iEnd;i++)
        {
            System.out.print(Arr[i]);
        }
    }
}

class program486
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();
        
        StringX.Trim(str);
    }
}