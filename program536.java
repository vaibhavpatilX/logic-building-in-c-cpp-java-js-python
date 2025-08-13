
import java.util.*;

class Matrix
{
    private int Arr[][];

    public Matrix(int A,int B)
    {
        Arr = new int[A][B];
    }

    public void Accept()
    {
        System.out.println("Please enter the elements of matrix: ");
        
        Scanner sobj = new Scanner(System.in);

        int i = 0,j=0;

        for(i = 0;i < Arr.length;i++)
        {
            for(j=0;j < Arr[i].length;j++)
            {
                Arr[i][j] = sobj.nextInt();
            }
        }

    }

    public void Display()
    {
        System.out.println("Elements of the matrix are : ");
        
        int i = 0,j=0;

        for(i = 0;i < Arr.length;i++)
        {
            for(j=0;j < Arr[i].length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}

class program536
{
    public static void main(String A[])
    {
        Scanner sobj =new Scanner(System.in);

        System.out.println("Enter number of Rows : "); 
        int iRow = sobj.nextInt();
        
        System.out.println("Enter number of Columns : "); 
        int iCol = sobj.nextInt();

        Matrix mobj = new Matrix(iRow,iCol);

        mobj.Accept();

        mobj.Display();   
    }
}

