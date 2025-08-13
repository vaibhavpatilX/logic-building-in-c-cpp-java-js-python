import java.io.*;  
class Filewrite
{  
public static void main(String args[])
{  
	try
	{  
     	FileOutputStream fout=new FileOutputStream("demo.txt");  
     	String s="Marvellous Infosystems";  
     	byte b[]=s.getBytes();//converting string into byte array  
     	fout.write(b);  
     	fout.close();  
     	System.out.println("success...");  
	}
	catch(Exception e){System.out.println(e);}  
}  
} 