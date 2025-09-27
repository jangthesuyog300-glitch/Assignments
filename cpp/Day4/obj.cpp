#include<iostream>
using namespace std;
class temp{
    int a;
    public:
    void getcun();
    temp add(temp& b1){
        temp obj3;
        obj3.a=this->a+b1.a;
        return obj3;
    }
    void show(){
        cout<<a;
    }
};
void temp:: getcun()
{
    cin>>this->a;
}
int main(){

    temp o1,o2;
    o1.getcun();
    o2.getcun();
    temp o4 =o1.add(o2);
    o4.show();
}