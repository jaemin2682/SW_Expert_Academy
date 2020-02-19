package swea.d2;

import java.util.Scanner;

public class Solution_1976_시각덧셈 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int firSi = sc.nextInt();
			int firBun = sc.nextInt();
			int secSi = sc.nextInt();
			int secBun = sc.nextInt();
			
			int sumSi = firSi + secSi;
			int sumBun = firBun + secBun;
			
			sumSi += sumBun/60;	//시간의 합에 분의 시간을 더함
			sumSi = (sumSi%12);	//0~11로 표현
			if(sumSi == 0) sumSi = 12;
			sumBun %= 60;
			
			System.out.println("#"+(tc+1)+" "+sumSi+" "+sumBun);
		}
	}
}
