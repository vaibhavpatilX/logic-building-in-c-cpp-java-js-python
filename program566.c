//B.S.T

#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

struct node
{
    int data;
    struct node *lchild;
    struct node *rchild;
};

typedef struct node NODE;
typedef struct node * PNODE;
typedef struct node ** PPNODE;

void Insert(PPNODE first,int no)
{
    PNODE newn = NULL;
    PNODE temp = NULL;

    newn = (PNODE)malloc(sizeof(NODE));

    newn -> data = no;
    newn -> lchild = NULL;
    newn -> rchild = NULL;

    if(*first == NULL)          //B.S.T is empty
    {
        *first = newn;
    }
    else                        //B.S.T contains atleast one node
    {
        temp = *first;

        while(1)
        {
            if(no == temp -> data)
            {
                printf("Duplicate Element : Unable to insert node\n");
                free(newn);
                break;
            }
            else if(no > temp -> data)              //rchild
            {   
                if(temp -> rchild == NULL)
                {
                    temp -> rchild = newn;
                    break;
                }
                temp = temp -> rchild;
            }
            else if(no < temp -> data)              //lchild
            {
                if(temp -> lchild == NULL)
                {
                    temp -> lchild = newn;
                    break;
                }
                temp = temp -> lchild;
            }
        }
    }

}

void Inorder(PNODE first)   
{
    if(first != NULL)
    {
        Inorder(first->lchild);
        printf("%d\t",first -> data);
        Inorder(first->rchild);
    }
}

void Preorder(PNODE first)   
{
    if(first != NULL)
    {
        printf("%d\t",first -> data);
        Preorder(first->lchild);
        Preorder(first->rchild);
    }
}

void Postorder(PNODE first)   
{
    if(first != NULL)
    {
        Postorder(first->lchild);
        Postorder(first->rchild);
        printf("%d\t",first -> data);

    }
}
bool Search(PNODE first,int no)
{
    bool bFlag = false;

    while(first != NULL)
    {
        if(no == first->data)
        {
            bFlag = true;
            break;
        }
        else if(no > first->data)       //rchild
        {
            first = first -> rchild;
        }
        else if(no < first->data)       //lchild
        {
            first = first -> lchild;
        }
    }
    return bFlag;
}
int main()
{
    PNODE head = NULL;      //root
    bool bRet = false;

    Insert(&head,11);           //root node -> 11
    Insert(&head,9);
    Insert(&head,25);
    Insert(&head,7);
    Insert(&head,35);
    Insert(&head,10);
    Insert(&head,15);
    Insert(&head,21);

    bRet = Search(head,36);

    if(bRet == true)
    {
        printf("Element is Present..!\n");
    }
    else
    {
        printf("There is no such Element..!\n");
    }

    return 0;
}