#include<stdio.h>
#include<stdlib.h>

struct node
{
    int data;
    struct node *next;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void InsertFirst(PPNODE first, PPNODE last, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    
    newn->data = no;
    newn->next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;

        (*last) -> next = *first;
    }
    else
    {
        newn->next = *first;
        *first = newn;

        (*last) -> next = *first;
    }
}

void InsertLast(PPNODE first, PPNODE last, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));
    
    newn->data = no;
    newn->next = NULL;

    if(*first == NULL && *last == NULL)
    {
        *first = newn;
        *last = newn;

        (*last) -> next = *first;
    }
    else
    {
        (*last)->next = newn;
        *last = newn;

        (*last) -> next = *first;
    }
}

void InsertAtPos(PPNODE first, PPNODE last, int no, int pos)
{}

void DeleteFirst(PPNODE first, PPNODE last)
{}

void DeleteLast(PPNODE first, PPNODE last)
{}

void DeleteAtPos(PPNODE first, PPNODE last, int pos)
{}

void Display(PNODE first, PNODE last)
{
    if(first == NULL && last == NULL)
    {
        return;
    }

    do
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
    } while (first != last -> next);
    
    printf("\n");
}

int Count(PNODE first, PNODE last)
{
    int iCount = 0;

    if(first == NULL && last == NULL)
    {
        return iCount;
    }

    do
    {
        iCount++;
        first = first -> next;
    } while (first != last -> next);

    return iCount;
}

int main()
{
    PNODE head = NULL;
    PNODE tail = NULL;

    int iRet = 0;

    InsertFirst(&head,&tail,51);
    InsertFirst(&head,&tail,21);
    InsertFirst(&head,&tail,11);
    
    InsertLast(&head,&tail,101);
    InsertLast(&head,&tail,111);
    InsertLast(&head,&tail,121);
    
    Display(head,tail);

    iRet = Count(head,tail);

    printf("Number of elements are : %d\n",iRet);

    return 0;
}