#include<iostream>
using namespace std;
static int count=0;
class emply{
    int id;
    char name[30];
    public:
      void accept();
      void display();
};
void emply::accept()
{
    cout<<"Enter the id :";
    cin>>id;
    cout<<"Enter the name : ";
    cin>>name;
}
void emply::display()
{
    cout<<"Id :"<<id<<endl;
    cout<<"Name :"<<name<<endl;
    count++;
    
}

int main()
{
    int n;
     cout<<"Enter the number of emp :";
    cin>>n;
    emply s1[n];
    
    for (int i = 0; i < n; i++)
    {
        s1[i].accept();
    }
       for (int i = 0; i < n; i++)
    {
        s1[i].display();
    }
    cout<<"count : "<<count;
    
    
}