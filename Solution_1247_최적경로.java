package A_ProblemSolving;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Solution_1247_최적경로_오재민 {

	private static int T, N, comY, comX, homeY, homeX, ans;
	private static boolean[] visited;
	private static ArrayList<int[]> list = new ArrayList<>();

	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=1;tc<=T;tc++) {
			N = Integer.parseInt(br.readLine());
			list.clear();
			ans = Integer.MAX_VALUE;
			visited = new boolean[N];
			StringTokenizer st = new StringTokenizer(br.readLine());
			comX = Integer.parseInt(st.nextToken()); comY = Integer.parseInt(st.nextToken());		//X, Y 순으로 입력됨에 주의
			homeX = Integer.parseInt(st.nextToken()); homeY = Integer.parseInt(st.nextToken());
			for(int i=0;i<N;i++) list.add(new int[] {Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()), i});  //X, Y, Index 순서임
			dfs(0, 0, comY, comX);
			System.out.println("#"+tc+" "+ans);
		}
	}

	private static void dfs(int cnt, int sum, int remY, int remX) {
		//base_case
		if(cnt == N) {
			ans = Integer.min(ans, sum + Math.abs(remX - homeX) + Math.abs(remY - homeY));
			return;
		}
		for(int i=0;i<N;i++) {
			if(visited[i]) continue;	//방문한데 또 안감
			visited[i] = true;
			dfs(cnt+1, sum+Math.abs(remX - list.get(i)[0]) + Math.abs(remY - list.get(i)[1]), list.get(i)[1], list.get(i)[0]); //이전손님과 이번손님의 거리
			visited[i] = false;
		}
	}
}
/*
회사에서 출발 > 고객 집을 전부 방문 > 집
고객 최대 10명 -> 순열 쌉가능
모든순열에 대해 ㄱㄱ

좌표 어디저장? int[]형 ArrayList에 저장, index도 같이 저장해주면 좋을듯?
그 index로 visited배열 활용하자.
*/