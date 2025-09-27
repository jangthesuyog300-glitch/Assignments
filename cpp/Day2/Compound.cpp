#include<iostream>

using namespace std;
int main ()
{
    double rate,principal,time;
    cout<<"Enter the principal amount :"<<endl;
    cin>>principal;

    cout<<"Enter the rate :"<<endl;
    cin>>rate;

    cout<<"Enter the time :"<<endl;
    cin>>time;


    double r=1;
    for(double i=1;i<=time;i++)
    {
        r=(1+rate/100)*r;
    }



    double amount=principal * r;

    double CI=amount - principal;

    cout<<"The compound intrest is "<<CI<<endl;

    return 0;
}