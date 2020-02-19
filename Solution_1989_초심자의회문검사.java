package swea.d2;

import java.util.Scanner;

public class Solution_1989_초심자의회문검사 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			String str = sc.next();
			int size = str.length();
			boolean isFalse = false;
			for(int i=0;i<size/2;i++) {
				if(str.charAt(i) != str.charAt(size-1-i)) {
					isFalse = true;
					break;
				}
			}
			
			System.out.print("#"+(t+1)+" ");
			if(isFalse) System.out.println(0);
			else System.out.println(1);
			
		}
	}

}
