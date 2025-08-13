#include<stdio.h>
#include<stdlib.h>

typedef struct node
{
    int data;
    struct node *next;
}NODE, *PNODE, **PPNODE;

void InsertFirst(PPNODE first, int no)
{
    PNODE newn = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    newn->next = *first;
    *first = newn;
}

void InsertLast(PPNODE first, int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn->data = no;
    newn->next = NULL;

    if(*first == NULL)
    {
        *first = newn;
    }
    else
    {
        temp = *first;

        while(temp -> next != NULL)
        {
            temp = temp -> next;
        }

        temp -> next = newn;
    }
}

void Displayi(PNODE first)
{
    while(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
    }

    printf("NULL\n");
}

void DisplayR(PNODE first)
{
    if(first != NULL)
    {
        printf("| %d | -> ",first->data);
        first = first -> next;
        DisplayR(first);            // Tail Recursion
    }
}

//Reverse
void DisplayRX(PNODE first)
{
    if(first != NULL)
    {
        //first = first -> next;
        DisplayRX(first-> next);            // Head Recursion      //DisplayRX(first);

        printf("| %d | -> ",first->data);
    }
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

//Tail REcursion
int CountR(PNODE first)
{
    static int iCount = 0;

    if(first != NULL)
    {
        iCount++;
        first = first -> next;
        CountR(first);
    }

    return iCount;
}


void DeleteFirst(PPNODE first)
{
    PNODE temp = NULL;

    if(*first == NULL)                  // Empty LL
    {
        return;
    }
    else if((*first) -> next == NULL)    // Single node
    {
        free(*first);
        *first = NULL;
    }
    else                                // More than 1 node
    {
        temp = *first;
        
        *first = (*first) -> next;

        free(temp);
    }
}

void DeleteLast(PPNODE first)
{
    PNODE temp = NULL;
    
    if(*first == NULL)                  // Empty LL
    {
        return;
    }
    else if((*first) -> next == NULL)    // Single node
    {
        free(*first);
        *first = NULL;
    }
    else                                // More than 1 node
    {
        temp = *first;

        while(temp -> next -> next != NULL)
        {
            temp = temp -> next;
        }

        free(temp -> next);
        temp->next = NULL;
    }
}

void InsertAtPos(PPNODE first, int no, int pos)
{
    int iCount = 0, i = 0;
    PNODE temp = NULL;
    PNODE newn = NULL;
    
    iCount = Count(*first);

    if((pos < 1) || (pos > iCount+1))
    {
        printf("Invalid position\n");
        return;
    }

    if(pos == 1)
    {
        InsertFirst(first,no);
    }
    else if(pos == iCount+1)
    {
        InsertLast(first,no);
    }
    else
    {
        temp = *first;

        for(i = 1; i<= pos-2; i++)
        {
            temp = temp -> next;
        }

        newn = (PNODE)malloc(sizeof(NODE));

        newn->data = no;
        newn->next = NULL;

        newn->next = temp -> next;
        temp -> next = newn;
    }
}

void DeleteAtPos(PPNODE first, int pos)
{
    int iCount = 0, i = 0;
    PNODE temp = NULL;
    PNODE target = NULL;
    
    iCount = Count(*first);

    if((pos < 1) || (pos > iCount))
    {
        printf("Invalid position\n");
        return;
    }

    if(pos == 1)
    {
        DeleteFirst(first);
    }
    else if(pos == iCount)
    {
        DeleteLast(first);
    }
    else
    {
        temp = *first;

        for(i = 1; i<= pos-2; i++)
        {
            temp = temp -> next;
        }

        target = temp -> next;

        temp->next = target->next;  // temp->next = temp->next->next;
        free(target);
    }
}

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);

    DisplayRX(head);

    iRet = CountR(head);

    printf("Number of elements are : %d\n",iRet);

    return 0;
}