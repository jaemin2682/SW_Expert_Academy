package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8456_알덴테스파게티 {
static int n, b, e, tot, tem;
static String[] strArr;
static String[] arr;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			strArr = br.readLine().split(" ");
			n = Integer.parseInt(strArr[0]);
			b = Integer.parseInt(strArr[1]);
			e = Integer.parseInt(strArr[2]);
			tot = 0;
			arr = br.readLine().split(" ");
			for(int i=0;i<n;i++) {
				tem = Integer.parseInt(arr[i]);
				for(int j=b-e;j<=b+e;j++) {
					if(j%tem == 0) {
						tot++;
						break;
					}
				}
			}
			System.out.println("#"+(tc+1)+" "+tot);
		}	
	}
//	10 2

//
}
