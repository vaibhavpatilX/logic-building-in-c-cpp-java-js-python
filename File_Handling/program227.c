#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[20] = {'\0'};

    printf("Enter the name of file : ");
    scanf("%s",Fname);

    fd = creat(Fname,0777);          //Permissions 0777

    if(fd == -1)
    {
        printf("Unable to create file\n");
        return -1;
    }
    
    printf("File is successfully created with FD %d..\n",fd);
    
    return 0;
}