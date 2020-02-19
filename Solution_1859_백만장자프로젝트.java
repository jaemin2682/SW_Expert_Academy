package swea.d2;
import java.util.Arrays;
import java.util.Scanner;
public class Solution_1859_백만장자프로젝트 {
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int t=0;t<T;t++) {
			int N = sc.nextInt();
			int price[] = new int[N];
			long money = 0L;
			boolean check[] = new boolean[N];
			for(int i=0;i<N;i++) {
				price[i] = sc.nextInt();	//가격들을 입력받아 배열에 저장
			}
			int bigVal = price[N-1];	//최대값
			int cnt = 0;	//살 개수
			for(int i=N-1;i>-1;i--) {	//뒤부터 탐색
				if(bigVal > price[i]) {
					check[i] = true;	//살 구간은 true, 팔 구간은 false
					cnt++;
				}
				bigVal = Integer.max(bigVal,  price[i]);
			}
			
			bigVal = price[N-1];	//최대값
			for(int i=N-1;i>-1;i--) {
				if(check[i]) {
					price[i] = bigVal - price[i];
				}
				else {
					bigVal = Integer.max(bigVal, price[i]);
				}
			}
			
			int res[] = new int[N];
			int idx = 0;
			for(int i=0;i<N;i++) {		//실제로 이득볼 금액들 저장
				if(check[i]) {
					res[idx] = price[i];
					idx++;
				}
			}
			Arrays.sort(res);	//자바 내림차순 정렬 몰라서 헛짓거리..
			for(int i=0;i<N/2;i++) {
				int temp = res[i];
				res[i] = res[N-1-i];
				res[N-1-i] = temp;
			}
			for(int i=0;i<cnt;i++) {
				money+=res[i];
			}
			
			System.out.println("#" + (t+1) + " " + money);
			
		}
	}

}

