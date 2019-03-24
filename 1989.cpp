#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int t, res=1;
	char text[10];
	cin >> t;
	for (int i = 0; i < t; i++) {
		cin >> text;
		res = 1;
		if (strlen(text) % 2 == 0) {
			for (int j = 0; j < strlen(text)/2; j++) {
				if (text[j] != text[strlen(text) - 1 - j]) res = 0;
			}
		}

		else {
			for (int k = 0; k < strlen(text)/2; k++) {
				if (text[k] != text[strlen(text) - 1 - k]) res = 0;
			}
		}
		cout << "#" << i + 1 << " " << res << endl;

	}
	return 0;
}