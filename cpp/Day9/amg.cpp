#include<iostream>
using namespace std;

class A{
    public: 
      void show(){
        cout<<"This fiunction is member class function of A "<<endl; 
      }
};
class B{
    public: 
      void show(){
        cout<<"This fiunction is member class function of B "<<endl; 
      }
};
 // create a child class to inherit the member function of class A and class B  
 class child: public A, public B  {
    public:
    void show()
	{
		A::show();
		B::show();
		cout<<"in child class show()";
	 } 
    
      void display(){
        cout<<"This fiunction is member child class function of C "<<endl; 
      }
};


int main()
{
  child ch;
  ch.show();
}