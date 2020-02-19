package swea.d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution_1258_행렬찾기 {
static int T, N, y, x, ny, nx, difY, difX, cnt;
static int mat[][];
static boolean visited[][];
static ArrayList<int[]> list;
static int dy[] = {0, 0, 1, -1};
static int dx[] = {1, -1, 0, 0};
private static String str;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			N = Integer.parseInt(br.readLine());
			cnt = 0;
			mat = new int[N][N];
			visited = new boolean[N][N];
			list = new ArrayList<int[]>();
			for(int i=0;i<N;i++) {
				str = br.readLine();
				for(int j=0, idx=0;j<N;j++,idx+=2) {
					mat[i][j] = str.charAt(idx) - '0';
				}
			}
			
			bfs();
			
			Collections.sort(list, new Comparator<int[]>() {
				@Override
				public int compare(int[] o1, int[] o2) {
					// TODO Auto-generated method stub
					if(o1[2] == o2[2]) return Integer.compare(o1[0], o2[0]);
					return Integer.compare(o1[2], o2[2]);
				}
			});
			
			System.out.print("#" + (tc+1) + " " + cnt + " ");
			for(int i=0;i<list.size();i++) System.out.print(list.get(i)[0] + " " +  list.get(i)[1] + " ");
			System.out.println();
		}
	}
	
	static void bfs() {
		ArrayDeque<int[]> q = new ArrayDeque<>();
		for(int i=0;i<N;i++) {
			for(int j=0;j<N;j++) {
				if(!visited[i][j] && mat[i][j] != 0) {
					difY=0; difX=0;
					cnt++;
					visited[i][j] = true;
					q.offer(new int[]{i, j});
					while(!q.isEmpty()) {
						y = q.peek()[0];
						x = q.poll()[1];
						for(int k=0;k<4;k++) {
							ny = y + dy[k];
							nx = x + dx[k];
							if(ny>=0 && ny<N && nx>=0 && nx<N && mat[ny][nx] != 0 && !visited[ny][nx]) {
								visited[ny][nx] = true;
								difY = Math.max(difY, ny-i+1);
								difX = Math.max(difX, nx-j+1);
								q.offer(new int[] {ny, nx});
							}
						}
					}
					list.add(new int[] {difY, difX, difY*difX});
				}
			}
			
		}
	}

}
