///////////////////////////////////////////////////////
//
//  File name :     ArraysX.java
//  Description :   Demonstrates usage of Java Arrays utility methods:
//                  equals(), sort(), binarySearch(), asList(), fill(),
//                  toString(), parallelSort()
//  Author :        Vaibhav
//  Date :          12/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;


class ArraysX
{
    public static void main(String A[])
    {
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("----------------- This Application is for Array Collection  -----------------\n");
        System.out.println("_______________________________________________________________________________________________");

        int Arr[] = {11,51,21,101,75,95};

        System.out.println("-------- Data traversal using for-each Loop --------");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }
        System.out.println("_______________________________________________________________________________________________");
        
        int Brr[] = {11,51,21,101,75,95};
        boolean bRet = false;
        bRet = Arrays.equals(Arr,Brr);
        System.out.println("-------- equals() Method... --------");
        if(bRet == true)
        {
            System.out.println("Both Arrays are equal");        
        }
        else
        {   
            System.out.println("Both Arrays are not equal");        
        }
        System.out.println("_______________________________________________________________________________________________");
        
        Arrays.sort(Arr);
        System.out.println("-------- sort() Method... --------");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }        

        int iRet = 0;

        iRet = Arrays.binarySearch(Arr,1,4,21);
        System.out.println("-------- binarySearch() Method which Searches on Specific Range... --------");
        System.out.println("\nReturn value of binary search after Seaching in Specific Range is : "+iRet);
        System.out.println("_______________________________________________________________________________________________");


        iRet = Arrays.binarySearch(Arr,101);
        System.out.println("-------- binarySearch() Method ... --------");
        if(iRet >= 0)
        {
            System.out.println("Element is Present");        
        }
        else
        {   
            System.out.println("Element is not Present");
        }

        System.out.println("_______________________________________________________________________________________________");
        
        Arrays.asList(Arr);
        System.out.println("-------- asList() Method ... --------");
        for(int iNo : Arr)
        {
            System.out.println(iNo);
        }
        System.out.println("_______________________________________________________________________________________________");

        Arrays.fill(Arr,1,2,55);
        System.out.println("-------- fill() Method ... --------");
        System.out.println(Arrays.toString(Arr));

        System.out.println("_______________________________________________________________________________________________");
        Arrays.parallelSort(Arr);
        System.out.println("-------- Multi-threaded parallelSort() Method ... --------");
        System.out.println(Arrays.toString(Arr));
    }
}