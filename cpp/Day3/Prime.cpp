#include <iostream>
using namespace std;

int main() {
    int num, i, j = 1; 
    cout << "Enter the number " << endl;
    cin >> num;

    if (num <= 1) {
       
        cout << "The number is not prime";
        return 0;
    }

    for (i = 2; i < num ; i++) {
        if (num % i == 0) {
            j = 0; 
            break; 
        }
    }

    if (j == 1) {
        cout << "The number is prime";
    } else {
        cout << "The number is not prime";
    }

    return 0;
}
