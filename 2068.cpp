#include <iostream>
using namespace std;

int main() {
	int t, num[10], max=0;
	
	cin >> t;
	for (int i = 0; i < t; i++) {
		for (int j = 0; j < 10; j++) {
			cin >> num[j];
		}
		for (int k = 0; k < 10; k++) {
			if (num[k] > max) max = num[k];
		}
		cout << "#" << i + 1 << " " << max << endl;
		max = 0;
	}
	return 0;
}