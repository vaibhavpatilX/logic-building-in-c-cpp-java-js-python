#include<iostream>
using namespace std;

int Maximum(int Brr[])
{
    cout<<Brr;
}

int main()
{
    int Size;
    cout<<"Enter how many number you want to insert: "<<"\n";
    cin>>Size;

    int *Ptr = new int[Size];
    cout<<"Enter the Number: ";
    
    for(int iCnt = 0;iCnt< Size;iCnt++)
    {
        cin>>Ptr[iCnt];
    }

    cout<<Ptr;

    Maximum(Ptr);
    
    delete[] Ptr;
    return 0;
}