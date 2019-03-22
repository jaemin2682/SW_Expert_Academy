#include <iostream>
using namespace std;

int main() {
	int num, res=1;
	cin >> num;
	cout << "1" << " ";
	for (int i = 0; i < num; i++) {
		res = res * 2;
		cout << res << " ";
	}
	

	return 0;
}