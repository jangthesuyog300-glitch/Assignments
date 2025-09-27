#include<iostream>
using namespace std;
class complex
{
    int real,img;
    public:
    complex();
    complex(int, int);
    void display();
    complex operator+(complex& new_c2);
};
complex::complex()
{
    real=img=0;
}
complex::complex(int r,int i)
{
    this->real=r;
    this->img=i;
}
void complex::display()
{
    if(img>0)
    {
        cout<<real<<"+"<<img<<"i";
    }
    else{
        cout<<real<<img<<"i";
    }
}

complex complex :: operator+(complex & new_c2)
{
    complex temp;
    temp.real=this->real + new_c2.real;
    temp.img=this->img + new_c2.img;
    return temp;

}
int main()
{
  complex c1(1,2);
  complex c2(1,2);
  complex c3=c1+c2;//c1.operator(c2)
  c3.display();
}