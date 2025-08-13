//Stack
class node<T>
{
    public T data;
    public node<T> next;
}

class StackX<T>            //Stack is in built in java.util
{
    private node<T> first;
    private int iCount;

    public StackX()
    {
        this.first = null;
        this.iCount = 0;
    }

    public void push(T no)        //InsertFirst
    {
        node<T> newn = new node<T>();       //Change $ node newn = new node();
        
        newn.data = no;
        newn.next = null;

        newn.next = first;
        this.first = newn;

        iCount++;   
    }

    public T pop()  //<T>        //DeleteFirst
    {
        node<T> temp = first;

        if(this.first == null)          //Stack is empty
        {
            System.out.println("Unable to pop as Stack is empty");
            return null;            // -1 error     typecasting- (T)-1
        }
        else
        {
            this.first = first.next;
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
            System.out.println("| "+temp.data+" |");
            temp = temp.next;   
        }
    }
 
    public int Count()
    {
        return iCount;
    }
}

class program384
{
    public static void main(String A[])
    {

    /*    StackX sobj = new StackX();
        int iRet = 0;

        sobj.push(10);
        sobj.push(20);
        sobj.push(30);
        sobj.push(40);
        sobj.push(50);        
        
        sobj.Display();

        iRet = sobj.Count();

        System.out.println("Number of elements in the Stack are : "+iRet);

        iRet = sobj.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        iRet = sobj.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        iRet = sobj.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        sobj.Display();
        iRet = sobj.Count();
        System.out.println("Number of elements in the Stack are : "+iRet);*/
    }
}
