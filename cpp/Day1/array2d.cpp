#include <iostream>
using namespace std;
int main()
{
   int arr[3][3];

   cout<<"Enter the arrays element "<<endl;

   int i,j;

   for(i=0;i<=2;i++)
   {
    for(j=0;j<=2;j++)
    {
        cin>>*(*(arr+i)+j);
    }
    
   }
   cout<<endl;
   for(i=0;i<=2;i++)
   {
    for(j=0;j<=2;j++)
    {
        cout<<*(*(arr+i)+j)<<"\t";
    }
     cout<<endl;
   }
}
