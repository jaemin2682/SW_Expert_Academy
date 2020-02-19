package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8104_조만들기 {
static int n, k, number, my;
static int arr[];
static String[] strArr;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			strArr = br.readLine().split(" ");
			n = Integer.parseInt(strArr[0]);
			k = Integer.parseInt(strArr[1]);
			arr = new int[k];
			number = 1;
			
			for(int i=0;i<n;i++) {
				if(i%2==0) {
					for(int j=0;j<k;j++) {
						arr[j]+= number;
						number++;
					}
				}
				else {
					for(int j=k-1;j>=0;j--) {
						arr[j] += number;
						number++;
					}
				}	
			}
			System.out.print("#"+(tc+1)+" ");
			for(int i=0;i<k;i++) System.out.print(arr[i] + " ");
			System.out.println();
		}
	}
}