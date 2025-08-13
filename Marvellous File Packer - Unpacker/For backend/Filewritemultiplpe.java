import java.io.*;  
class Filewritemultiplpe
{  
 public static void main(String args[])throws Exception
{  
  FileOutputStream fout1=new FileOutputStream("f1.txt");  
  FileOutputStream fout2=new FileOutputStream("f2.txt");  
  
  ByteArrayOutputStream bout=new ByteArrayOutputStream();  
  Byte b = 'a';
  bout.write(b);  
  bout.writeTo(fout1);  
  bout.writeTo(fout2);  
  
  bout.flush();  
  System.out.println("success...");  
 }  
} 