	#include <iostream>
	#include <cstring>
	using namespace std;

	int main() {
		int t, cnt=0;
		char text[30];
		cin >> t;
		for (int i = 0; i < t; i++) {
			cin >> text;

				for (int k = 1; k < 20; k++) {
					if (text[0] == text[k]) {
						cnt = k;
						break;	
					}
				}

			if (text[1] != text[cnt + 1]) {
					for (int k = cnt+1; k < 20; k++) {
						if (text[1] == text[k]) {
							cnt = k-1;
							break;
						}
					}
			}


			cout << "#" << i + 1 << " " << cnt << endl;
		}

		return 0;
	}