#include<iostream>
using namespace std;
void add(int a=0,int b=0,int c=0,int d=0);

int main()
{
    add(1);
    add(1,2);
    add(1,2,3);
    add(1,2,3,4);

}
void add(int a,int b,int c,int d)
{
    int sum= a+b+c+d;
    cout<<"The addition of the numbers : "<<sum<<endl;
}