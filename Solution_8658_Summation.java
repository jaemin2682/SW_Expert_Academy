package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8658_Summation {

static String[] strArr;
static String str;
static int sum, size, maxVal, minVal;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		for(int tc=0;tc<t;tc++) {
			strArr = br.readLine().split(" ");
			maxVal=0;
			minVal=Integer.MAX_VALUE;
			for(int i=0;i<10;i++) {
				sum = 0;
				size = strArr[i].length();
				for(int j=0;j<size;j++) sum += strArr[i].charAt(j) - 48;
				maxVal = Integer.max(maxVal,  sum);
				minVal = Integer.min(minVal,  sum);
			}
			System.out.println("#"+(tc+1)+" "+maxVal+" "+minVal);
			
		}
	}

}
