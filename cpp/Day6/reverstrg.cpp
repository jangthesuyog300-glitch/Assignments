#include<iostream>
using namespace std;

int main()
{
    int space,row;
    cout<<"Enter number of rows";
    cin>>row;

    for(int i=1,k=0;i<=row;i++,k=0){
        for(space =1;space<=row-1;space++)
        {
            cout<<" ";
        }
        while(k!=2*i-1)
        {
            cout<<"* ";
            k++;
        }
        cout<<endl;
    }
}