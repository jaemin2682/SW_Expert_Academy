package swea.d2;

import java.util.Scanner;

public class Solution_2007_패턴마디의길이 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();
		for(int t=0;t<T;t++) {
			String str = sc.next();
			
			int size = 0;
			int size1 = 0;
			for(int i=1;i<11;i++) {
				if(str.substring(0, i).equals(str.substring(i, i*2)) &&
					str.substring(i, i*2).equals(str.substring(i*2, i*3))) {
					size = i;
					break;
				}
			}
			
			System.out.println("#"+(t+1)+" "+size);
		}
	}
}