#include<iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
};

class StackX
{
    private:
        struct node *first;
        int iCount;

    public:
        StackX();
        void Push(int);
        int Pop();
        void Display();
        int Count();
};

StackX :: StackX()
{
    first = NULL;
    iCount = 0;
}

void StackX :: Push(int no) // InsertFirst
{
    struct node * newn = NULL;

    newn = new node;

    newn->data = no;
    newn->next = NULL;

    newn->next = first;
    first = newn;

    iCount++;
}

int StackX :: Pop()         // DeleteFirst
{
    struct node *temp = NULL;
    int value = 0;

    if(first == NULL)
    {
        cout<<"Unable to pop as stack is empty\n";
        return NULL;
    }
    else
    {
        temp = first;
        value = temp->data;

        first = first -> next;
        delete temp;

        iCount--;

        return value;
    }
}

void StackX :: Display()
{
    struct node *temp = NULL;

    temp = first;

    while(temp != NULL)
    {
        cout<<"| "<<temp->data<<" |-";
        temp = temp->next;
    }
    cout<<"\n";
}

int StackX :: Count()
{
    return iCount;
}

int main()
{
    StackX * sobj = new StackX();
    int iRet = 0;

    sobj->Push(51);
    sobj->Push(21);    
    sobj->Push(11);

    sobj->Display();
    iRet = sobj->Count();

    cout<<"Number of elements from the stack : "<<iRet<<"\n";

    iRet = sobj->Pop();
    cout<<"Poped element is : "<<iRet<<"\n";

    iRet = sobj->Pop();
    cout<<"Poped element is : "<<iRet<<"\n";
    
    sobj->Display();
    iRet = sobj->Count();

    cout<<"Number of elements from the stack : "<<iRet<<"\n";

    delete sobj;
    
    return 0;
}