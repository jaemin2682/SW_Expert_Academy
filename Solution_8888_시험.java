package swea.d3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.NoSuchElementException;

public class Solution_8888_시험 {
static int arr[][];
static int scores[];
static int grades[][];

	public static void main(String[] args) throws NumberFormatException, IOException, NumberFormatException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
	
		for(int a=0;a<T;a++) {
			String str[] = br.readLine().split(" ");
			int n = Integer.parseInt(str[0]);
			int t = Integer.parseInt(str[1]);
			int p = Integer.parseInt(str[2]);
	
			arr = new int[n][t];
			scores = new int[t];	//각 문제의 배점
			grades = new int[n][3];	//각 사람의 점수
			for(int i=0;i<n;i++) grades[i][0] = i+1;
			
			for(int i=0;i<n;i++) {		//arr배열 채움 & scores 배열 완성
				String filler[] = br.readLine().split(" ");
				for(int j=0;j<t;j++) {
					arr[i][j] = Integer.parseInt(filler[j]);
					if(arr[i][j] == 0) {
						scores[j]++;	//0인 개수 세어\서 각 문제의 배점 알아냄
					} else grades[i][2]++;	//맞춘 문제 수 누적
				}
			}
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<t;j++) {
					if(arr[i][j] == 1) grades[i][1] += scores[j];	//각 사람의 점수 누적
				}
			}
			
			//Arrays.sort(grades, Comparator.comparingInt(a -> a[1]));
			Arrays.sort(grades, (o1, o2) -> {
				if(o1[1] == o2[1] && o1[2] == o2[2]) return Integer.compare(o1[0], o2[0]);
				else if(o1[1] == o2[1]) return Integer.compare(o2[2],  o1[2]);
				else return Integer.compare(o2[1], o1[1]);
			});

			
			for(int i=0;i<n;i++) {
				if(grades[i][0] == p) {
					System.out.println("#"+(a+1)+" "+grades[i][1] + " "+(i+1));
					break;
				}
			}
			
		}
		
		
	}

}
