///////////////////////////////////////////////////////
//
//  File name :     program52.c
//  Descreption :   Accept Input and Display  
//  Author :        Vaibhav
//  Date :          20/05/2025
//
///////////////////////////////////////////////////////


#include<stdio.h>

int main()
{
    char Arr[50];
    int iAge = 0;
    float fMarks = 0.0f;

    printf("Enter your name: ");
    scanf("%[^\n]s",&Arr);

    //scanf("%c",&Arr)

    printf("Enter your Age: ");
    scanf("%d",&iAge);

    printf("Enter your marks: ");
    scanf("%f",&fMarks);

    printf("Name is: %s\n",Arr);
    printf("Age is: %d\n",iAge);
    printf("Marks is: %.2f\n",fMarks);
    
    return 0;
}