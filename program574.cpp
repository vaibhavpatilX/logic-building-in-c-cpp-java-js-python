//Bi-directional //from both side search

#include<iostream>
using namespace std;

class ArrayX
{
    public:
        int *Arr;
        int iSize;

        ArrayX(int no)
        {
            iSize = no;
            Arr = new int[iSize];
        }

        ~ArrayX()
        {
            delete []Arr;
        }

        void Accept()
        {
            cout<<"Enter the elements : \n";
            int i = 0;

            for(i = 0;i<iSize;i++)
            {
                cin>>Arr[i];
            }
        }

        void Display()
        {
            cout<<"Elements of the Array are : \n";
            int i = 0;

            for(i = 0;i<iSize;i++)
            {
                cout<<Arr[i]<<"\t";
            }   
            cout<<"\n";
        }
        
        bool LinearSearch(int no)       // complexity -> n
        {
            int i = 0;
            bool bFlag = false;

            for(i = 0; i< iSize;i++)
            {
                if(Arr[i] == no)
                {
                    bFlag = true;
                    break;
                }
            }
            return bFlag;
        }

        bool BiDirectionalSearch(int no)            // complexity -> n/2
        {
            int iStart = 0;
            int iEnd = 0;

            bool bFlag = false;

            for(iStart = 0,iEnd = iSize-1; iStart <= iEnd;iStart++,iEnd--)
            {
                if(Arr[iStart] == no || Arr[iEnd] == no)
                {
                    bFlag = true;
                    break;
                }
            }
            return bFlag;
        }
};

int main()
{
    ArrayX aobj(5);
    bool bRet = false;

    aobj.Accept();

    aobj.Display();
    bRet = aobj.BiDirectionalSearch(30);

    if(bRet== true)
    {
        cout<<"Element is present\n";
    }
    else 
    {
        cout<<"Element is not present\n";
    }
    return 0;
}