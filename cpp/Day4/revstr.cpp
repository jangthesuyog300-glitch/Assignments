#include<iostream>
#include<string.h>
using namespace std;

int main()
{
    char str1[20],rev[20];
    int i,j;
    static int count=0;
    cout<<"Enter the string\n";
    cin>>str1;
    while (str1[count]!='\0')
    {
        count++;
    }
    j=count-1;
 
    for ( i = 0; i < count; i++)
    {
        rev[i]=str1[j];
        j--;
        
    }
    rev[i]='\0';
    cout<<"After revers the string :"<<rev;
    
    
}
