package swea.d4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
 
public class Solution_1494_사랑의카운슬러 {
 	private static int T, N;
	private static long ans;
	private static int[][] map = new int[20][2];
	private static boolean[] visited = new boolean[20];

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<T+1;tc++) {
			N = Integer.parseInt(br.readLine());
			Arrays.fill(visited, false);
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				map[i][0] = Integer.parseInt(st.nextToken());
				map[i][1] = Integer.parseInt(st.nextToken());				
			}
			ans = Long.MAX_VALUE;
			dfs(0, 0);
			System.out.println("#"+tc+" "+ ans);
		}
	}
	private static void dfs(int cnt, int start) {
		//base_case
		if(cnt == N/2) {
//			for(int i=0;i<N;i++) System.out.print(visited[i] + " ");
//			System.out.println();
			long sumY=0, sumX=0;
			for(int i=0;i<N;i++) {
				if(!visited[i]) {	//대쉬받는 지렁이
					sumY -= map[i][0];
					sumX -= map[i][1];
				}					//두 벡터의 합 : (y1-y2)+(y3-y4) -> y1 + y3 - y2 - y4
				else {				//대쉬하는 지렁이
					sumY += map[i][0];
					sumX += map[i][1];
				}
			}
			ans = Long.min(ans, sumY*sumY+sumX*sumX);
			return;
		}
		for(int i=start;i<N;i++) {			//조합을 구해줌
			if(!visited[i]) {
				visited[i] = true;
				dfs(cnt+1, i+1);
				visited[i] = false;
			}
		}
		
	}
 
}
/*
1 2 3 4가 잇을 때,
두 벡터의 합 = ((x1-x3)+(x2-x4), (y1-y3)+(y2-y4)) = (vy, vx)

#1 80000000000
#2 754
#3 1109
*/