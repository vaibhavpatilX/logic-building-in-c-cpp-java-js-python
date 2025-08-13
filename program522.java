
//Word count

import java.util.*;

class program522
{
    public static void main(String A[])
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the String : ");
        String str = sobj.nextLine();

        str = str.trim();
        str = str.replaceAll("\\s+"," ");
        
        String tokens[] = str.split(" ");
        
        int iMax = tokens[0].length();
        String Maxstr = null;

        for(int i = 0;i< tokens.length;i++)
        {
            System.out.println(tokens[i]+ " : "+tokens[i].length());
            if(iMax < tokens[i].length())
            {
                iMax = tokens[i].length();
                Maxstr = tokens[i];
            }
            
        }
        System.out.println("Maximum length of : "+Maxstr+" is : "+iMax);
    }
}

