///////////////////////////////////////////////////////
//
//  File name :     program2.c
//  Descreption :   Used to calculate percentage
//  Author :        Piyush Manohar Khairnar
//  Date :          28/04/2025
//
///////////////////////////////////////////////////////

#include<stdio.h>

int main()
{
    int Total = 400;
    int Obtained = 320;
    float Percentage = 0.0f;

    Percentage = (Obtained / Total) * 100;

    printf("Percentage is : %f\n",Percentage);
    
    return 0;
}