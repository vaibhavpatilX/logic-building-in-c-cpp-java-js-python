//main project file
///////////////////////////////////////////////////////////////////////////////
//
//      Header Files inclusion
//
///////////////////////////////////////////////////////////////////////////////

#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>      //platform specific
#include<string.h>
#include<stdbool.h>

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
//      User Defined Macros for ERROR HANDLING
//
///////////////////////////////////////////////////////////////////////////////

# define ERR_INVALID_PARAMETER -1
# define ERR_NO_INODES -2
# define ERR_FILE_INVALID_EXISTS -3

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
    int FileType;
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
//  Function Name   :   IntializeUAREA
//  Description     :   It is used to initialize the contents of UAREA
//  Author          :   Vaibhav Patil
//  Date            :   10/08/2025
//
///////////////////////////////////////////////////////////////////////////////

void IntializeUAREA()
{
    strcpy(uareaobj.ProcessName,"Myexe");

    int i = 0;

    while (i < MAXINODE)
    {
        uareaobj.UFDT[i] = NULL;
        i++;

    }
    cout<<"My CVFS : UAREA intialised Successfully\n";

}

///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   IntializeSuperblock
//  Description     :   It is used to initialize the contents of super block
//  Author          :   Vaibhav Patil
//  Date            :   10/08/2025
//
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
//
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
//
///////////////////////////////////////////////////////////////////////////////

void StartAuxilaryDataInitialisation()
{
    strcpy(bootobj.Information,"Boot Process of Operating System Done..!");

    cout<<"------------------------------------------------------------------------\n";
    cout<<bootobj.Information<<"\n";
    cout<<"------------------------------------------------------------------------\n";

    IntializeSuperblock();

    CreateDILB();

    IntializeUAREA();

    cout<<"My CVFS : Auxilary data intialised Successfully..!\n";

}

///////////////////////////////////////////////////////////////////////////////
//
//      Entry point function of project (main)
//
///////////////////////////////////////////////////////////////////////////////


///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   DisplayHelp
//  Description     :   It is used to display the information about commands
//  Author          :   Vaibhav Patil
//  Date            :   11/08/2025
//
///////////////////////////////////////////////////////////////////////////////

void DisplayHelp()
{
    printf("------------------------------------------------------------------------\n");
    printf("----------------------- Command Manual of My CVFS ----------------------\n");
    printf("------------------------------------------------------------------------\n");

    printf("exit : It is used to terminate the shell of My CVFS\n");
    printf("clear : It is used to clear th console of My CVFS\n");
    
    //Add more options here
    printf("------------------------------------------------------------------------\n");

}

///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   ManPage
//  Description     :   It is used to manual page of the command
//  Input           :   It accepts the command name
//  Output          :   Displays the manual details of the command
//  Author          :   Vaibhav Patil
//  Date            :   11/08/2025
//
///////////////////////////////////////////////////////////////////////////////

void ManPage(
                char *name      //Name of comand
            )
{
    if(stricmp(name,"creat") == 0)
    {
        printf("Description : This command is used to create new regular file on our file system\n");

        printf("Usage : creat File_Name Permission\n");
        printf("File_Name : The name of file you want to create\n");
        printf("Permissions : \n\t1 : Read  \n\t2 : Write  \n\t3 : Read + Write\n");
    }
    else if(stricmp(name,"exit") == 0)
    {
        printf("Description : This command is used to terminate the My CVFS\n");

        printf("Usage : exit\n");
    }
    //Add more options here
    else
    {
        printf("No manual entry for %s\n",name);
    }
}

///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   IsFileExists
//  Description     :   It is used to check wheather given file name is exist or not
//  Input           :   It accepts the file name
//  Output          :   It returns the boolean value    (True : if present , False: if not present)
//  Author          :   Vaibhav Patil
//  Date            :   11/08/2025
//
///////////////////////////////////////////////////////////////////////////////

bool IsFileExists(
                    char *name         //Name of file that we want to check
                )
{
    PINODE temp = head;
    bool bFlag = false;

    while(temp != NULL)
    {
        if((stricmp(name,temp -> FileName) == 0) && (temp -> FileType) == REFULARFILE)
        {
            bFlag = true;
            break;
        }
        temp = temp -> next;
    }

    return bFlag;
}
///////////////////////////////////////////////////////////////////////////////
//  
//  Function Name   :   CreateFile
//  Description     :   It is used to create a new  regular file
//  Input           :   It accepts the file name
//  Output          :   It returns the file descriptor
//  Author          :   Vaibhav Patil
//  Date            :   11/08/2025
//
///////////////////////////////////////////////////////////////////////////////

int CreateFile(
            char *name,         //Name of file
            int permission      //Permission to create a file
        )
{
    //Filtre
    PINODE temp = NULL;
    int i = 0;

    //If filename is missing
    if(name == NULL)
    {
        return ERR_INVALID_PARAMETER;
    }
    //If entered permission is invalid
    if(permission < 1 || permission > 3)
    {
        return ERR_INVALID_PARAMETER;
    }

    //Check wheather empty inode is there or not
    if(superobj.FreeInodes == 0)
    {
        return ERR_NO_INODES;
    }

    //Check wheather File is already exist or not
    if(IsFileExists(name) == true)
    {
        return ERR_FILE_INVALID_EXISTS;
    }

    //Loop to search free Inode
    while(temp != NULL)
    {
        if(temp -> FileType == 0)
        {
            break;
        }
        temp = temp -> next;
    }

    // Inode not found
    if(temp == NULL)
    {
        printf("Inode not found\n");
        return -1;
    }

    // Search first Non NULL value from UFDT

    for(i = 0;i<MAXINODE;i++)
    {
        if(uareaobj.UFDT[i] != NULL)
        {
            break;
        }
    }


    if(i == MAXINODE)
    {
        printf("Unable to create as MAX OPENED FILE LIMIT REACGED..!\n");
        return -1;      //Error code takaychay
    }

    // Alocate memory for FILETABLE
    uareaobj.UFDT[i] = (PFILETABLE)malloc(sizeof(FILETABLE));

    // Initialize elements of file table
    uareaobj.UFDT[i] -> ReadOffset = 0;
    uareaobj.UFDT[i] -> WriteOffset = 0;
    uareaobj.UFDT[i] -> Count = 1;
    uareaobj.UFDT[i] -> Mode = permission;

    // Connect File Table with IIT
    uareaobj.UFDT[i] -> ptrinode = temp;

    strcpy(uareaobj.UFDT[i] -> ptrinode -> FileName,name);
    uareaobj.UFDT[i] -> ptrinode -> FileSize,MAXFILESIZE;
    uareaobj.UFDT[i] -> ptrinode -> ActualFileSize = 0;
    uareaobj.UFDT[i] -> ptrinode -> FileType = REFULARFILE;
    uareaobj.UFDT[i] -> ptrinode -> ReferenceCount = 1;
    uareaobj.UFDT[i] -> ptrinode -> LinkCount = 1;
    uareaobj.UFDT[i] -> ptrinode -> Permission = permission;

    //Alocate memory for Buffer

    uareaobj.UFDT[i] -> ptrinode -> Buffer  = (char *)malloc(MAXFILESIZE);

    return i;
}
int main()
{
    fflush(stdin);

    char str[80] = {'\0'};       //Console(Cmd) max size limit : 80
    int iCount = 0;             //how much tokens(splits)
    int iRet = 0;
    char Command[5] [80];

    StartAuxilaryDataInitialisation();

    cout<<"------------------------------------------------------------------------\n";
    cout<<"--------------------- My CVFS Started Successfully ---------------------\n";
    cout<<"------------------------------------------------------------------------\n";

    //infinite listening loop
    while(1)
    {
        printf("\nMy CVFS > ");
        fgets(str,sizeof(str),stdin);    //special scanf()

        iCount = sscanf(str,"%s %s %s %s",Command[0],Command[1],Command[2],Command[3]);
        
        if(iCount == 1)
        {
            //My CVFS >  exit
            if(stricmp(Command[0],"exit") == 0)
            {
                printf("---------------- Thank you for using My CVFS..! ----------------\n");
                printf("Deallocating all resources..\n");

                break;  //for while loop
            }

            //My CVFS >  help

            else if(stricmp(Command[0],"help") == 0)
            {
                DisplayHelp();
            }

            // My CVFS > clear
            else if(stricmp(Command[0],"clear") == 0)
            {
                // system("clear");     //for macOS/Linux
                system("cls");          //stdlib.h
            }
        } // End of if iCount == 1
        
        else if(iCount == 2)
        {
            // My CVFS > man creat
            if(stricmp(Command[0],"man") == 0)
            {
                ManPage(Command[1]);
            }
        } // End of else if iCount == 2
        else if(iCount == 3)
        {
            // My CVFS > creat Ganesh.txt 3
            if(stricmp(Command[0],"creat") == 0)   
            {
                iRet = CreateFile(Command[1],atoi(Command[2]));         //atoi : ASCII to integer
            }
            
            if(iRet == ERR_INVALID_PARAMETER)
            {
                printf("Error : Invalid Parameters for the function\n");
                printf("Please check Man Page for more details\n");
            }
            else if(iRet == ERR_NO_INODES)
            {
                printf("Error : Unable to Create a file there is no INODES\n");
            }
            else if (iRet = ERR_FILE_INVALID_EXISTS)
            {
                printf("Error : Unable to create file as File is already existing..\n");
            }
            else
            {
                printf("File is Successfully created with FD : %d\n",iRet);
            }

        } // End of else if iCount == 3
        else if(iCount == 4)
        {
            
        } // End of else if iCount == 4
        else
        {
            printf("Command not found...\n");
            printf("Please refer Help option or use man command\n");

        } // End of Invalid command part
    
    }//End of while(Custom Shell)
    
    return 0;
} //End of main