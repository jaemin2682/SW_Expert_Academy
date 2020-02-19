package swea.d4;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_4408_자기방으로돌아가기 {
static int T, N, cur, tar, ans;
static boolean check;
static int visit[];

public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine().trim());
		for(int tc=0;tc<T;tc++) {
			N = Integer.parseInt(br.readLine().trim());
			visit = new int[201];
			
			for(int i=0;i<N;i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				cur = Integer.parseInt(st.nextToken());
				tar = Integer.parseInt(st.nextToken());
				check = false;
				if(cur%2==1) cur++;
				if(tar%2==1) tar++;
				if(cur > tar) {
					int tem = cur;
					cur = tar;
					tar = tem;
				}
				for(int j=cur/2;j<=tar/2;j++) {
					visit[j]++;
				}
				ans = 0;
				for(int j=0;j<201;j++) {
					ans = Integer.max(ans,  visit[j]);
				}
				
			}
		
			System.out.println("#"+(tc+1)+" "+ans);
		}
	}

}
