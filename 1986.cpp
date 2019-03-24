#include <iostream>
#include <cstring>
using namespace std;

int main() {
	int t, n, res=0;
	cin >> t;
	
	for (int i = 0; i < t; i++) {
		cin >> n;
		
		for (int j = 1; j <= n; j++) {
			if (j % 2 == 1) res += j;
			else res -= j;
		}

		cout << "#" << i + 1 << " " << res << endl;
		res = 0;
	}
	return 0;
}