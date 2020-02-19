package swea.d3;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Solution_1873_상호의배틀필드 {
	static int T, H, W, N;
	static String str;
	static char map[][];
	
	static class Tank {
		int y;
		int x;
		int vec;	//0:왼, 1:오, 2:위, 3:아래
		public Tank(int y, int x, int vec) {
			super();
			this.y = y;
			this.x = x;
			this.vec = vec;
		}
	}
	
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());
		for(int tc=0;tc<T;tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			H = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			map = new char[H][W];
			Tank tank = new Tank(0, 0, 0);
			for(int i=0;i<H;i++) {
				str = br.readLine();
				for(int j=0;j<W;j++) {
					map[i][j] = str.charAt(j);
					if(str.charAt(j) == '<') tank = new Tank(i, j, 0);
					else if(str.charAt(j) == '>') tank = new Tank(i, j, 1);
					else if(str.charAt(j) == '^') tank = new Tank(i, j, 2);
					else if(str.charAt(j) == 'v') tank = new Tank(i, j, 3);
				}
			}
			int storeY = tank.y;
			int storeX = tank.x;
			map[storeY][storeX] = '.';
			
			N = Integer.parseInt(br.readLine());
			str = br.readLine();
			
			for(int i=0;i<N;i++) {
				if(str.charAt(i) == 'L') {
					tank.vec = 0;
					if(tank.x-1 >= 0 && map[tank.y][tank.x-1] == '.') {
						tank.x -= 1;
					}
				}
				else if(str.charAt(i) == 'R') {
					tank.vec = 1;
					if(tank.x+1 < W && map[tank.y][tank.x+1] == '.') {
						tank.x += 1;
					}
				}
				else if(str.charAt(i) == 'U') {
					tank.vec = 2;
					if(tank.y-1 >= 0 && map[tank.y-1][tank.x] == '.') {
						tank.y -= 1;
					}
				}
				else if(str.charAt(i) == 'D') {
					tank.vec = 3;
					if(tank.y+1 < H && map[tank.y+1][tank.x] == '.') {
						tank.y += 1;
					}
				}
				else if(str.charAt(i) == 'S') {
					int y = tank.y;
					int x = tank.x;
					int vec = tank.vec;
					
					if(vec==0) {
						for(int j=0;j<20;j++) {
							x--;
							if(x < 0 || map[y][x] == '#') break;
							if(map[y][x] == '*') {
								map[y][x] = '.';
								break;
							}
						}
					}
					else if(vec==1) {
						for(int j=0;j<20;j++) {
							x++;
							if(x >= W || map[y][x] == '#') break;
							if(map[y][x] == '*') {
								map[y][x] = '.';
								break;
							}
						}
					}
					else if(vec==2) {
						for(int j=0;j<20;j++) {
							y--;
							if(y < 0 || map[y][x] == '#') break;
							if(map[y][x] == '*') {
								map[y][x] = '.';
								break;
							}
						}
					}
					else if(vec==3) {
						for(int j=0;j<20;j++) {
							y++;
							if(y >= H || map[y][x] == '#') break;
							if(map[y][x] == '*') {
								map[y][x] = '.';
								break;
							}
						}
					}
				}
			}
			
			map[storeY][storeX] = '.';
			if(tank.vec == 0) map[tank.y][tank.x] = '<';
			else if(tank.vec == 1) map[tank.y][tank.x] = '>';
			else if(tank.vec == 2) map[tank.y][tank.x] = '^';
			else if(tank.vec == 3) map[tank.y][tank.x] = 'v';
			
			System.out.print("#"+(tc+1)+" ");
			for(int i=0;i<H;i++) {
				for(int j=0;j<W;j++) {
					System.out.print(map[i][j]);
				}
				System.out.println();
			}
		}
	}
}
/*
3 5
^-#**
.-.#*
.-..#
15
SSSDRSSSDRSSSUU


*/
