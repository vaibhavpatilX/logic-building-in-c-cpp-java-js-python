// Input : HeLLo
// Output : #e##o

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
    
    public String UpdateString()
    {
        char Arr[] = str.toCharArray();

        int iCnt = 0;

        for(iCnt = 0; iCnt < Arr.length; iCnt++)
        {
            if((Arr[iCnt]>= 'A') && (Arr[iCnt] <= 'Z'))
            {
                Arr[iCnt] = '#';
            }
        }   
        
        String ret = new String(Arr);

        return ret;
    }
}

class program214
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Please Enter String: ");
        String data = sobj.nextLine();

        MarvellousString mobj = new MarvellousString(data);

        String sRet = null;

        sRet = mobj.UpdateString();

        System.out.println("Updated String is : "+sRet);

    }
}