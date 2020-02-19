package swea.d2;

import java.util.Scanner;

public class Solution_1979_어디에단어가들어갈수있을까 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dx[] = {0, 1};
		int dy[] = {1, 0};
		int t = sc.nextInt();
		
		for(int tc = 0; tc < t; tc ++) {
			int N = sc.nextInt();
			int K = sc.nextInt();
			int res = 0;
			int puzzle[][] = new int[N][N];
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					puzzle[i][j] = sc.nextInt();
				}
			}
			
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(puzzle[i][j] == 1) {
						for(int z=0;z<2;z++) {
							boolean isFail = false;
							int nx = i + dx[z];
							int ny = j + dy[z];
							for(int a=0;a<K-1;a++) {
								if(nx >= N || ny>=N || puzzle[nx][ny]==0) {
									isFail = true;
									break;
								}
								nx += dx[z];
								ny += dy[z];
							}
							
							if(nx >= N || ny >= N || puzzle[nx][ny]==0) {
								//Empty
							}
							else isFail = true;
							
							nx = i-dx[z];
							ny = j-dy[z];
							if(nx < 0 || ny < 0 || puzzle[nx][ny]==0) {
								//Empty
							}
							else isFail = true;
							
							if(!isFail) res++;
						}
					}
				}
			}
			
			System.out.println("#"+(tc+1)+" "+res);
		}
	}

}
