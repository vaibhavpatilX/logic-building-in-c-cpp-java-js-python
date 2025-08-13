///////////////////////////////////////////////////////
//
//  File name :     LinkedListX.java
//  Description :   Demonstrates usage of Java LinkedList utility methods:
//                  add(), remove(), contains(), iterator(), size(),
//                  get(), indexOf(), lastIndexOf(), set(), clear(), isEmpty()
//  Author :        Vaibhav
//  Date :          12/06/2025
//
///////////////////////////////////////////////////////

import java.util.*;


class LinkedListX
{
    public static void main(String A[])
    {
        System.out.println("_______________________________________________________________________________________________\n");
        System.out.println("----------------- This Application is for LinkedList Collection  -----------------\n");
        System.out.println("_______________________________________________________________________________________________");
    
        System.out.print("Elements are : ");
        LinkedList <Integer> lobj = new LinkedList <Integer> ();

        lobj.add(11);
        lobj.add(21);
        lobj.add(51);
        lobj.add(101);
        lobj.add(121);
        lobj.add(51);

        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        lobj.add(2,31);
        System.out.println("-------- add() Method ... --------");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        lobj.addFirst(31);
        System.out.println("-------- addFirst() Method ... --------");
        System.out.println("--31 is Inserted at beginning of list--");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        lobj.addLast(171);
        System.out.println("-------- addLast() Method ... --------");
        System.out.println("--171 is Inserted at Last of list--");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        lobj.remove(2);
        System.out.println("-------- remove() Method ... --------");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- contains() Method ... --------");
        if(lobj.contains(51))
        {
            System.out.println("Element is Present");
        }
        System.out.println("_______________________________________________________________________________________________");

        System.out.println("-------- iterator() Method ... --------");
        Iterator iobj = lobj.iterator();
        System.out.println("Elements of the LinkedList are : ");

        while(iobj.hasNext())
        {
            System.out.println(iobj.next());
        }
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- descendingIterator() Method ... --------");
        Iterator idobj = lobj.descendingIterator();
        System.out.println("Elements of the LinkedList in Desc. Order are : ");

        while(idobj.hasNext())
        {
            System.out.println(idobj.next());
        }
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- size() Method ... --------");
        System.out.println("Size of Array is "+lobj.size());  
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- get() Method ... --------");
        int iValue = lobj.get(3);
        System.out.println("Value in 3rd index is "+iValue);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- getFirst() Method ... --------");
        //int iValue = lobj.getFirst();
        System.out.println("Value in First index is "+lobj.getFirst());
        System.out.println("_______________________________________________________________________________________________");
              
        System.out.println("-------- getLast() Method ... --------");
        //int iValue = lobj.getLast();
        System.out.println("Value in Last index is "+lobj.getLast());
        System.out.println("_______________________________________________________________________________________________");
              
        System.out.println("-------- indexof() Method ... --------");
        iValue = lobj.indexOf(51);
        System.out.println("51 is Occurs First-time in the Array "+iValue+" index");
        System.out.println("_______________________________________________________________________________________________");

        System.out.println("-------- lastIndexOf() Method ... --------");
        iValue = lobj.lastIndexOf(51);
        System.out.println("51 is Occurs Last-time in the Array "+iValue+" index");
        System.out.println("_______________________________________________________________________________________________");
        
        lobj.set(4,55);
        System.out.println("-------- set() Method ... --------");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");

        lobj.clear();
        System.out.println("-------- clear() Method ... --------");
        System.out.println(lobj);
        System.out.println("_______________________________________________________________________________________________");
        
        System.out.println("-------- isEmpty() Method ... --------");
        if(lobj.isEmpty())
        {
            System.out.println("Array is Empty");
        }
        System.out.println("_______________________________________________________________________________________________");

    }
}