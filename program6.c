////////////////////////////////////////////////////////////////////////////////
//
// Start
//      Accept percentage from user
//      if percetage is less that 0 and greater than 100
//              Display as invalid Input
//       if percentage is greater than 0 and less than 35
//              Display as fail
//       if percentage is greater than 35 and less than 50
//              Display as Pass class
//       if percentage is greater than 50 and less than 60
//              Display as second class
//       if percentage is greater than 60 and less than 70
//              Display as first class
//       if percentage is greater than 70 and less than 100
//              Display as first class with distinction
// Stop



#include<stdio.h>

void DisplayClass(float fPerc)
{
    if((fPerc < 0.0f) || (fPerc > 100.0f))       
    {
        printf("Unable to proceed as input is invalid..!\n");
        printf("Plz Enter Correct Credentials...!");
        return;
    }

    if((fPerc >= 0.0f ) && (fPerc < 35.0f))
    {
        printf("You are fail\n");
    }
    else if((fPerc >= 35.0f ) && (fPerc < 50.0f))
    {
        printf("Pass Class\n");
    }
    else if((fPerc >= 50.0f ) && (fPerc < 60.0f))
    {
        printf("Second Class\n");
    }
    else if((fPerc >= 60.0f ) && (fPerc < 70.0f))
    {
        printf("First Class\n");
    }
    else if((fPerc >= 70.0f ) && (fPerc <= 100.0f))
    {
        printf("Congratulations..!!!!!!! \n First Class with Distinction...!\n");
    }
}

int main()
{
    float fValue = 0.0f;

    printf("Please Enter obtained percentage: \n");
    scanf("%f",&fValue);

    DisplayClass(fValue);
    return 0;
}

//First class with Dist.           70-100
//First class                       60-70
//Second class                      50-60
//Pass Class                        35-50

//filtre
// if(___>0 || _______<100)


//updater