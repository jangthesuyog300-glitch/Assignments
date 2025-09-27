#include <iostream>
using namespace std;

int main ()
{
    int a= 5;
    int b=10;

    cout<<"before swap a= "<<a<<" and b= "<<b<<endl;

    a= a+b;
    b=a-b;
    a=a-b;
    cout<<"after swaping a = "<<a<<" and b = "<<b;

}


