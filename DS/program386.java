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

class program386
{
    public static void main(String A[])
    {

        StackX<Integer> sobj1 = new StackX<>();  //StackX sobj<int> = new StackX<>();
        int iRet = 0;

        sobj1.push(10);
        sobj1.push(20);
        sobj1.push(30);
        sobj1.push(40);
        sobj1.push(50);        
        
        sobj1.Display();

        iRet = sobj1.Count();

        System.out.println("Number of elements in the Stack are : "+iRet);

        iRet = sobj1.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        iRet = sobj1.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        iRet = sobj1.pop();
        System.out.println("popped element from the Stack is : "+iRet);

        sobj1.Display();
        iRet = sobj1.Count();
        System.out.println("Number of elements in the Stack are : "+iRet);

///////////////////////////////////////////////////////////////////////////////////////////////////

        StackX<String> sobj2 = new StackX<>();  //StackX sobj<int> = new StackX<>();
        String str = null;

        sobj2.push("C");
        sobj2.push("C++");
        sobj2.push("Java");
        sobj2.push("Python");
        sobj2.push("Javascript");        
        
        sobj2.Display();

        iRet = sobj2.Count();

        System.out.println("Number of elements in the Stack are : "+iRet);

        str = sobj2.pop();
        System.out.println("popped element from the Stack is : "+str);

        str = sobj2.pop();
        System.out.println("popped element from the Stack is : "+str);

        str = sobj2.pop();
        System.out.println("popped element from the Stack is : "+str);

        sobj2.Display();
        iRet = sobj2.Count();
        System.out.println("Number of elements in the Stack are : "+iRet);

    }
}
