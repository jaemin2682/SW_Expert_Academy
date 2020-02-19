package swea.d2;

import java.util.Scanner;

public class Solution_1285_아름이의돌던지기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		for(int tc=0;tc<t;tc++) {
			int n= sc.nextInt();
			int minDis = Integer.MAX_VALUE;
			int cnt = 1;
			for(int i=0;i<n;i++) {
				int num = Math.abs(sc.nextInt());
				if(minDis == num) cnt++;
				else if(minDis > num) {
					minDis = num;
					cnt = 1;
				}
			}
			System.out.println("#"+(tc+1)+" "+minDis+" "+cnt);
		}
	}

}
