#include<iostream>
using namespace std;

bool CheckBit(int iNo)
{
    int iMask = 8;
    int iResult = 0;

    iResult = iNo & iMask;

    return (iResult == iMask);
}
int main()
{
    int iValue = 0;
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