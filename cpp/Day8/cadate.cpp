#include <iostream>
using namespace std;

class cdate{
    int dd,mm,yy;
    public:
    cdate()
    {
        dd=1;
        mm=8;
        yy=2004;
    }
    cdate(int d,int m, int y )
    {
        dd=d;
        this->mm=m;
        this->yy=y;
    }
    void show()
    {
        cout<<dd<<"/"<<mm<<"/"<<yy;
    }
};
int main()
{
    cdate* ptr=new cdate (26,01,2004);
    ptr->show();
    delete ptr;

    return 0;
}
