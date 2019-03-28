#include <iostream>
using namespace std;

int main() {
	int t, p, q, r, s, w, paya = 0, payb = 0, res = 0;
	scanf("%d", &t);

	for (int i = 0; i < t; i++) {
		scanf("%d", &p);
		scanf("%d", &q);
		scanf("%d", &r);
		scanf("%d", &s);
		scanf("%d", &w);

		paya = w * p;

		if (w <= r) payb = q;
		else payb = q + (w - r) * s;

		if (paya >= payb) res = payb;
		else res = paya;

		printf("#%d %d\n", i + 1, res);
	}

	return 0;
}