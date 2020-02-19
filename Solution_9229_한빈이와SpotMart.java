package swea.d3;

import java.util.Scanner;

public class Solution_9229_한빈이와SpotMart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int arr[] = new int[n];
			for(int i=0;i<n;i++) arr[i] = sc.nextInt();
			int one=0, two=0, temp, sum=0;
			
			for(int i=0;i<n;i++) {
				for(int j=i+1;j<n;j++) {
					temp = arr[i] + arr[j];
					if(temp > sum && temp <= m) {
						sum = temp;
						one = i;
						two = j;
					}
				}
			}
			System.out.print("#"+(tc+1)+ " ");
			if(sum == 0) System.out.println(-1);
			else System.out.println(arr[one] + arr[two]);
			
		}
	}

}
