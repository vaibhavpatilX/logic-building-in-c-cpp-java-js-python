#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0,iRet = 0;
    char Buffer[50] = {'\0'};

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = open(Fname, O_RDONLY );     //Change here Append
    
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File is successfully opened with fd : %d\n",fd);
        
        iRet = read(fd,Buffer,11);

        printf("%d bytes gets read successfully\n",iRet);

        printf("Data from file is %s\n",Buffer);
        close(fd);
    }
    return 0;
}