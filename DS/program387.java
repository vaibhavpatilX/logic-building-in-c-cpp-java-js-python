//Queue
class node<T>
{
    public T data;
    public node<T> next;
}

class QueueX<T>            //Queue might be is in built-in java.util
{
    private node<T> first;
    private int iCount;

    public QueueX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void enqueue(T no)        //InsertLast
    {
        node<T> newn = new node<T>();       //Change $
        node<T> temp = null;

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

    public T dequeue()        //DeleteFirst
    {
        node<T> temp = first;

        if(this.first == null)          //Queue is empty
        {
            System.out.println("Unable to dequeue as Queue is empty");
            return null;
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
        node<T> temp = null;

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

class program387
{
    public static void main(String A[])
    {
        QueueX<Double> sobj = new QueueX<>();
        int iRet = 0;
        double dRet = 0.0;

        sobj.enqueue(10.0);
        sobj.enqueue(20.0);
        sobj.enqueue(30.0);
        sobj.enqueue(40.0);
        sobj.enqueue(50.0);        
        
        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elements in the Queue are : "+iRet);

        dRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+iRet);

        dRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+iRet);

        dRet = sobj.dequeue();
        System.out.println("removed element from the Queue is : "+iRet);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Queue are : "+iRet);

    }
}
