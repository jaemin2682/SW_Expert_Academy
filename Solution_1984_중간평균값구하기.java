package swea.d2;

import java.util.Scanner;

public class Solution_1984_중간평균값구하기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int arr[] = new int[10];
			int maxNum = 0;
			int minNum = 10001;
			
			for(int i=0;i<10;i++) {
				arr[i] = sc.nextInt();
				maxNum = Integer.max(maxNum, arr[i]);
				minNum = Integer.min(minNum,  arr[i]);
			}
			
			int sum = -maxNum - minNum;
			for(int a : arr) {
				sum += a;
			}
			
			double avg = Math.round((double)sum / 8);
			System.out.println("#"+(t+1)+" "+(int)avg);
		}
	}

}
