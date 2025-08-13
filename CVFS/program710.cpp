//Only for input accepting
#include<stdio.h>
#include<stdlib.h>
#include<unistd.h>      //platform specific
#include<string.h>

#include<iostream>
using namespace std;

int main()
{
    char str[80] = {'\0'};       //Console(Cmd) max size limit : 80
    int iCount = 0;             //how much tokens(splits)
    char Command[4] [80];

    cout<<"------------------------------------------------------------------------\n";
    cout<<"--------------------- My CVFS Started Successfully ---------------------\n";
    cout<<"------------------------------------------------------------------------\n";

    printf("\nMy CVFS > ");
    fgets(str,sizeof(str),stdin);    //special scanf()
    
    iCount = sscanf(str,"%s %s %s %s",Command[0],Command[1],Command[2],Command[3]);

    printf("Number of tokens are %d\n",iCount);
    
    return 0;
}