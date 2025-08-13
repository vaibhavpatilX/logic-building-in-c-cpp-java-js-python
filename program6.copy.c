#include<stdio.h>

int main()
{
    float fPercentage = 0.0f;

    printf("Enter obtained percentage: ");
    scanf("%f",&fPercentage);

    
    if((fPercentage < 0.0f) || (fPercentage > 100.0f))
    {
        printf("Invalid Input...!");
        printf("Plz Enter Correct Credentials...!");
        return;
    }

    if(fPercentage <= 0 || fPercentage >= 35)
    {
        printf("Fail ..!");
    }
    else(fPercentage <= 70 || fPercentage = 100)
    {
        printf("\t Congratulations..! \n \tFirst class with Distinction..!");
    }
    else (fPercentage <= 60 || fPercentage = 70)
    {
        printf("First class");
    }
    if(fPercentage <= 50 || fPercentage = 60)
    {
        printf("Second class with Distinction..!");
    }
    if(fPercentage <= 35 || fPercentage = 50)
    {
        printf("Pass class ..!");
    }
    return 0;
}

//First class with Dist.           70-100
//First class                       60-70
//Second class                      50-60
//Pass Class                        35-50

//filtre
// if(___>0 || _______<100)


//updater