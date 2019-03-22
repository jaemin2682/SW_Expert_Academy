#include <iostream>
using namespace std;

int main() {
	int n, cnt=0, back, sip, il;
	cin >> n;

	for (int i = 1; i <= n; i++) {
		cnt = 0;
		back = i / 100;
		sip = (i - back * 100) / 10;
		il = i - back * 100 - sip * 10;

		if (i < 10) {
			if (il % 3 == 0&&il!=0) cnt++;
		}
		else if (i < 100) {
			if (sip % 3 == 0 && sip!=0) cnt++;
			if (il % 3 == 0 && il!=0) cnt++;
		}
		else {
			if (back % 3 == 0 && back!=0) cnt++;
			if (sip % 3 == 0&&sip!=0) cnt++;
			if (il % 3 == 0&&il!=0) cnt++;
		}		

		if (cnt == 0) cout << i << " ";
		else if (cnt == 1) cout << "- ";
		else if (cnt == 2) cout << "-- ";
		else cout << "--- ";
	}

	return 0;
}