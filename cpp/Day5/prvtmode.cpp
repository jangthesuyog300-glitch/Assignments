#include<iostream>
using namespace std;
class Base { 
private: 
    int pvt = 1; 
protected: 
    int prot = 2; 
  
public: 
    int pub = 3; 
  
    // function to access private member 
    int getPVT() { return pvt; } 
}; 
  
class Derived : private Base { 
public: 
    // function to access protected member from Base 
    int getProt() { return prot; } 
}; 
int main()
{

    //only public is access in the main function 
    Derived obj;
    cout<<obj.getProt();
}