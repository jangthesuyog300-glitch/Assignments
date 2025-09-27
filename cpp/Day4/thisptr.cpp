#include<iostream>
using namespace std;

class date{
    int dd,mm,yy;

    public:
    void show();
    date(int, int, int);

};
date::date(int d,int m,int y){
    this->dd=d;
    this->mm=m;
    this->yy=y;
}
void date:: show(){
    cout<<"Date : "<<this->dd<<"/"<<this->mm<<"/"<<this->yy;
}

int main()
{
    date s1(25,8,2025);
    s1.show();

}
