#include <iostream>
using namespace std;

int main() {
	int n,temp, arr[199] = { 0, };
	cin >> n;
	if (n % 2 == 0 || n < 9 || n>199) cout << "Error";

	for (int i = 0; i < n; i++) {
		cin >> arr[i];
	}

	for (int j = 0; j < n; j++) {
		for (int k = j+1; k < n; k++) {
			if (arr[j] > arr[k]) {
				temp = arr[j];
				arr[j] = arr[k];
				arr[k] = temp;
			}
		}
	}

	cout << arr[n / 2] << endl;
	return 0;
}