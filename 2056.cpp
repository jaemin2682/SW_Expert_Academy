#include <iostream>
using namespace std;

int main() {
	int date, year, month, day, result=0, t;

	cin >> t;
	for (int z = 0; z < t; z++) {

		cin >> date;

		year = date / 10000;
		month = (date - year * 10000) / 100;
		day = date - year * 10000 - month * 100;

		if (month < 1 || month > 12) result = -1;

		if (result != -1) {
			switch (month) {
			case 4:
			case 6:
			case 9:
			case 11:
				if (day < 1 || day > 30) result = -1;
			case 2:
				if (day < 1 || day > 28) result = -1;
			default:
				if (day < 1 || day > 31) result = -1;
			}
		}

		if (result == -1) cout << "#" << z + 1 << " " << -1 << endl;
		else {
			cout << "#" << z + 1 << " ";
			cout.width(4);
			cout.fill('0');
			cout << year << "/";
			cout.width(2);
			cout << month << "/";
			cout.width(2);
			cout << day << endl;
		}
		result = 0;
	}
	

	return 0;
}