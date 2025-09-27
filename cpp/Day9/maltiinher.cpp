#include<iostream>
using namespace std;
class A{
   public:
    A()
    {
        cout<<"The constructor of A "<<endl;
    }
};
class B{
    public:
      B()
      {
        cout<<"The constructor of B "<<endl;
      }
};
class C:public B,public A
{
    public:
      C(){
        cout<<"The constructor of c "<<endl;
      }
};
int main()
{
  C c;

}