#include <iostream>
#include <cstring>
using namespace std;

int main() {
	char headline[80];
	
	cin >> headline;
	
	for (int i = 0; i < strlen(headline); i++) {
		if (headline[i] >= 'a' && headline[i] <= 'z')
			headline[i] = headline[i] - 32;
	}
	cout << headline;

	return 0;
}															