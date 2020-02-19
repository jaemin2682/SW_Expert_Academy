package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution_8840_아바바바 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			long l = Integer.parseInt(br.readLine());
			System.out.println("#"+(tc+1)+" "+((l-1)/2)*((l-1)/2));
		}
	}
}