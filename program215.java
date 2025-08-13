import java.util.Scanner;


class program215
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter number of Elements : ");
        int iSize = sobj.nextInt();

        int Arr[] = new int[iSize];

        System.out.println("Enter the Elements: ");

        int iCnt = 0;

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            Arr[iCnt] = sobj.nextInt();
        }

        System.out.println("Elements of the array are : ");

        for(iCnt = 0;iCnt < Arr.length;iCnt++)
        {
            System.out.println(Arr[iCnt]);
        }

        Arr = null;
        sobj = null;
    }
}