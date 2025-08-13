//Doubly Linear L

class node
{
    public int data;
    public node next;
    public node prev;
}

class DoublyLL
{
    private node first;
    private int iCount;

    public DoublyLL()
    {
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {}
    
    public void InsertLast(int no)
    {}

    public void InsertAtPos(int no,int pos)
    {}

    public void DeleteFirst()
    {}
    
    public void DeleteLast()
    {}

    public void DeleteAtPos(int pos)
    {}

    public void Display()
    {}

    public int Count()
    {
        return iCount;
    }
}

class program379
{
    public static void main(String A[])
    {
        DoublyLL sobj = new DoublyLL();
        int iRet = 0;

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);

        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elments in the Linked list are : "+iRet);

        sobj.InsertAtPos(105,5);

        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elments in the Linked list are : "+iRet);
        
        sobj.DeleteAtPos(5);

        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elments in the Linked list are : "+iRet);
    }
}