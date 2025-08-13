
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
}

class program373
{
    public static void main(String A[])
    {
        SinglyLL sobj = new SinglyLL();

        sobj.InsertFirst(51);
        sobj.InsertFirst(21);
        sobj.InsertFirst(11);

        sobj.InsertLast(101);
        sobj.InsertLast(111);
        sobj.InsertLast(121);
    }
}