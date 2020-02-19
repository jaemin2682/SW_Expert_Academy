package swea.d2;

import java.util.Arrays;
import java.util.Scanner;

public class Solution_1983_조교의성적매기기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double middle;
		double finals;
		double homework;
		
		for(int tc=0;tc<t;tc++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			double arr[] = new double[N];
			double tem[] = new double[N];
			double total = 0;
			for(int i=0;i<N;i++) {
				middle = sc.nextDouble();
				finals = sc.nextDouble();
				homework = sc.nextDouble();
				total = middle*0.35 + finals*0.45 + homework*0.2;
				arr[i] = total;
			}
			tem = arr.clone();
			Arrays.sort(tem);
			
			System.out.print("#"+(tc+1)+" ");
			int factor = N/10;
			K--;
			if(arr[K] <= tem[factor-1]) System.out.println("D0");
			else if(arr[K] <= tem[2*factor-1]) System.out.println("C-");
			else if(arr[K] <= tem[3*factor-1]) System.out.println("C0");
			else if(arr[K] <= tem[4*factor-1]) System.out.println("C+");
			else if(arr[K] <= tem[5*factor-1]) System.out.println("B-");
			else if(arr[K] <= tem[6*factor-1]) System.out.println("B0");
			else if(arr[K] <= tem[7*factor-1]) System.out.println("B+");
			else if(arr[K] <= tem[8*factor-1]) System.out.println("A-");
			else if(arr[K] <= tem[9*factor-1]) System.out.println("A0");
			else System.out.println("A+");
			
		}
	}

}
