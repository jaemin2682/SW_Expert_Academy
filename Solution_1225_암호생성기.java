package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

public class Solution_1225_암호생성기 {
static int t;
static int num;

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int T=0;T<10;T++) {
			t = Integer.parseInt(br.readLine());
			ArrayDeque<Integer> q = new ArrayDeque<>();
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int i=0;i<8;i++) q.offer(Integer.parseInt(st.nextToken()));
			
			boolean finish = false;
			
			end :
			while(true) {
				for(int i=1;i<=5;i++) {
					num = q.poll();
					num-=i;
					if(num<=0) {
						num = 0;
						finish = true;
					}
					q.offer(num);
					if(finish) break end;
				}
			}
			
			System.out.print("#"+t+" ");
			for(int i=0;i<8;i++) System.out.print(q.poll() + " ");
			System.out.println();
		}
	}

}