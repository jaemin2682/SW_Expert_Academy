#include <iostream>
using namespace std;

int main() {
	int test, sum = 0;
	int num[10];

	cin >> test;
	for (int t = 1; t <= test; t++) {

		for (int g = 0; g < 10; g++) {
			cin >> num[g];
		}

		for (int i = 0; i < 10; i++) {
			if (num[i] % 2 == 1) sum += num[i];
		}

		cout << "#" << t << " " << sum << endl;
		sum = 0;
	}
	return 0;
}
