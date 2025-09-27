// Writeastudent class and use it in your program. Store the data of 10 students and display
//  the sorted data according to their roll numbers, dates of birth, and total marks.
#include<iostream>
using namespace std;

class student{
    int roll;
    char name[30];
    char birth[20];
    int marks;
    public:
    void accept();
    void display();
    void Swapdata(student &s);
    int getRoll() 
     { 
        return roll; 
    }
};
void student::Swapdata(student& s){
  int tempRoll = roll;
    roll = s.roll;
    s.roll = tempRoll;
}
void student:: accept()
{
    cout<<"Roll no: ";
    cin>>roll;
    cout<<"Name : ";
    cin>>name;
    cout<<"Date of Birth : ";
    cin>>birth;
    cout<<"marks : ";
    cin>>marks;
}
void student:: display()
{
    cout<<"Roll no: "<<roll<<endl;
    cout<<"Name : "<<name<<endl;
    cout<<"Date of Birth : "<<birth<<endl;
    cout<<"Marks :"<<marks<<endl;
}


int main()
{
    int n;
    cout<<"Enter the number of student ";
    cin>>n;
    student*s1=new student [n];//array of the object 
    for(int i=0;i<n;i++){
       s1[i].accept(); 
    }
    for (int i = 0; i < n - 1; i++) {

        for (int j = 0; j < n - i - 1; j++) {

            if (s1[j].getRoll() > s1[j+1].getRoll()) 
            {
                s1[j].Swapdata(s1[j+1]); // Swap entire student objects
            }
        }
    }

    
    for(int i=0;i<n;i++){
       s1[i].display(); 
    }
}