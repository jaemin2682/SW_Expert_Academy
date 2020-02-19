package swea.d2;

import java.util.Scanner;

public class Solution_1288_새로운불면증치료법 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=0;tc<t;tc++) {
			int n= sc.nextInt();
			int num = n;
			boolean check[] = new boolean[10];
			
			String str;
			int size;
			while(true) {
				boolean isEnd = true;
				str = Integer.toString(num);
				size = str.length();
				for(int i=0;i<size;i++) {
					if(!check[str.charAt(i)-48]) check[str.charAt(i)-48] = true;
				}
				
				for(int i=0;i<10;i++) {
					if(check[i] == false) {
						isEnd = false;
						break;
					}
				}
				if(isEnd) break;
				num += n;
			}
			System.out.println("#"+(tc+1)+" "+num);
			
		}

	}

}
