package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1228_암호문1 {
static int N, gaesu, idx, cnt;
static LinkedList<Integer> list;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<10;i++) {
			N = Integer.parseInt(br.readLine());
			list = new LinkedList<>();
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) list.add(Integer.parseInt(st.nextToken()));
			gaesu = Integer.parseInt(br.readLine());
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<gaesu;j++) {
				char x = st2.nextToken().charAt(0);
				idx = Integer.parseInt(st2.nextToken());
				cnt = Integer.parseInt(st2.nextToken());
				for(int k=0;k<cnt;k++) {
					list.add(idx++, Integer.parseInt(st2.nextToken()));
				}
			}
			System.out.print("#"+(i+1)+" ");
			for(int j=0;j<10;j++) System.out.print(list.get(j) + " ");
			System.out.println();
		}
	}

}
