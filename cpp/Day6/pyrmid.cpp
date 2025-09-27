#include<iostream>
using namespace std;

int main()
{
    int row;
    char a;
    cout<<"Enter the charecter ";
    cin >>a;
    cout<<"Enter the row ";
    cin>>row;

    for(int i=0;i<row;i++)
    {
        for(int j=0;j<=i;j++)
        {
            cout<<a; 
        }
        a++;
        cout<<endl;
    }
}