#include <iostream>
using namespace std;

int main() {
	int a, b;
	cin >> a >> b;
	
	if (a == 1) {
		if (b == 2) cout << "B";
		if (b == 3) cout << "A";
	}
	if (a == 2) {
		if (b == 1) cout << "A";
		if (b == 3) cout << "B";
	}
	if (a == 3) {
		if (b == 1) cout << "B";
		if (b == 2) cout << "A";
	}

	return 0;
}