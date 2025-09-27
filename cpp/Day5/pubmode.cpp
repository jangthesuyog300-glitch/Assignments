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
  
class Derived : public Base { 
public: 
    // function to access protected member from Base 
    int getProt() { return prot; } 
}; 
int main()
{
    //we can access the protected and public 
    Derived obj;
    cout<<obj.getProt();
}
