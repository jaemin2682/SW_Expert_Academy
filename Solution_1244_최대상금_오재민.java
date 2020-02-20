package A_ProblemSolving;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Solution_1244_최대상금_오재민 {

	private static int T, chance, size, ans;
	private static int arr[] = new int[6];
	private static String str;
	private static HashMap<Integer, Integer> m = new HashMap<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		
		for(int tc=1;tc<=T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			m.clear();
			str = st.nextToken();
			size = str.length();
			ans = 0;
			for(int i=0;i<size;i++) arr[i] = str.charAt(i) - '0';
			chance = Integer.parseInt(st.nextToken());
			
			dfs(arr, chance);
			
			System.out.println("#"+tc+" "+ans);
		}
	}
	private static void dfs(int[] arr, int chance) {
		//base_case
		if(chance == 0) {							//다 바꿨으면
			int res = 0;
			for(int i=0;i<size;i++) {				//바꾼 수 도출
				res += arr[i]*(int)Math.pow(10, size-i-1);
			}
		//	System.out.println(res);
			ans = Integer.max(res, ans);			//최댓값 구하기
			return;
		}
		int res = 0;
		for(int i=0;i<size;i++) {					//바꾼 수 도출
			res += arr[i]*(int)Math.pow(10, size-i-1);
		}
		
		if(m.containsKey(res)) return;				//이미 나온 수면 return
		else m.put(res, 0);							//아니면 put
		
		//backtracking	
		for(int j=0;j<size;j++) {
			for(int i=0;i<size;i++) {
				if(j == i) continue;		//본인과는 바꿀 수 없다.
				
				int temp = arr[i];			//swap
				arr[i] = arr[j];
				arr[j] = temp;
				
				dfs(arr, chance-1);
				
				temp = arr[i];			//re-swap
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
	}

}
/*
0~size-1 을 순열을 돌려서 


size를 재서 가장 큰 수를 구한다.(큰 수, 인덱스 저장)
맨 앞인덱스부터 돌면서 큰 수와 같지 않고, 인덱스가 다르다면, 바꿔준다.


*/