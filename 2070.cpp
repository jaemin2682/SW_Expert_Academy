#include <iostream>
using namespace std;

int main() {
	int t, num1, num2;
	char dec;
	
	cin >> t;

	for (int i=0; i < t; i++) {
		cin >> num1 >> num2;

		if (num1 > num2) dec = '>';
		if (num1 < num2) dec = '<';
		if (num1 == num2) dec = '=';

		cout << "#" << i + 1 << " " << dec << endl;
	}

	return 0;
}