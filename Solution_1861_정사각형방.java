package swea.d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution_1861_정사각형방 {
	static int T, N, y, x, ny, nx, cnt;
	static int arr[][], score[][];
	static boolean visited[][];
	static ArrayDeque<Pos> q;
	static int dy[] = {0, 0, 1, -1};
	static int dx[] = {1, -1, 0, 0};
	
	static class Pos {
		int y;
		int x;
		public Pos(int y, int x) {
			super();
			this.y = y;
			this.x = x;
		}
	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];
			score = new int[N][N];
			visited = new boolean[N][N];
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=0;j<N;j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			int maxCnt = 0;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					bfs(i, j);
					score[i][j] = cnt;
					maxCnt = Integer.max(maxCnt,  cnt);
				}
			}
			int minNum = Integer.MAX_VALUE;
			for(int i=0;i<N;i++) {
				for(int j=0;j<N;j++) {
					if(score[i][j] == maxCnt) {
						minNum = Integer.min(minNum,  arr[i][j]);
					}
				}
			}
			
			System.out.println("#"+(tc+1)+" "+minNum + " "+maxCnt);
			
		}
	}
	
	static void bfs(int sy, int sx) {
		cnt = 1;
		for(int i=0;i<N;i++) Arrays.fill(visited[i], false);
		q = new ArrayDeque<>();
		q.add(new Pos(sy, sx));
		while(!q.isEmpty()) {
			y = q.peek().y;
			x = q.poll().x;
			for(int i=0;i<4;i++) {
				ny = y + dy[i];
				nx = x + dx[i];
				if(ny<N && ny>=0 && nx<N && nx>=0 && arr[ny][nx] == arr[y][x]+1) {
					q.add(new Pos(ny, nx));
					cnt++;
				}
			}
		}	
	}
}
