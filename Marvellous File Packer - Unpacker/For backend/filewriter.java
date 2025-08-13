    import java.io.*;  
    class filewriter
    {  
     public static void main(String args[])
     {  
      try
     {  
        FileReader fr=new FileReader("f1.txt");  
  int i;  
  while((i=fr.read())!=-1)  
  System.out.println((char)i);   
      }
      catch(Exception e){System.out.println(e);}  
      System.out.println("success");  
     }  
    }  