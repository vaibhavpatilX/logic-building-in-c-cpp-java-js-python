
class node
{
    public int no;
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
}

class program372
{
    public static void main(String A[])
    {
        SinglyLL sobj = new SinglyLL();
    }
}