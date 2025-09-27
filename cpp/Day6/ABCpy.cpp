#include <iostream>
using namespace std;

int main() {
    int rows;
    cout << "Enter the number of rows: ";
    cin >> rows;

    for (int i = 0; i < rows; i++) {
       
         // Print alphabets
        char ch = 'A';
        for (int j = 0; j <= i; j++) {
            cout << ch++;
        }
        cout << endl;
    }

    return 0;
}
