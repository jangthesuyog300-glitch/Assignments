#include<iostream>
using namespace std;
#include<stdlib.h>

int main()
{
    int i,n;
    int *ptr;
    cout<<"Enter the element ";
    cin>>n;
    ptr=(int*)malloc(n*sizeof(int));//Expicitly type casting is used
    cout<<"Accept the element "<<endl;
    for(i=0;i<n;i++)
    {
        cin>>ptr[i];
    }

    cout<<"Display Element "<<endl;
    for(i=0;i<n;i++)
    {
        cout<<ptr[i]<<'\t';
    }
    free(ptr);

}