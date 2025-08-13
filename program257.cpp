#include<iostream>
using namespace std;

int main()
{
    int Size;
    int iCnt = 0;
    cout<<"Enter how many number you want to insert: "<<"\n";
    cin>>Size;

    int *Ptr = new int[Size];
    
    cout<<"Enter the Elements: ";
    
    for(iCnt = 0;iCnt< Size;iCnt++)
    {
        cin>>Ptr[iCnt];
    }

    cout<<"Elements of the array are : \n";

    for(iCnt = 0;iCnt< Size;iCnt++)
    {
        cout<<Ptr[iCnt]<<"\n";
    }
    delete[] Ptr;
    return 0;
}