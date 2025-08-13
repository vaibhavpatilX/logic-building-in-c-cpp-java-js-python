#include<iostream>
using namespace std;

typedef unsigned int UINT;

bool CheckBit(unsigned iNo)
{
    UINT iMask = 8;
    UINT iResult = 0;

    iResult = iNo & iMask;

    return (iResult == iMask);
}
int main()
{
    UINT iValue = 0;
    bool bRet = false;

    cout<<"Enter Number: \n";
    cin>>iValue;

    bRet = CheckBit(iValue);

    if(bRet == true)
    {
        cout<<"4th Bit in ON\n";
    }
    else
    {
        cout<<"4th Bit in OFF\n";
    }
    return 0;
}