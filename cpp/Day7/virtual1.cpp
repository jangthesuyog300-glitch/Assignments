//case 3: object creation on stack  with virtual keyword
#include <iostream>
using namespace std;

class employee{
    int id;
    public:
    employee();
    employee(int);
    virtual void  display();
    virtual int  sal()
    {
        return 0;
    }
};
employee::employee(){
    cout<<"The default id ";
    id=0;
}
employee::employee(int i)
{
    cout<<"The para of emp\n";
    id=i;
}
void employee::display()
{
    cout<<" Id of emp is : "<<id<<endl;
}
class wegemp:public employee
{
    int hr,rate;
    public:
    wegemp();
    wegemp(int,int,int);
    void display();
    int sal()
    {
        return hr*rate;
    }

};
wegemp::wegemp()
{
    cout<<"The default value\n";
    hr=0;
    rate=0;
}
wegemp:: wegemp(int i,int h,int r ) : employee(i)
{
    cout<<"The para value \n";
    this->hr=h;
    this->rate=r;
}
void wegemp::display()
{
    employee:display();
    cout<<"hr"<<hr<<endl;
    cout<<"rate"<<rate<<endl;
} 
int main()
{
    employee *ptr; 
    wegemp w1(1,2,100);
    ptr=&w1;
  
    cout<<"The salary of emp : "<<ptr->sal();
    ptr->display();
    //with virtual keyword binding takes
	//at runtime and at run time type of object is checked rather than type 
	//of pointer.depending on type of object,function of that class will be 
	//executed
}