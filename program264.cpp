//BINARY Conversion and Count 1
#include<iostream>
using namespace std;

int CountOne(int iNo)
{
    int iDigit = 0;
    int iCount = 0;
    cout<<"Binary   Conversion is : \n";

    while(iNo != 0)
    {
        iDigit = iNo % 2;
        cout<<iDigit;
        if(iDigit == 1)
        {
            iCount++;
        }
        iNo = iNo / 2;
    }
    cout<<endl;
    return iCount;
}

int main()
{
    int iValue = 0;
    int iRet = 0;
    cout<<"Enter Number: \n";
    cin>>iValue;

    iRet = CountOne(iValue);

    cout<<"Number 1 occurs "<<iRet<<" times";

    return 0;
}