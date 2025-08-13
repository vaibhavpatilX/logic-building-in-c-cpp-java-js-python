///////////////////////////////////////////////////////
//
//  File name :     program52.java
//  Descreption :   Accept Input and Display  
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////

import java.util.*;

class program52
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sobj.nextLine();

        System.out.println("Enter your age: ");
        int Age = sobj.nextInt();

        System.out.println("Enter your marks: ");
        float Marks = sobj.nextFloat();

        System.out.println("Name : "+name);
        System.out.println("Age : "+Age);
        System.out.println("Marks : "+Marks);
    }
}