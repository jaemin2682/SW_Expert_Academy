#include <iostream>
using namespace std;

int main() {
	int nat, sum;
	int thou, hund, dec, one;
	cin >> nat;
	if (nat < 1 || nat > 9999) cout << "Error";
	thou = nat / 1000;
	hund = (nat - thou * 1000) / 100;
	dec = (nat - thou * 1000 - hund * 100) / 10;
	one = (nat - thou * 1000 - hund * 100 - dec * 10);
	sum = thou + hund + dec + one;
	cout << sum << endl;

	return 0;
}