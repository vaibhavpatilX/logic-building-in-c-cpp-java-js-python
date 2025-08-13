////////////////////////////////////////////////////
//
//  File name   :   program7.java
//  Description :   Used to calculate Ticket Price based on Age
//  Author      :   Vaibhav Patil
//  Date        :   18/05/2025
//
////////////////////////////////////////////////////
/*
    Start
        Accept age from user
            If age is less than 5 then there will no ticket
            If it is in between 5 to 18 then it will be 700
            It it is in betwween 18 to 50 it will be 999
            And if it is greater than 50 then it will be 500
    Stop
*/

import java.util.Scanner;

class CalculateTicket
{
    CalculateTicket(int CheckAge)
    {
        if((CheckAge >= 0) && (CheckAge <= 5))
        {
            System.out.println("No Ticket");
        }
        else if((CheckAge >= 5) && (CheckAge < 18))
        {
            System.out.println("Ticket price for you is 700 ");
        }
        else if((CheckAge >= 18) && (CheckAge < 50))
        {
            System.out.println("Ticket price for you is 999 ");
        }
        else if(CheckAge >= 50)
        {
            System.out.println("Ticket price for you is 500 ");
        }
    }
}
class program7
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        int Age = 0;

        System.out.println("Enter your Age :  ");
        Age = sobj.nextInt();

        CalculateTicket pobj = new CalculateTicket(Age);
        
    }
}
