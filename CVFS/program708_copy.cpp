#include<stdio.h>
#include<stdlib.h>
#include<string .h>
#include<unistd.h>

#include<iostream>
using namespace std;

struct BootBlock
{
    char Information[100];
};

struct SuperBlock
{


};
typedef struct Inode
{

    char FileName[50];
    int InodeNumber;
    int FileSize;
    int ActualFileSize;
    int TextFile;
    int ReferenceCount;
    int LinkCount;
    int Permission;

    char *Buffer[];
    struct Inode *next;
}INODE,*PINODE,**PPINODE;

int main()
{

    return 0;
}