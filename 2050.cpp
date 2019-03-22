#include <iostream>
#include <cstring>
using namespace std;

int main() {
	char alpha[200];
	cin >> alpha;
	for (int i = 0; i < strlen(alpha); i++) {
		cout << (int)alpha[i] - 64 << " ";
	}
	return 0;
}