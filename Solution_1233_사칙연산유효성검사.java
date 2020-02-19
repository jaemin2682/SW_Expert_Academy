package swea.d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1233_사칙연산유효성검사 {
static int n, num;
static boolean isValid;
static String str;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int t=0;t<10;t++) {
			n = Integer.parseInt(br.readLine());
			isValid = true;
			for(int i=0;i<n;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				num = st.countTokens();
				st.nextToken();
				str = st.nextToken();
				if(str.equals("-") || str.equals("+") || str.equals("/") || str.equals("*")) {
					if(num != 4) {
						isValid = false;
					}
				}
			}
			if(isValid) System.out.println("#"+(t+1)+" 1");
			else System.out.println("#"+(t+1)+" 0");
		}
	}
}