package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Solution_8673_코딩토너먼트1 {
static int k, size, first, second, tot, bigger;
static String strArr[];
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t= Integer.parseInt(br.readLine());
		for(int tc=0;tc<t;tc++) {
			tot = 0;
			k = Integer.parseInt(br.readLine());
			Queue<Integer> q = new LinkedList<Integer>();
			strArr = br.readLine().split(" ");
			size = strArr.length;
			for(int i=0;i<size;i++) q.add(Integer.parseInt(strArr[i]));	//다 넣고
			
			while(q.size() != 1) {		//queue의 사이즈가 1이면 종료
				first = q.poll();
				second = q.poll();
				bigger = Integer.max(first,  second);
				tot += Math.abs(first - second);
				q.add(bigger);
			}
			System.out.println("#"+(tc+1)+" "+tot);
		}
	}

}