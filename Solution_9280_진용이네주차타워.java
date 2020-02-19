package swea.d3;

import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;
public class Solution_9280_진용이네주차타워 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t= sc.nextInt();
		
		for(int tc=0;tc<t;tc++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			int place[] = new int[n];
			int price[] = new int[n];
			int weight[] = new int[m];
			Queue<Integer> q = new LinkedList<Integer>();
			for(int i=0;i<n;i++) price[i] = sc.nextInt();
			for(int i=0;i<m;i++) weight[i] = sc.nextInt();
			int totPrice = 0;
			for(int i=0;i<2*m;i++) {
				int inOut = sc.nextInt();
				if(inOut > 0) {					//양수면
					boolean full = true;
					for(int j = 0;j<n;j++) {
						if(place[j] == 0) {		//빈 곳을 찾아 차량을 넣음
							place[j] = inOut;
							full = false;
							break;		//place : {3, 2
						}
					}
					if(full) q.offer(inOut);	//빈곳이 없으면 저장
				}
				else {							//음수면	
					int myPlace = 0;
					for(int j=0;j<n;j++) {
						if(place[j] == Math.abs(inOut))	{	//차량을 찾고
							myPlace = j;
							place[j] = 0;	//
							if(!q.isEmpty()) place[j] = q.poll();	//대기가 있으면 대기자를 넣어줌
							break;
						}
					}
					totPrice += price[myPlace] * weight[Math.abs(inOut)-1];
				}			
			}
			System.out.println("#"+(tc+1)+" "+totPrice);
		}
	}

}

