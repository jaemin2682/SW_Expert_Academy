#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int test;
	float sum = 0;
	int num[10];

	cin >> test;
	for (int t = 1; t <= test; t++) {

		for (int g = 0; g < 10; g++) {
			cin >> num[g];
		}

		for (int i = 0; i < 10; i++) {
			sum += num[i];
		}

		cout << "#" << t << " " << round(sum / 10) << endl;
		sum = 0;
	}
}