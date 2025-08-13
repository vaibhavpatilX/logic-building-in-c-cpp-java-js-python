#include<iostream>
using namespace std;

void Display(float Brr[],int iLength)
{
    int iCnt = 0;

    cout<<"Elements of the array are : \n";

    for(iCnt = 0;iCnt< iLength;iCnt++)
    {
        cout<<Brr[iCnt]<<"\n";
    }
}

int main()
{
    int Size;
    int iCnt = 0;
    cout<<"Enter how many number you want to insert: "<<"\n";
    cin>>Size;

    float *Ptr = new float[Size];
    
    cout<<"Enter the Elements: ";
    
    for(iCnt = 0;iCnt< Size;iCnt++)
    {
        cin>>Ptr[iCnt];
    }

    Display(Ptr,Size);
    
    delete[] Ptr;
    return 0;
}