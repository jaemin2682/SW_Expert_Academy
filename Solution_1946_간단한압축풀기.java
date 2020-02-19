package swea.d2;

import java.util.Scanner;

public class Solution_1946_간단한압축풀기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int n= sc.nextInt();
			System.out.println("#"+(tc+1));
			int cnt = 0;
			for(int i=0;i<n;i++) {
				char alpha = sc.next().charAt(0);
				int size = sc.nextInt();
				for(int j=0;j<size;j++) {
					System.out.print(alpha);
					cnt++;
					if(cnt==10) {
						cnt = 0;
						System.out.println();
					}
				}
			}
			System.out.println();
		}
	}

}
