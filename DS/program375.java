
class node
{
    public int data;
    public node next;
}

class SinglyLL
{
    private node first;
    private int iCount;

    public SinglyLL()
    {
        System.out.println("Inside Constructor...!");
        first = null;
        iCount = 0;
    }

    public void InsertFirst(int no)
    {
        node newn = null;

        newn = new node();

        newn.data = no;
        newn.next = null;

        if(first == null)       //System.out.println(("LL is empty"));
        {
            first = newn;
        }
        else                    //System.out.println(("LL is contains one node"));
        {
            newn.next = first;
            first = newn;
        }
        iCount++;
        
    }

    public void InsertLast(int no)
    {
        node newn = null;
        node temp = null;

        newn = new node();

        newn.data = no;
        newn.next = null;

        if(first == null)       //System.out.println(("LL is empty"));
        {
            first = newn;
        }

        else                    //System.out.println(("LL is contains one node"));
        {
            temp = first;
            
            while(temp.next!= null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public void Display()
    {
        node temp = null;

        temp = first;
        while(temp != null)
        {
            System.out.print("| "+temp.data+ " | -> ");
            temp  = temp.next;
        }
        System.out.println("null");
    }

    public int Count()
    {
        return iCount;
    }

    public void DeleteFirst()
    {        
        if(first == null)                   //LL is empty
        {
            return;
        }
        else if(first.next == null)         //LL contains one node
        {
            first = null;
        }
        else                                //LL contains more that one node
        {
            first = first.next;
        }
        iCount--;
    }
    
    public void DeleteLast()
    {   
        node temp = null;

        if(first == null)                   //LL is empty
        {
            return;
        }
        else if(first.next == null)         //LL contains one node
        {
            first = null;
        }
        else                                //LL contains more that one node
        {
            temp = first;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
            temp.next = null;
        }
        iCount--;           
    }
}

class program375
{
    public static void main(String A[])
    {
        SinglyLL sobj = new SinglyLL();
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

        sobj.DeleteFirst();

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elments in the Linked list are : "+iRet);

        sobj.DeleteLast();

        sobj.Display();
        iRet = sobj.Count();

        System.out.println("Number of elments in the Linked list are : "+iRet);

    }
}