#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;          //self referencial structure

};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE first,int no)
{
    PNODE newn  = NULL;
    
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = no;
    newn -> next = NULL;

    if(*first == NULL)      //LL is empty
    {
        *first = newn;
    }
    else                    //LL is atleast 1 node
    {
        newn -> next = *first;          //if this not done then other addreses will gone so first link that and then initialize
        *first = newn;
    }
}

void InsertLast(PPNODE first,int no)
{
    PNODE newn  = NULL;
    
    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = no;
    newn -> next = NULL;

    if(*first == NULL)      //LL is empty
    {
        *first = newn;
    }
    else                    //LL is atleast 1 node
    {

    }
}

void Display(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
    }
    printf("NULL\n");
}

int Count(PNODE first)
{
    int iCount = 0;

    while(first != NULL)
    {
        iCount++;
        first = first -> next;
    }
    return iCount;
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,121);
    InsertFirst(&head,111);
    InsertFirst(&head,101);
    InsertFirst(&head,51);              //call by Address
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    Display(head);              //call by value

    iRet = Count(head);

    printf("Number of elements in Linked list are : %d\n",iRet);

    return 0;
}