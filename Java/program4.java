////////////////////////////////////////////////////
//
//  File name   :   program4.java
//  Description :   Used to calculate percentage
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025
//
////////////////////////////////////////////////////
import java.util.Scanner;

class program4
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);
               
        int Total = 0;
        int Obtained = 0;
        float Percentage = 0.0f;

        System.out.println("Enter your Total marks : ");
        Total = sobj.nextInt();

        System.out.println("Enter your Obtained Marks : ");
        Obtained = sobj.nextInt();

        Percentage = ((float)Obtained / (float)Total) * 100;

        System.out.println("Percentage is : "+Percentage);
    }
}