#include<iostream>
using namespace std;
 void swap( int& p,int& q)
{
    int temp;
    temp =p;
    p=q;
    q=temp;
}
int main()
{
    int a=10,b=20;
    cout<<"before swap :"<<a<<" "<<b<<endl;
    swap(a,b);
    cout<<"After swap :"<<a<<" "<<b;
}
