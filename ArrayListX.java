///////////////////////////////////////////////////////
//
//  File name :     ArraysListX.java
//  Description :   Demonstrates usage of Java ArrayList utility methods:
//                  add(), remove(), contains(), iterator(), size(),
//                  get(), indexOf(), lastIndexOf(), set(), clear(), isEmpty()
//  Author :        Vaibhav
//  Date :          12/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;


class ArraysListX
{
    public static void main(String A[])
    {
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("----------------- This Application is for ArrayList Collection  -----------------\n");
        System.out.println("_______________________________________________________________________________________________");
    
        ArrayList <Integer> aobj = new ArrayList <Integer> ();

        aobj.add(11);
        aobj.add(21);
        aobj.add(51);
        aobj.add(101);
        aobj.add(121);
        aobj.add(51);

        System.out.println(aobj);
        System.out.println("_______________________________________________________________________________________________");
        
        aobj.add(2,31);
        System.out.println("-------- add() Method ... --------");
        System.out.println(aobj);
        System.out.println("_______________________________________________________________________________________________");
        
        aobj.remove(2);
        System.out.println("-------- remove() Method ... --------");
        System.out.println(aobj);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- contains() Method ... --------");
        if(aobj.contains(51))
        {
            System.out.println("Element is Present");
        }
        System.out.println("_______________________________________________________________________________________________");

        Iterator iobj = aobj.iterator();
        System.out.println("Elements of the ArrayList are : ");

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- size() Method ... --------");
        System.out.println("Size of Array is "+aobj.size());  
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- get() Method ... --------");
        int iValue = aobj.get(3);
        System.out.println("Value in 3rd index is "+iValue);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- indexof() Method ... --------");
        iValue = aobj.indexOf(51);
        System.out.println("51 is Occurs First-time in the Array "+iValue+" index");
        System.out.println("_______________________________________________________________________________________________");

        System.out.println("-------- lastIndexOf() Method ... --------");
        iValue = aobj.lastIndexOf(51);
        System.out.println("51 is Occurs Last-time in the Array "+iValue+" index");
        System.out.println("_______________________________________________________________________________________________");
        
        aobj.set(4,55);
        System.out.println("-------- set() Method ... --------");
        System.out.println(aobj);
        System.out.println("_______________________________________________________________________________________________");

        aobj.clear();
        System.out.println("-------- clear() Method ... --------");
        System.out.println(aobj);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- isEmpty() Method ... --------");
        if(aobj.isEmpty())
        {
            System.out.println("Array is Empty");
        }
        System.out.println("_______________________________________________________________________________________________");

    }
}