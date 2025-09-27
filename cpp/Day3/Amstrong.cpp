#include <iostream>
using namespace std;

int main() {
    int num, originalNum, remainder, result = 0;

    cout << "Enter a number: ";
    cin >> num;

    originalNum = num;

    
    while (originalNum != 0) {
        remainder = originalNum % 10;

        int power = 1;
        for (int i = 0; i < 3; i++) {
            power *= remainder;
        }

        result += power;
        originalNum /= 10;
    }

    // Check if the number is an Armstrong number
    if (result == num)
        cout << num << " is an Armstrong number." << endl;
    else
        cout << num << " is not an Armstrong number." << endl;

    return 0;
}
