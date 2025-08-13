//Queue
class node
{
    public char data;
    public node next;
}

class QueueX            //Queue might be is in built-in java.util
{
    private node first;
    private int iCount;

    public QueueX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void enqueue(char no)        //InsertLast
    {
        node newn = new node();       //Change $
        node temp = null;

        newn.data = no;
        newn.next = null;

        if(this.first == null)
        {
            this.first = newn;
        }
        else
        {
            temp = this.first;

            while(temp.next != null)
            {
                temp = temp.next;
            }
            temp.next = newn;
        }
        iCount++;
    }

    public char dequeue()        //DeleteFirst
    {
        node temp = first;

        if(this.first == null)          //Queue is empty
        {
            System.out.println("Unable to dequeue as Queue is empty");
            return (char)-1;            //typecasting- 
        }
        else
        {
            first = first.next;
            iCount--;
            return temp.data;
        }
    }

    public void Display()
    {
        node temp = null;

        temp = this.first;

        while(temp != null)
        {
            System.out.print("| "+temp.data+" | -");
            temp = temp.next;   
        }
        System.out.println();
    }

    public int Count()
    {
        return iCount;
    }
}

class program383
{
    public static void main(String A[])
    {
        QueueX sobj = new QueueX();
        int iRet = 0;
        char cRet = '\0';

        sobj.enqueue('A');
        sobj.enqueue('B');
        sobj.enqueue('C');
        sobj.enqueue('D');
        sobj.enqueue('E');        
        
        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elements in the Queue are : "+iRet);

        cRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+cRet);

        cRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+cRet);

        cRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+cRet);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Queue are : "+iRet);

        
    }
}
