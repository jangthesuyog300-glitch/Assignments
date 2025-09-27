#include<iostream>
using namespace std;
void user_strcopy(char *s2,char *s1);
int main()
{
    char str1[20];
    char str2[50];

    cout<<"enter string\n";
    cin>>str1;
    cout<<"str1 "<<str1<<endl;
    
    user_strcopy(str2,str1);
    cout<<"Coied string is str2 "<<str2;
}

void user_strcopy(char *s2,char *s1)
{
    while(*s1!='\0')
    {
        *s2 = *s1;
        s1++;
        s2++;

    }
    *s2='\0';
}