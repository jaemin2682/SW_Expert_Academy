package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8338_계산기 {
static int tot, n, num;
static String[] strArr;
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			tot = 0;
			n = Integer.parseInt(br.readLine());
			strArr = br.readLine().split(" ");
			for(int i=0;i<n;i++) {
				num = Integer.parseInt(strArr[i]);
				if(num==1 || num==0 || tot==1 || tot==0) tot+=num;	//num이나 tot이 1일 때는 무조건 더하는 것이 이득
				else tot *= num;
			}
			System.out.println("#"+(tc+1)+" "+tot);
		}
	}

}
