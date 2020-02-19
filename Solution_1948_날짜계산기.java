package swea.d2;

import java.util.Scanner;

public class Solution_1948_날짜계산기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		int month[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		
		for(int tc=0;tc<t;tc++) {
			int fmonth = sc.nextInt();
			int fday = sc.nextInt();
			int lmonth = sc.nextInt();
			int lday = sc.nextInt();
			int res = 0;
			
			if(fmonth == lmonth) res = lday - fday + 1;	//월이 같은 경우
			else {	//다른 경우
				for(int i=lmonth-1;i>fmonth;i--) {
					res += month[i];
				}
				res += lday + month[fmonth]-fday+1;
			}
			System.out.println("#"+(tc+1)+" "+res);
		}
	}

}
