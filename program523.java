
//Word count

import java.util.*;

class program523
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
        int MaxIndex = 0;

        for(int i = 0;i< tokens.length;i++)
        {
            System.out.println(tokens[i]+ " : "+tokens[i].length());
            if(iMax < tokens[i].length())
            {
                iMax = tokens[i].length();
                MaxIndex = i;
            }
            
        }
        System.out.println("Maximum length of : "+tokens[MaxIndex]+" is : "+iMax);
    }
}

