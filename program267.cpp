//BINARY Conversion and Count 0
#include<iostream>
using namespace std;

int CountOne(int iNo)
{
    int iCount = 0;
    cout<<"Binary   Conversion is : \n";

    while(iNo != 0)
    {
        cout<<iNo % 2;
        iCount = iCount + (iNo % 2);
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

    cout<<"Number 0 occurs "<<iRet<<" times";

    return 0;
}