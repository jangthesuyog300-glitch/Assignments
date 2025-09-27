#include<iostream>
using namespace std;
class parent{
    protected:
    int parent_id;
};
class child:public parent{
    public:
    void setid(int id ){
        parent_id=id;
    }
    void display()
    {
        cout<<"protected : "<<parent_id;
    }
};
int main()
{
   child obj;
   obj.setid(12);
   obj.display(); 
} 
