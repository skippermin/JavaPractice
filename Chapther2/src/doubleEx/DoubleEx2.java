package doubleEx;

public class DoubleEx2 {

	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
			//for���� ������ ������ ������ Ƚ����ŭ �ݺ��ؼ� �����ϴ� �ݺ���
			// ���⿡���� ���ϱ⸦ 10000�� �ݺ��϶�� �ǹ��Դϴ�. 			
		}
		System.out.println(dnum);
		
	}

}
