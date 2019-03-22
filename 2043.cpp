#include <iostream>
using namespace std;

int main() {

	int p;
	int k;
	int cnt = 0;

	cin >> p >> k;

	for (int i = k; i <= p; i++) {
		cnt++;
	}

	cout << cnt;

	return 0;
}
