#include<iostream>
using namespace std;

class bruh
{
    int len;
    char*ptr;
    public:
    bruh(int) ;
    void display();
};
bruh(int len)
{
    this->len=len;
    this->ptr=new char[len+1];
    strcpy(this->ptr, s.ptr);
}

void bruh::display()
{
    cout<<"length is "<<len<<endl;
	cout<<"string is "<<ptr<<endl;
    
}
int main()
{
    bruh s1;
    s1.bruh(4);
    s1.display();

}