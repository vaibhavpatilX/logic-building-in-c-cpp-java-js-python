import java.util.Scanner;

class program209
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter String: ");
        String str = sobj.nextLine();

        char Arr[] = str.toCharArray();

        int iCnt = 0, iCount = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]>= 'a') && (Arr[iCnt] <= 'z'))
            {
                iCount++;
            }
        }   
        System.out.println("Number of small character are : "+iCount);

    }
}