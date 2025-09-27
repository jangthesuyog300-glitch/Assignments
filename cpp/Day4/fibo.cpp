#include<iostream>
using namespace std;

int main()
{
    int num,sum,a=0,b=1;
    sum=a+b;
    cout<<"Enter value for fibonacil series\n";
    cin>>num;
    cout<<a<<'\t'<<b<<'\t';
    for(int i=0;i<num;i++)
    {
        b=a;
        a=sum;
        sum = a+b;
        cout<<sum<<'\t';
    }
}