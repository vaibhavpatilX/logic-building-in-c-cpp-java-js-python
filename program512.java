//Word count

//_ _ _India_ _ _ _is_ _my_country_ _ _ _
//After trim
//India_ _ _ _is_ _my_country

import java.util.*;

class program512
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();

        char Arr[] = str.toCharArray();
        char Brr[] = new char[Arr.length];

        int iCount = 0,i = 0,j = 0;
        boolean bFlag = false;

        for(i=0;i<Arr.length;i++)
        {
            if(Arr[i] != ' ')
            {
                Brr[j] = Arr[i];
                j++;
                bFlag = false;
            }
            else if(Arr[i] == ' ')
            {
                if(bFlag == false)
                {
                    Brr[j] = ' ';
                    j++;
                    bFlag = true;
                    iCount++;
                }
            }
        }
        
        System.out.println("Number of Word Count are : "+(iCount+1));
    }
}