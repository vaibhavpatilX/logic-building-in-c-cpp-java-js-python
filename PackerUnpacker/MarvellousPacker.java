package MarvellousPackerUnPacker;

import java.util.*;
import java.io.*;

public class MarvellousPacker
{
    private String PackName;
    private String DirName;

    public MarvellousPacker(String A,String B)
    {
        this.PackName = A;          //strcpy(=) in cpp
        this.DirName = B;
    }

    public void PackingActivity()
    {
        try
        {
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("---------------------- Marvellous Packer UnPacker----------------------");
            System.out.println("-----------------------------------------------------------------------");
            System.out.println("--------------------------- Packing Activity --------------------------");
            System.out.println("-----------------------------------------------------------------------");

            int i = 0,j = 0,iRet = 0,iCountFile = 0;
         
            File fobj = new File(DirName);
            
            // Check the existance of Directory
            if((fobj.exists()) && (fobj.isDirectory()))
            {
                System.out.println(DirName+ " is Successfully opened..");

                File Packobj = new File(PackName);

                //Create a Packed File
                boolean bRet = Packobj.createNewFile();

                if(bRet = false)
                {
                    System.out.println("Unable to create a file");
                    return;
                }
                System.out.println("Packed File gets Successfully Created with name : "+PackName);

                //Retrived All files from Directory
                File Arr[] = fobj.listFiles();           //file class objects after that into Arr[]

                //*System.out.println("Number of Files in the "+DirName+" Directory are : "+Arr.length);

                //Packed File object
                FileOutputStream foobj = new FileOutputStream(Packobj);

                //Buffer for Read and Write Activity
                byte Buffer[] = new byte[1024];

                String Header = null;

                //Directory Traversal
                for(i=0;i < Arr.length;i++)
                {
                    Header = Arr[i].getName()+" "+Arr[i].length();

                    //Loop to form 100 bytes Header
                    for(j=Header.length();j<100;j++)
                    {
                        Header = Header + " ";
                    }
                    //write Header into packed file
                    
                    foobj.write(Header.getBytes());
                    
                    //Open file from directory for reading
                    FileInputStream fiobj = new FileInputStream(Arr[i]);

                    //write contents of file from packed file
                    while((iRet = fiobj.read(Buffer))!= -1)    
                    {
                        foobj.write(Buffer,0,iRet);
                        System.out.println("File Name Scanned is : "+Arr[i].getName());
                        System.out.println("File Size Read is : "+iRet);
                    }
                    fiobj.close();
                    iCountFile++;
                }
                
                System.out.println("Packing Activity Done..!");

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("-------------------------- Statistical Report -------------------------");
                System.out.println("-----------------------------------------------------------------------");
                
                //To be add
                System.out.println("Total files Packed : "+iCountFile);

                System.out.println("-----------------------------------------------------------------------");
                System.out.println("------------------- Thank you for using Application -------------------");
                System.out.println("-----------------------------------------------------------------------");
            }
            else
            {
                System.out.println("There is no such directory..");
            }
        } // End of try block
        catch(Exception eobj)
        {}
    } // End of PackingActivity Function
} // End of Marvellous Packer Class
