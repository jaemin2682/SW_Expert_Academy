package swea.d2;

import java.util.Scanner;

public class Solution_1204_최빈수구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s  = new Scanner(System.in);
		
		int T = s.nextInt();
		for(int i=0;i<T;i++) {
			int arr[] = new int[101];
			int num = s.nextInt();
			for(int j=0;j<1000;j++) {
				int score = s.nextInt();
				arr[score]++;
			}
			
			int freqVal = -1;
			for(int j=0;j<=100;j++) {
				freqVal = Integer.max(freqVal, arr[j]);
			}
				
			for(int j=100;j>=0;j--) {
				if(freqVal == arr[j]) {
					System.out.println("#"+num+" "+j);
					break;
				}
			}
		}
	}
}
