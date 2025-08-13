#include<iostream>
using namespace std;

int Addition(int No1, int No2)
{
    int Ans;
    Ans = No1 + No2;
    return Ans;
}

int main()
{
    int Ret;
    Ret = Addition(10,11);
    
    cout<<"Addition is : "<<Ret<<"\n";
    return 0;
}