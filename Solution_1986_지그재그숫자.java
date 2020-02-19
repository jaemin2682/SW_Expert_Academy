package swea.d2;

import java.util.Scanner;

public class Solution_1986_지그재그숫자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int n = sc.nextInt();
			int res = 0;
			for(int i=1;i<=n;i++) {
				if(i%2==1) res += i;
				else res -= i;
			}
			System.out.println("#"+(t+1)+" "+res);
		}
	}

}
