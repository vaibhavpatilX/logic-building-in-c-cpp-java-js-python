#include<iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
};

class QueueX
{
    private:
        struct node *first;
        int iCount;

    public:
        QueueX();
        void Enqueue(int);
        int Dequeue();
        void Display();
        int Count();
};

QueueX :: QueueX()
{
    first = NULL;
    iCount = 0;
}

void QueueX :: Enqueue(int no) // InsertLast
{
    struct node * temp = NULL;
    struct node * newn = NULL;
    
    newn = new node;

    newn->data = no;
    newn->next = NULL;

    if(first == NULL)
    {
        first = newn;
    }
    else
    {
        temp = first;

        while(temp->next != NULL)
        {
            temp = temp -> next;
        }

        temp->next = newn;
    }
    iCount++;
}

int QueueX :: Dequeue()         // DeleteFirst
{
    struct node *temp = NULL;
    int value = 0;

    if(first == NULL)
    {
        cout<<"Unable to remove as queue is empty\n";
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

void QueueX :: Display()
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

int QueueX :: Count()
{
    return iCount;
}

int main()
{
    QueueX * sobj = new QueueX();
    int iRet = 0;

    sobj->Enqueue(51);
    sobj->Enqueue(21);    
    sobj->Enqueue(11);

    sobj->Display();
    iRet = sobj->Count();

    cout<<"Number of elements from the queue : "<<iRet<<"\n";

    iRet = sobj->Dequeue();
    cout<<"Removed element is : "<<iRet<<"\n";

    iRet = sobj->Dequeue();
    cout<<"Removed element is : "<<iRet<<"\n";
    
    sobj->Display();
    iRet = sobj->Count();

    cout<<"Number of elements from the queue : "<<iRet<<"\n";

    delete sobj;
    
    return 0;
}