//Frequency of word count

//demo hello demo pune code hello india ppa lb hello
// demo : 2
// hello : 3
// pune : 1
/* code : 1
    ppa : 1
    lb  : 1
    india : 1



    Accept String 
    remove extra whitespaces using trim
    Remove in between white spaces using replaceAll
    Tokenise the string using split
    create hashmap with string as key and int as value
    travel tokens array and update hashmap
    travel hashmap and display result
*/

//Word count

import java.util.*;

class program524
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String tokens[] = str.split(" ");
        
        HashMap<String,Integer> hobj = new HashMap<String,Integer>();

        for(String s : tokens)
        {
            if(hobj.containsKey(s))
            {
                hobj.put(s,hobj.get(s)+1);
            }
            else
            {
                hobj.put(s,1);
            }
            
        }
        
        for(String s : hobj.keySet())
        {
            System.out.println(s+" : "+hobj.get(s));
        }
    }
}

