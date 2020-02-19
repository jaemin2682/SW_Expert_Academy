package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Solution_1229_암호문2 {
static int N, cmdCnt, idx, cnt;
static boolean isInsert;		//삽입, 삭제를 판단할 변수
static LinkedList<Integer> list;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		for(int i=0;i<10;i++) {
			N = Integer.parseInt(br.readLine());	//암호문 개수 입력
			list = new LinkedList<>();				//list 할당
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<N;j++) list.add(Integer.parseInt(st.nextToken()));	//list에 암호문들 삽입
			cmdCnt = Integer.parseInt(br.readLine());							//명령어 개수 입력
			StringTokenizer st2 = new StringTokenizer(br.readLine(), " ");
			for(int j=0;j<cmdCnt;j++) {											//명령어 개수만큼
				isInsert = st2.nextToken().equals("I") ? true : false;			//I면 true, D면 false
				idx = Integer.parseInt(st2.nextToken());						//idx 입력
				cnt = Integer.parseInt(st2.nextToken());						//cnt 입력
				if(isInsert) for(int k=0;k<cnt;k++) list.add(idx++, Integer.parseInt(st2.nextToken()));	//list에 추가
				else for(int k=0;k<cnt;k++) list.remove(idx);											//list에서 삭제
			}
			System.out.print("#"+(i+1)+" ");
			for(int j=0;j<10;j++) System.out.print(list.get(j) + " ");
			System.out.println();
		}
	}

}
