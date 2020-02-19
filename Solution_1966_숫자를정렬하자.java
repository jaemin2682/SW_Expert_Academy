package swea.d2;

import java.util.Scanner;

public class Solution_1966_숫자를정렬하자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) {
				arr[i] = sc.nextInt();
			}
			
			for(int i=0;i<n;i++) {	//selection sort
				int minIdx = i;
				for(int j=i+1;j<n;j++) {
					if(arr[minIdx] > arr[j]) {
						minIdx = j;
					}
				}
				int temp = arr[minIdx];
				arr[minIdx] = arr[i];
				arr[i] = temp;
			}
			
			System.out.print("#"+(tc+1)+" ");
			for(int a : arr) System.out.print(a + " ");
			System.out.println();
		}
	}

}
