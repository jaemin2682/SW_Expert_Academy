package swea.d3;

import java.util.Scanner;
import java.util.Stack;

public class Solution_8931_제로 {
static int num, sum;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int tc=0;tc<t;tc++) {
			int k= sc.nextInt();
			sum = 0;
			Stack<Integer> s = new Stack<Integer>();
			for(int i=0;i<k;i++) {
				num = sc.nextInt();
				if(num == 0) {
					sum -= s.pop();
				} else {
					s.push(num);
					sum += num;
				}
			}
			System.out.println("#"+(tc+1)+" "+sum);
		}
		
	}

}
