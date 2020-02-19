package swea.d2;

import java.util.Scanner;

public class Solution_1926_간단한369게임 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int i=1;i<N+1;i++) {
			if(Integer.toString(i).contains("3") ||	//3 or 6 or 9를 포함하면
				Integer.toString(i).contains("6") ||
				Integer.toString(i).contains("9")) {
				String str = Integer.toString(i);
				int size = str.length();
				for(int j=0;j<size;j++) {
					if(str.charAt(j) == '3' ||
						str.charAt(j) == '6' ||
						str.charAt(j) == '9') {
						System.out.print("-");
					}
				}
				System.out.print(" ");
			}
			else {
				System.out.print(i + " ");
			}
		}
	}
}
