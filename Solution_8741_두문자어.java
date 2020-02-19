package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8741_두문자어 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++) {
			String str[] = br.readLine().split(" ");
			int size = str.length;
			System.out.print("#" + (i+1) + " ");
			for(int j=0;j<size;j++) {
				System.out.print(Character.toUpperCase(str[j].charAt(0)));
			}
			System.out.println();
		}
	}

}
