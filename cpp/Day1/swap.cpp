#include<iostream>
using namespace std;
// class swp
// {
//     int a,b;
//     public:
//     void accept();
//     void display();
// };
// void swp::accept()
// {
//     cout<<"Enter the a and b"<<endl;
//     cin>>a>>b;
// }
// void swp::display()
// {
//     cout<<"a"<<a<<"b"<<b<<endl;
// }
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