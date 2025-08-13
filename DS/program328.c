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

int main()
{
    PNODE head = NULL;
    int iRet = 0;

    InsertFirst(&head,51);
    InsertFirst(&head,21);
    InsertFirst(&head,11);
    
    Display(head);

    iRet = Count(head);

    printf("Number of elements are : %d\n",iRet);

    InsertLast(&head,101);
    InsertLast(&head,111);
    InsertLast(&head,121);
    
    Display(head);

    iRet = Count(head);

    printf("Number of elements are : %d\n",iRet);

    DeleteFirst(&head);

    Display(head);

    iRet = Count(head);

    printf("Number of elements are : %d\n",iRet);

    DeleteLast(&head);

    Display(head);

    iRet = Count(head);

    printf("Number of elements are : %d\n",iRet);

    return 0;
}