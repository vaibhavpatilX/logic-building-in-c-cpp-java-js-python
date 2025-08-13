#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{
    int fd = 0;
    char Fname[20] = {'\0'};

    printf("Enter the name of file that you want to open: ");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);          

    if(fd == -1)
    {
        printf("Unable to create file\n");
        return -1;
    }
    
    printf("File is successfully opened with FD %d..\n",fd);
    
    close(fd);
    
    return 0;
}