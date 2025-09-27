#include<iostream>
using namespace std;
//dynamic constructor is constructor is used for the run time memory allocation 

class demo{
    int* ptr;//pointer 

    public:
    demo()
    {
        //dynamically initializing
        ptr=new int;//the memory allocate the runtime using new operator and memory deallocate runtime 
        *ptr=10;//the variable is create on a heap section 
    }
    void show()
    {
        cout<<*ptr<<endl;
    }
};

int main()
{
    demo s1;
    s1.show();
}
