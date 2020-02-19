package swea.d2;

import java.util.Scanner;

/* Name of the class has to be "Main" only if the class is public. */
class Solution_1954_달팽이숫자
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int[] dx = {0, 1, 0, -1};	//delta함수(우, 하, 좌, 상)
		int[] dy = {1, 0, -1, 0};

		int T = sc.nextInt();
		
		for(int t=1;t<T+1;t++) {
			int N = sc.nextInt();
            int snail[][] = new int[N][N];
            
			int num = 1;
			int x = 0;
			int y = 0;
            boolean fin = false;	//while문을 빠져나오기 위한 flag(완료여부)
            
            System.out.println("#"+t);
			
			while(true) {
				for(int i=0;i<4;i++) {
					while(x < N && y < N && x > -1 && y > -1 && snail[x][y]==0) {
						snail[x][y] = num;
						num++;
						if(num > N*N) {
							fin = true;
							break;
						}
						x += dx[i];
						y += dy[i];
					}
					if(fin) break;
					x -= dx[i];
					y -= dy[i];
					num--;
                    snail[x][y] = 0;
				}
				if(fin) break;
			}
			
			for(int j=0;j<N;j++) {
				for(int k=0;k<N;k++) {
					System.out.print(snail[j][k] + " ");
				}
				System.out.println();
			}
			
		}
		
	}
}