#include<iostream>
using namespace std;

int main()
{
    int iValue = 0;
    
    cout<<"Enter Number: \n";
    cin>>iValue;

    cout<<"Number in Decimal format : "<<std::dec<<iValue<<"\n";
    cout<<"Number in Octal format : "<<std::oct<<iValue<<"\n";
    cout<<"Number in Hexadecimal format1 : "<<std::hex<<iValue<<"\n";

    return 0;
}