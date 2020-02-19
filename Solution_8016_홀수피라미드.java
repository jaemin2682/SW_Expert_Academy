package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution_8016_홀수피라미드 {
static long n, a, b;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			n = Integer.parseInt(br.readLine());
			a = 2*n*n-4*n+3;
			b = 2*n*n-1;
			System.out.println("#"+(tc+1)+" "+a+" "+b);
		}
	}

}
/* 왼쪽 : 1 > 3 > 9 > 19 > 33
 * 			2    6   10   14  :   4(n-1) + 2 = 4n-2	
 * an = a1 + b1 ~ b(n-1)  =  a1 + 합(4n-2) = a1 + 4합(n) - 2 = a1 + 2n(n-1) - 2(n-1)
 * = 2n^2-4n+3
 * 
 * 
 * 오른쪽 : 1 > 7 > 17 > 31
 * 			6   10   14		 : 4n+2
 * bn = a1 + b1~b(n-1) = a1 + n(n-1)/2*4 + 2(n-1) = a1 + 2n(n-1) +2n - 2
 * = 2n^2-1
 */
