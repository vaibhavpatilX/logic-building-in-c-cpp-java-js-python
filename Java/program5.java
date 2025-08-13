////////////////////////////////////////////////////
//
//  File name   :   program5.java
//  Description :   Used to calculate percentage
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025
//
////////////////////////////////////////////////////

import java.util.Scanner;

class Percentage
{
    public Percentage(int pobtained,int pTotal)
    {
        if(pTotal < 0)
        {
            pTotal = -pTotal;
        }

        float fPercentage = 0.0f;
        fPercentage = ((float)pobtained / (float)pTotal) * 100;
        System.out.println("Percentage is : "+fPercentage);
    }
}
class program5
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Total = 0;
        int Obtained = 0;

        System.out.println("Enter your Total marks: ");
        Total = sobj.nextInt();
        
        if(Total == 0)
        {
            System.out.println("Total marks cant be Zero..!");
            return;
        }

        System.out.println("Enter your Obtained marks: ");
        Obtained = sobj.nextInt();

        Percentage pobj = new Percentage(Obtained,Total);
        
    }
}
