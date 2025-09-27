#include<iostream>
using namespace std;

class complex{
    int real,img;
    public:
    complex()const;//error
    
    void display() ;
 

};
int main()
{
    complex c1;
    c1.display();
}