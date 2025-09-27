#include<iostream>

using namespace std;

int main()
{
    int num, r=1;
    cout<<"Enter the number "<<endl;
    cin>>num;

    for(int i=1;i<=num;i++)
    {
        r=i*r;
    }
    cout<<r;

}
//factorial
#include <iostream>
using namespace std;

int main() {
    int num;
    cout << "Enter the number: ";
    cin >> num;

    if (num < 0) {
        cout << "Factorial is not defined for negative numbers." << endl;
        return 0;
    }

    unsigned long long result = 1;
    for (int i = 2; i <= num; ++i) {
        result *= i;
    }

    cout << "Factorial of " << num << " is " << result << endl;
    return 0;
}
//