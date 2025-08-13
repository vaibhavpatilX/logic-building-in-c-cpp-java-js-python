#include<iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

class SinglyCLL
{
    private:
        PNODE first;
        PNODE last;
        int iCount;

    public:
        SinglyCLL()
        {
            cout<<"Inside constructor of SinglyCLL\n";

            this->first = NULL;
            this->last = NULL;
            this->iCount = 0;
        }

        void InsertFirst(int no)
        {
            PNODE newn = NULL;

            newn = new NODE;

            newn->data = no;
            newn->next = NULL;

            if(first == NULL && last == NULL)   // if(iCount == 0)
            {
                first = newn;
                last = newn;

                last->next = first;
            }
            else
            {
                newn->next = first;
                first = newn;

                last->next = first;
            }

            iCount++;
        }

        void InsertLast(int no)
        {
            PNODE newn = NULL;

            newn = new NODE;

            newn->data = no;
            newn->next = NULL;

            if(first == NULL && last == NULL)   // if(iCount == 0)
            {
                first = newn;
                last = newn;

                last->next = first;
            }
            else
            {
                last->next = newn;
                last = newn;

                last->next = first;
            }

            iCount++;
        }

        void DeleteFirst()
        {
            if(first == NULL && last == NULL)
            {
                return;
            }
            else if(first == last)
            {
                delete first;

                first = NULL;
                last = NULL;
            }
            else
            {
                first = first -> next;
                delete last->next;

                last->next = first;
            }
            iCount--;
        }

        void DeleteLast()
        {
            PNODE temp = NULL;

            if(first == NULL && last == NULL)
            {
                return;
            }
            else if(first == last)
            {
                delete first;

                first = NULL;
                last = NULL;
            }
            else
            {
                temp = first;

                while(temp -> next != last)
                {
                    temp = temp -> next;
                }

                delete last;
                last = temp;

                last->next = first;
            }
            iCount--;
        }

        void Display()
        {
            if(first == NULL && last == NULL)
            {
                return;
            }

            PNODE temp = first;

            do
            {
                cout<<"| "<<temp->data<<" | -> ";
                temp = temp -> next;
            } while (temp != last ->next);
            
            cout<<"\n";
        }

        int Count()
        {
            return iCount;
        }

        void DeleteAtPos(int pos)
        {
            PNODE temp = NULL;
            PNODE target = NULL;
            
            int i = 0;
            
            if(pos < 1 || pos > iCount)
            {
                cout<<"Invalid position\n";
                return;
            }

            if(pos == 1)
            {
                DeleteFirst();
            }
            else if(pos == iCount)
            {
                DeleteLast();
            }
            else
            {
                temp = first;

                for(i = 1; i < pos-1; i++)
                {
                    temp = temp -> next;
                }

                target = temp -> next;

                temp->next = target->next;
                delete target;

                iCount--;
            }
        }

        void InsertAtPos(int no, int pos)
        {
            PNODE temp = NULL;
            PNODE newn = NULL;

            int i = 0;

            if(pos < 1 || pos > iCount+1)
            {
                cout<<"Invalid position\n";
                return;
            }

            if(pos == 1)
            {
                InsertFirst(no);
            }
            else if(pos == iCount+1)
            {
                InsertLast(no);
            }
            else
            {
                newn = new NODE;

                newn->data = no;
                newn->next = NULL;

                temp = first;

                for(i = 1; i < pos -1; i++)
                {
                    temp = temp -> next;
                }

                newn->next = temp -> next;
                temp->next = newn;

                iCount++;
            }
        }
};

int main()
{
    SinglyCLL sobj;
    int iRet = 0;

    sobj.InsertFirst(51);
    sobj.InsertFirst(21);
    sobj.InsertFirst(11);
    
    sobj.InsertLast(101);
    sobj.InsertLast(111);
    sobj.InsertLast(121);
    
    sobj.InsertAtPos(105,5);

    sobj.Display();
    
    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<"\n";

    sobj.DeleteAtPos(5);

    sobj.Display();
    
    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<"\n";

    sobj.DeleteFirst();

    sobj.Display();
    
    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<"\n";

    sobj.DeleteLast();

    sobj.Display();
    
    iRet = sobj.Count();

    cout<<"Number of elements are : "<<iRet<<"\n";

    return 0;
}