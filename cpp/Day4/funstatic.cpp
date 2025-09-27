#include<iostream>
using namespace std;
static int count=0;

class complex{
    int real,img;
    public:
      complex();
      complex(int,int);
      void show();
      static int getcount();
};
int complex::getcount()
{
    return count;
}
complex ::complex(){
    cout<<"default constructor\n";
    real=10;
    img=20;
    cout<<"complex No : "<<real<< " + "<<img<<"i"<<endl;
    count++;
}
complex::complex(int r,int i)
{
    cout<<"Parametrized constructor\n";
    real=r;
    img=i;
    count++;
}
void complex::show()
{
    
    cout<<"complex No : "<<real<< " + "<<img<<"i"<<endl;
   
}
int main()
{
    complex s1;
    complex s2(2,4);
    
    s2.show();

    cout<<"Number obj create is : "<<complex::getcount()<<endl;

    cout<<"count : "<<count;
}