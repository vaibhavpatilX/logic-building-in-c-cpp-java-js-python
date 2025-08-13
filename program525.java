//duplicate word display

//demo hello demo code hello india ppa lb hello
//demo hello

import java.util.*;

class program525
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
        
        for(String s : hobj.keySet())           //s: value
        {
            if(hobj.get(s) > 1)
            {
                System.out.println(s);
            }
        }
    }
}

