#include<iostream>
using namespace std;

struct node
{
    int data;
    struct node *next;
    struct node *prev;
};

typedef struct node NODE;
typedef struct node* PNODE;

class DoublyCLL
{
    private:
        PNODE first;
        PNODE last;
        int iCount;

    public:
        DoublyCLL();

        void Display();
        int Count();

        void InsertFirst(int);
        void InsertLast(int);
        void InsertAtPos(int,int);
        
        void DeleteFirst();
        void DeleteLast();
        void DeleteAtPos(int);
};

DoublyCLL :: DoublyCLL()
{

}

int main()
{
    DoublyCLL dobj;

    return 0;
}