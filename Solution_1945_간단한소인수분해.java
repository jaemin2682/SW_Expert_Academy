package swea.d2;

import java.util.Scanner;

public class Solution_1945_간단한소인수분해 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int arr[] = {2, 3, 5, 7, 11};
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int ans[] = new int[5];
			for(int i=0;i<5;i++) {
				while(n%arr[i] == 0) {
					n /= arr[i];
					ans[i]++;
				}
			}
			System.out.print("#"+(tc+1)+" ");
			for(int a : ans) System.out.print(a + " ");
			System.out.println();
		}	
	}
}
