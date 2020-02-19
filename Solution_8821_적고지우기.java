package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8821_적고지우기 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			boolean arr[] = new boolean[10];
			String str = br.readLine();
			int size = str.length();
			for(int i=0;i<size;i++) {
				if(arr[str.charAt(i)-48]==true) arr[str.charAt(i)-48] = false;
				else arr[str.charAt(i)-48] = true;
			}
			int res = 0;
			for(int i=0;i<10;i++) 
				if(arr[i] == true) res++;
			
			System.out.println("#"+(tc+1)+" "+res);
		}
	}

}
