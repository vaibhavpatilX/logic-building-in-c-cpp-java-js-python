// Singly Linear Linked List
// |11| ->|21| ->|51| ->|101| ->NULL

#include<stdio.h>

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
    struct node *head = NULL;

    return 0;
}