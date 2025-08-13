import MarvellousPackerUnPacker.MarvellousUnpacker;
import java.util.*;
import java.io.*;

class program478
{
    public static void main(String A[])
    {
        try
        {
            Scanner sobj = new Scanner(System.in);
   
            System.out.println("Enter the name of file which contains Packed Data : ");        //all in one file
            String PackName = sobj.nextLine();

            MarvellousUnpacker mobj = new MarvellousUnpacker(PackName);

            mobj.UnpackingActivity();
        }
        catch(Exception eobj)
        {}
    } // End of main
} // End of program478 class