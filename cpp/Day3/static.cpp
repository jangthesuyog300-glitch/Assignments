#include<iostream>
using namespace std;
void show();
void show2();
int main()
{
    show();
    show();
    show();
    cout<<"static variable";
    show2();
    show2();
    show2();
}
void show()
{
    int x=0;
    cout<<x<<endl;
    x++;
}
 void show2()
 {
    static int y=0;
    cout<<y<<endl;
    y++;
 }