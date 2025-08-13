#include<iostream>
using namespace std;

template <class T>
T Maximum(T No1, T No2, T No3)
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
    cout<<"Maximum Number is "<<Maximum(15,20,24)<<"\n";
    cout<<"Maximum Number is "<<Maximum(15.8f,20.6f,24.8f)<<"\n";
    
    return 0;
}