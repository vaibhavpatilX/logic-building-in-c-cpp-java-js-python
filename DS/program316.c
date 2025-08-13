// Singly Linear Linked List
// |11| ->|21| ->|51| ->|101| ->NULL

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

int main()
{
    PNODE head = NULL;

    PNODE newn1 = NULL;
    PNODE newn2 = NULL;
    PNODE newn3 = NULL;

    newn1 = (struct node *)malloc(sizeof(struct node));
    newn2 = (struct node *)malloc(sizeof(struct node));
    newn3 = (struct node *)malloc(sizeof(struct node));

    return 0;
}