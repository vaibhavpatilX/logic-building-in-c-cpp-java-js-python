#include<iostream>
using namespace std;

double Maximum(double No1, double No2, double No3)
{
    if((No1 > No2) && (No1 > No3))
    {
        return No1;
    }
    else if((No2 > No1) && (No2 > No3))
    {
        return No2;
    }
    else
    {
        return No3;
    }

}

int main()
{
    cout<<"Maximum Number is "<<Maximum(10.50,15.20,16.30)<<"\n";
    cout<<"Maximum Number is "<<Maximum(15.54,20.60,24.30)<<"\n";
    return 0;
}