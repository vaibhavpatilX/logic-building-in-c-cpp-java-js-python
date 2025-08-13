////////////////////////////////////////////////////
//
//  File name   :   program6.java
//  Description :   Used to display Class after accepting percentage
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025
//
////////////////////////////////////////////////////
/*
    Start
        Accept percentage from user
            If percentage is less than 0 and greater than 100
                Display as invalid input
            If percentage is greater than 0 and less than 35
                Display as fail
            If percentage is greater than 35 and less than 50
                Display as Pass class
            If percentage is greater than 50 and less than 60
                Display as second class
            If percentage is greater than 60 and less than 70
                Display as first class
            If percentage is greater than 70 and less than 100
                Display as first class with distinction
    Stop
*/

import java.util.Scanner;

class Percentage
{
    Percentage(float fPercent)
    {
        if((fPercent < 35) && (fPercent > 0))
        {
            System.out.println("You are Fail..!");
        }
        else if((fPercent > 35) && (fPercent < 50))
        {
            System.out.println("Pass Class");
        }
        else if((fPercent > 50) && (fPercent < 60))
        {
            System.out.println("Second Class");
        }
        else if((fPercent > 60) && (fPercent < 70))
        {
            System.out.println("First Class");
        }
        else if((fPercent > 70) && (fPercent <= 100))
        {
            System.out.println("Congartulations..! First Class with Distinction...!");
        }
        else//((Percent > 100) || (Percent < 0))
        {
            System.out.println("Invalid Input..!");
            return;
        }
        
    }
}
class program6
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        float Percent = 0.0f;

        System.out.println("Enter your Percentage :  ");
        Percent = sobj.nextFloat();

        Percentage pobj = new Percentage(Percent);
        
    }
}
