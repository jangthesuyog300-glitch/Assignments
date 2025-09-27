#include<iostream>
using namespace std;

class parent{
    private:
    double radius;
    public:
    double area_crcl()
    {
        return 3.14*radius*radius;
    }
};
int main()
{
    parent obj;
    //obj.radius=5;// this variable is private class because we can't access in the main function
    cout<<obj.area_crcl();// this function is can't access the private because the program give me the complile time error 
} 
