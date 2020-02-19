package swea.d2;

import java.util.Scanner;

public class Solution_1940_가랏RC카 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int option, force;
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int speed=0, dis=0;
			for(int i=0;i<n;i++) {
				option = sc.nextInt();
				force=0;
				if(option == 1 || option == 2) force = sc.nextInt();
				if(force != 0) {
					if(option == 1) speed+=force;
					else if(option == 2) {
						speed -= force;
						if(speed < 0) speed=0;
					}
				}
				dis += speed;
			}
			System.out.println("#"+(tc+1)+" "+dis);
		}
	}
}
