#include<iostream>
#include<math.h>
using namespace std;
int main()
{
    int a,pw=1,p;
    cout<<"Enter the value\n";
    cin>>a;
    cout<<"Enter the power\n";
    cin>>p;
    for (int i=1;i<=p;i++)
    {
        pw = pw*a;
    }
    cout<<"Power "<<pw;
}
    