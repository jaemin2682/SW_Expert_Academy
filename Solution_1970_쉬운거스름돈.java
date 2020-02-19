package swea.d2;

import java.util.Scanner;

public class Solution_1970_쉬운거스름돈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int money[] = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			System.out.println("#"+(tc+1));
			
			for(int i=0;i<8;i++) {
				int cnt = 0;
				while(n-money[i] >= 0) {
					n-=money[i];
					cnt++;
				}
				System.out.print(cnt + " ");
			}
			System.out.println();
		}
	}
}
