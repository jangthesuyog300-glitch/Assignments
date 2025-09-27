#include<iostream>
using namespace std;
class parent
{
    public:
    double radius;
    double area_crcl()
    {
        return 3.14*radius*radius;
    }
};

int main()
{
    parent obj;
    obj.radius=5;// access the public variable in all function 
    cout<<obj.area_crcl();//access the public function in the all function 
}