#include <iostream>
using namespace std;

int main()
{
    int a[5];
    cout<<"Enter the array element "<<endl;

    for(int i=0;i<5;i++)
    {
        cin>>*(a+i);
    }

    cout<<"The array element are "<<endl;

    for(int i=0;i<5;i++)
    {
        cout<<*(a+i)<<"\t";
    }
}