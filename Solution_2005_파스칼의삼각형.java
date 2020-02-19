package swea.d2;

import java.util.Scanner;

public class Solution_2005_파스칼의삼각형 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dx[] = {-1, -1};
		int dy[] = {0, -1};
		
		int T = sc.nextInt();	//왼쪽위 대각선, 위
		for(int t=0;t<T;t++) {
			int N= sc.nextInt();
			int arr[][] = new int[N][N];
			arr[0][0] = 1;
			
			for(int i=1;i<N;i++) {
				for(int j=0;j<=i;j++) {
					int num = 0;
					for(int k=0;k<2;k++) {
						if(i + dx[k] > -1 && j + dy[k] > -1) {
							arr[i][j] += arr[i+dx[k]][j+dy[k]];
						}
					}
				}
			}
			System.out.println("#"+(t+1));
			for(int i=0;i<N;i++) {
				for(int j=0;j<=i;j++) {
					System.out.print(arr[i][j] + " ");
				}
				System.out.println();
			}
		}
	}

}
