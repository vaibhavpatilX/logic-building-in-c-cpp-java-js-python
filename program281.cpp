#include<iostream>
using namespace std;

typedef unsigned int UINT;

UINT CheckBit(UINT iNo)     //12th position
{
    UINT iMask = 4294965247;
    UINT iResult = 0;

    iResult = iNo & iMask;

    return iResult;

}
int main()
{
    UINT iValue = 0, iRet = 0;

    cout<<"Enter Number: \n";
    cin>>iValue;

    iRet = CheckBit(iValue);
    
    cout<<"Updated Number is "<<iRet<<"\n";

    return 0;
}