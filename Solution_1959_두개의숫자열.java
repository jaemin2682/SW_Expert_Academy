package swea.d2;

import java.util.Scanner;

public class Solution_1959_두개의숫자열 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int nArray[] = new int[n];
			int mArray[] = new int[m];
			int alpha = Integer.max(n, m);
			int minArray[] = new int[alpha], maxArray[] = new int[alpha];
			for(int i=0;i<n;i++) nArray[i] = sc.nextInt();
			for(int i=0;i<m;i++) mArray[i] = sc.nextInt();
			
			if(n == m) {	//큰 배열과 작은 배열을 나누는 작업
				minArray = nArray;
				maxArray = mArray;
			}
			else {
				if(n < m) {
					minArray = nArray;
					maxArray = mArray;
				}
				else if(n > m) {
					minArray = mArray;
					maxArray = nArray;
				}
			}			
			int answer = 0;
			int maxVal;
			int minThing = Integer.min(n, m);
			int dif = Integer.max(n-m, m-n);
			for(int i=0;i<=dif;i++) {	//2
				maxVal = 0;
				for(int j=0;j<minThing;j++) {	//3
					maxVal += minArray[j]*maxArray[j+i];
				}
				answer = Integer.max(answer,  maxVal);
			}
			System.out.println("#"+(tc+1)+" "+answer);
		}
	}

}
