#include<stdio.h>
#include<stdlib.h>
#include<fcntl.h>
#include<unistd.h>
#include<string.h>

int main()
{
    char Fname[50] = {'\0'};
    int fd = 0,iRet = 0;
    char Buffer[] = "India is my Country";

    printf("Enter the file name that you want to open : ");
    scanf("%s",Fname);

    fd = open(Fname,O_RDWR);
    
    if(fd == -1)
    {
        printf("Unable to open file\n");
    }
    else
    {
        printf("File is successfully opened with fd : %d\n",fd);
        
        iRet = write(fd,Buffer,strlen(Buffer));

        printf("%d bytes gets written successfully\n",iRet);

        close(fd);
    }
    return 0;
}