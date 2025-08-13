#include<stdio.h>
#include<unistd.h>
#include<fcntl.h>

int main()
{

    int fd = 0;

    fd = creat("Demo.txt",0777);          //re   wr

    return 0;
}