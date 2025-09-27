#include <iostream>
using namespace std;
class cdate{
	int dd,mm,yy;
	public:
	void accept();
	void display();
	void setDate(int);
	int getMm();
};
void cdate :: accept ()
{
	cout<<"Enter the Date "<<endl;
	cin>>dd>>mm>>yy;
}
void cdate:: display()
{
	cout<<dd<<"/" <<mm<<"/"<<yy<<"\n";
}
void cdate :: setDate(int day)
{
	day=dd;
}
int cdate :: getMm ()
{
	return mm;
}
int main()
{
	cdate d;
	d.accept();
	d.display();
	d.setDate(25);
    d.display();
	d.getMm();
	cout<<"The month is "<<d.getMm();
	
}