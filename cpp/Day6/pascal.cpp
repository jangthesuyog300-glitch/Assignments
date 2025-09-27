#include <iostream> 
using namespace std; 
int main() {
    int rows;
    cout << "Enter the number of rows for Pascal's Triangle: ";
    cin >> rows;

    for (int i = 0; i < rows; i++) {
        int coefficient = 1; 
        for (int space = 1; space <= rows - i; space++) {
            cout << "  "; 
        }

        for (int j = 0; j <= i; j++) {
           
            cout << coefficient << "   "; 
            
            coefficient = coefficient * (i - j) / (j + 1); 
        }
        cout << endl; 
    }
    return 0;
}