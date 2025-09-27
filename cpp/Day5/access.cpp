#include<iostream>
using namespace std;
class parent{
    public:
    int parent_id;
};
class child:public parent{
    public:
    int id;
};
int main()
{
    child obj;
    obj.parent_id=1;//the child class access the base class
    parent obj1;
    //obj1.id=2; //The base class can't assecc the derive class
    

} 
