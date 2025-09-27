#include <iostream>
using namespace std;

int main ()
{
  int arr[3][3];
  int tran[3][3];

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

   cout<<"Original matrix\n";

   for(i=0;i<=2;i++)
   {
    for(j=0;j<=2;j++)
    {
        cout<<*(*(arr+i)+j)<<"\t";
    }
     cout<<endl;
   }


    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            tran[j][i]=arr[j][i];
        }
        cout<<endl;
    }

    cout<<"The transpose matrix\n";

    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
            cout<<tran[j][i]<<"\t";
        }
        cout<<endl;
    }
}