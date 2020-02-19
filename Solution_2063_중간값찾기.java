package swea.d1;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_2063_중간값찾기{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int N = s.nextInt();
		int arr[] = new int[N];
		
		for(int i=0;i<N;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		
		System.out.println(arr[N/2]);
		
	}

}
