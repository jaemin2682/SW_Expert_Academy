package swea.d2;

import java.util.Scanner;

public class Solution_1974_스도쿠검증 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int sudoku[][] = new int[9][9];
			boolean isGood = true;
			
			for(int i=0;i<9;i++) {
				for(int j=0;j<9;j++) {
					sudoku[i][j] = sc.nextInt();
				}
			}
			a:	//3*3 체크
			for(int a=0;a<3;a++) {
				for(int b=0;b<3;b++) {
					boolean check[] = new boolean[10];
					for(int i=a*3;i<(a+1)*3;i++) {
						for(int j=b*3;j<(b+1)*3;j++) {
							check[sudoku[i][j]] = true;	//boolean 배열에 체크
						}
					}
					
					for(int k=1;k<10;k++) {
						if(!check[k]) {
							isGood = false;
							break a;
						}
					}
				}
			}
			
			b:	//가로 체크
			for(int i=0;i<9;i++) {
				boolean check[] = new boolean[10];
				for(int j=0;j<9;j++) {
					check[sudoku[i][j]] = true;
				}
				for(int k=1;k<10;k++) {
					if(!check[k]) {
						isGood = false;
						break b;
					}
				}
			}
			
			c:	//세로 체크
				for(int i=0;i<9;i++) {
					boolean check[] = new boolean[10];
					for(int j=0;j<9;j++) {
						check[sudoku[j][i]] = true;
					}
					for(int k=1;k<10;k++) {
						if(!check[k]) {
							isGood = false;
							break c;
						}
					}
				}
			
			System.out.print("#" + (tc+1) + " ");
			if(isGood) System.out.println(1);
			else System.out.println(0);
		}
	}

}
