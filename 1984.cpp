#include <iostream>
#include <cmath>
using namespace std;

int main() {
	int t, num[10], max = 0, min = 100, maxnum = 0, minnum = 0;
	float res = 0;
	cin >> t;

	for (int i = 0; i < t; i++) {

		for (int j = 0; j < 10; j++) {
			cin >> num[j];
			if (num[j] > max) {
				max = num[j];
				maxnum = j;
			}
			if (num[j] < min) {
				min = num[j];
				minnum = j;
			}
		}

		for (int k = 0; k < 10; k++) {
			if (k == maxnum || k == minnum) continue;
			res += num[k];
		}

		cout << "#" << i + 1 << " " << round(res / 8) << endl;
		res = 0, min = 100, max = 0, minnum = 0, maxnum = 0;
	}
	return 0;
}