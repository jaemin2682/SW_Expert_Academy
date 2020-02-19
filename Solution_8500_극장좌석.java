package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8500_극장좌석 {
static int n, bigVal, sum, num;
static String strArr[];
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			n = Integer.parseInt(br.readLine());
			bigVal = 0;
			sum = n;
			strArr = br.readLine().split(" ");
			for(int i=0;i<n;i++) {
				num = Integer.parseInt(strArr[i]);
				bigVal = Integer.max(bigVal, num);
				sum += num;
			}
			sum += bigVal;
			System.out.println("#"+(tc+1)+" "+sum);
		}
	}

}
/*


0 0 0 0 0 5 0 0 0 0 0 4 0 0 0 0 3 0 0 0 2 0 0 1 0 

*/