///////////////////////////////////////////////////////////////////////////////
//
//      Header Files inclusion
//
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>      //platform specific
#include<string.h>

#include<iostream>
using namespace std;
///////////////////////////////////////////////////////////////////////////////
//
//      User Defined Macros
//
///////////////////////////////////////////////////////////////////////////////

# define MAXFILESIZE 100

# define MAXINODE 5     //Max files

# define READ 1
# define WRITE 2
# define EXECUTE 4

# define REFULARFILE 1      //Inproject considering .txt file
# define SPECIALFILE 1      

# define START 0
# define CURRENT 1
# define END 2

///////////////////////////////////////////////////////////////////////////////
//
//      Structure name : BootBlock
//      Description : Holds information to boot the Operating System
//
///////////////////////////////////////////////////////////////////////////////

struct BootBlock      //in Actual OS 1 KB size
{
    char Information[100];

};           

///////////////////////////////////////////////////////////////////////////////
//
//      Structure name : SuperBlock
//      Description : Holds information about the File system
//
///////////////////////////////////////////////////////////////////////////////

struct SuperBlock
{
    int TotalInodes;
    int FreeInodes;

};           

///////////////////////////////////////////////////////////////////////////////
//
//      Structure name : Inode
//      Description : Holds information about the File 
//
///////////////////////////////////////////////////////////////////////////////

typedef struct Inode 
{
    char FileName[50];          //due to no Directory name
    int InodeNumber;
    int FileSize;
    int ActualFileSize;
    int TextFile;
    int ReferenceCount;
    int LinkCount;
    int Permission;     

    char *Buffer;
    struct Inode *next;
}INODE, *PINODE,**PPINODE;


///////////////////////////////////////////////////////////////////////////////
//
//      Structure name : FileTable
//      Description : Holds information about the opened File 
//
///////////////////////////////////////////////////////////////////////////////

typedef struct FileTable
{
    int ReadOffset;
    int WriteOffset;
    int Count;
    int Mode;

    PINODE ptrinode;           //

}FILETABLE, *PFILETABLE;

///////////////////////////////////////////////////////////////////////////////
//
//      Structure name : UAREA
//      Description : Holds information about the process
//
///////////////////////////////////////////////////////////////////////////////

struct UAREA
{
    char ProcessName[50];
    PFILETABLE UFDT[MAXINODE];
};

///////////////////////////////////////////////////////////////////////////////
//
//      Description : Global Variables or objects used in this project
//
///////////////////////////////////////////////////////////////////////////////

SuperBlock superobj;
PINODE head = NULL;
UAREA uareaobj;
BootBlock bootobj;

///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   IntializeSuperblock
//  Description     :   It is used to initialize the contents of super block
//  Author          :   Vaibhav Patil
//  Date            :   10/08/2025
///////////////////////////////////////////////////////////////////////////////

void IntializeSuperblock()
{
    superobj.TotalInodes = MAXINODE;
    superobj.FreeInodes = MAXINODE;
    
    cout<<"My CVFS : Super Block intialised Successfully\n";

}


///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   CreateDILB
//  Description     :   It is used to create Linked List of Inodes
//  Author          :   Vaibhav Patil
//  Date            :   10/08/2025
///////////////////////////////////////////////////////////////////////////////

void CreateDILB()
{
    int i = 1;
    PINODE newn = NULL;
    PINODE temp = head;

    while(i <= MAXINODE)
    {
        newn = new INODE;

        newn -> InodeNumber = i;
        newn -> FileSize = 0;
        newn -> ActualFileSize = 0;     
        newn -> LinkCount = 0;
        newn -> Permission = 0;
        newn -> Buffer = NULL;
        newn -> next = NULL;

        if(temp == NULL)
        {
            head = newn;
            temp = head;
        }
        else                //like InsertLast
        {
            temp -> next = newn;
            temp = temp -> next;
        }

        i++;
    }
    
    cout<<"My CVFS : DILB created Successfully\n";
}

///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   StartAuxilaryDataInitialisation
//  Description     :   It is used to initialize the Auxilary Data
//  Author          :   Vaibhav Patil
//  Date            :   10/08/2025
///////////////////////////////////////////////////////////////////////////////

void StartAuxilaryDataInitialisation()
{
    
    strcpy(bootobj.Information,"Boot Process of Operating System Done..!");
    
    cout<<bootobj.Information<<"\n";

    IntializeSuperblock();

    CreateDILB();

    cout<<"My CVFS : Auxilary data intialised Successfully..!\n";

}

///////////////////////////////////////////////////////////////////////////////
//
//      Entry point function of project (main)
//
///////////////////////////////////////////////////////////////////////////////

int main()
{
    StartAuxilaryDataInitialisation();

    return 0;
}