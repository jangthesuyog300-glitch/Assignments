#include<iostream>
using namespace std;
class demo
{
     private:
      int pri;
     protected:
      int pro;
    public:
     demo()
     {
        pri=10;
        pro=12;
     }
        friend class F ;   

};
class F
{
    public:
     void display(demo& t)
     {
        cout<<"The private value :"<<t.pri<<endl;
        cout<<"The protected value :"<<t.pro<<endl;
     }
};
int main()
{
    demo t;
    F fri;
    fri.display(t);
}