#include<iostream>
using namespace std;

class complex{
    int real,img;
    public:
    complex();
    complex(int , int );
    void display() const;
    void setReal(int );
    int getReal()const;

};
void complex :: setReal(int r){
    r=real;
}
int complex::getReal()const
{
    return real;
}
complex::complex()
{
    cout<<"In defualt constructer "<<endl;
    real=1;
    img=4;
}
complex::complex(int r, int i){
    cout<<"param.. constructer"<<endl;
    real=r;
    img=i;
}
void complex::display()const
{
    cout<<"complex "<<real<<"+"<<img<<"i";
}
int main()
{
    const complex c1(1,2);
    c1.display();
}
