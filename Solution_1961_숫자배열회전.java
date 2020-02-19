package swea.d2;

import java.util.Scanner;

public class Solution_1961_숫자배열회전 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int arr[][] = new int[n][n];
			
			for(int i=0;i<n;i++) 
				for(int j=0;j<n;j++)
					arr[i][j] = sc.nextInt();
			
			System.out.println("#"+(tc+1));
			for(int i=0;i<n;i++) {
				for(int j=n-1;j>=0;j--) {	//90도
					System.out.print(arr[j][i]);
				}
				System.out.print(" ");
				for(int j=n-1;j>=0;j--) {	//180도
					System.out.print(arr[n-1-i][j]);
				}
				System.out.print(" ");
				for(int j=0;j<n;j++) {
					System.out.print(arr[j][n-1-i]);
				}
				System.out.println();
			}
		}
	}
}