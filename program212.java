import java.util.Scanner;

class MarvellousString
{
    public String str;
 
    public MarvellousString(String a)
    {
        this.str = a;
    }
    public int CountSmall()
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]>= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }   
        return iCount;
    }
}

class program212
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter String: ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        int iRet = 0;

        iRet = mobj.CountSmall();

        System.out.println("Number of small character are : "+iRet);

    }
}