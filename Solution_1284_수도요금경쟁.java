package swea.d2;

import java.util.Scanner;

public class Solution_1284_수도요금경쟁 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt(), p, q, r, s, w, aCom, bCom;
		for(int tc=0;tc<t;tc++) {
			p = sc.nextInt();
			q = sc.nextInt();
			r = sc.nextInt();
			s = sc.nextInt();
			w = sc.nextInt();
			
			aCom = w*p;
			if(w <= r) bCom = q;
			else bCom = q + (w-r)*s;
			
			System.out.println("#"+(tc+1)+" "+Integer.min(aCom, bCom));
		}
	}

}
