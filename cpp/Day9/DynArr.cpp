#include<iostream>
using namespace std;

class student{
    int roll;
    char name[20];
    public:
       void display();
       void accept();
       ~student();   
};
void student::accept()
{
    cout<<"Enter the roll no:";
    cin>>roll;
    cout<<"Enter the name :";
    cin>>name;
}
void student::display()
{
    cout<<"Roll : "<<roll<<"  ";
    cout<<"Name : "<<name;
}
student::~student()
{
    cout<<"Destructor is called";
}
int main()
{
    
    int i,n;
    cout<<"Enter the number of student ";
    cin>>n;
    student* ptr=new student[n];
    for(i=0;i<n;i++)
    {
        ptr[i].accept();
    }
    for(i=0;i<n;i++)
    {
        (ptr+i)->display();
        cout<<endl;
    }
}