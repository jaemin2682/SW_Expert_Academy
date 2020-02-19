package swea.d3;

import java.io.FileInputStream;
import java.util.Scanner;

public class Solution_1289_원재의메모리복구하기{
	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("res/swea/d3/1289_�����Ǹ޸𸮺����ϱ�.txt"));
		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		for(int t=1;t<=T;t++) {
			int cnt = 1;
			String data = scan.next();
			int size = data.length();
			
			StringBuilder nData = new StringBuilder(data);	//��Ʈ�� �����ؼ� ������ ������ ���� ���
			
			//ù 1�� ��ġ�� ã��
			int idx = data.indexOf("1");		//���ڿ����� Ư�� ���ڰ� ó������ ��Ÿ���� ��ġ�� ��������(lastIndexOf�� �ڿ�������)
			for(int i=idx;i<=size;) {
				change(nData, i, size, ""+(cnt%2));
				if(data.equals(nData.toString())) { //string builder�� ���ڿ��� �ٲ��ְ�, ���� üũ��
					break;
				}
				//�� ���ڿ��� ���� �����Ƿ� �ٸ� ������ ã�´�.
				for(int j=i;j<size;j++) {
					//�� ���ڿ��� �� charAt(index) : ���ڿ��� index ��ġ�� �ش��ϴ� ���� �ϳ��� ����
					if(data.charAt(j) != nData.charAt(j)) {
						i = j;
						break;
					}
				}
				cnt++;	//���� bit�̹Ƿ� ���� ī��Ʈ�� ����
			}
			System.out.println("#"+t+" "+cnt);
		}
	}

	private static void change(StringBuilder nData, int start, int end, String fill) {
		// TODO Auto-generated method stub
		for(int i=start;i<end;i++) {
			nData.replace(i, i+1, fill);	//i��° ���� �ٲ��ְڴ�.
		}
	}
}
