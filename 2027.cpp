#include <iostream>
using namespace std;

int main() {
	for (int i = 0; i < 5; i++) {
		for (int j = 0; j < i; j++) {
			cout << "+";
		}
		cout << "#";
		for (int k = 0; k < 4 - i; k++) {
			cout << "+";
		}
		cout << endl;
	}
	return 0;
}

// 0 1 4
// 1 1 3
// 2 1 2
// 3 1 1
// 4 1 0