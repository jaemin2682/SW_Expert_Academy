package swea.d3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기2{
	public static void main(String[] args) throws Exception {
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=1;t<=T;t++) {
			int cnt = 1;
			String data = scan.next();
			int size = data.length();
			if(data.startsWith("1")) {
				cnt++;
			}
			
			for(int i=0;i<size-1;i++) {
				if(data.charAt(i) != data.charAt(i+1)) {
					cnt++;
				}
			}
			
			
			System.out.println("#"+t+" "+cnt);
		}
	}
}
