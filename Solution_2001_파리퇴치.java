package swea.d2;

import java.util.Scanner;

public class Solution_2001_파리퇴치 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int flying[][] = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j = 0;j<n;j++) {
					flying[i][j] = sc.nextInt();
				}
			}
			
			int maxBug = 0;
			int sum = 0;
			for(int i=0;i<n-m+1;i++) {
				for(int j=0;j<n-m+1;j++) {
					sum = 0;
					for(int a=i;a<i+m;a++) {
						for(int b=j;b<j+m;b++) {
							sum += flying[a][b];
						}
					}
					maxBug = Integer.max(maxBug,  sum);
				}
			}
			
			System.out.println("#"+(t+1)+" "+maxBug);
		}
	}

}
