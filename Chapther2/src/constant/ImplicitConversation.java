package constant;

public class ImplicitConversation {

	public static void main(String[] args) {
		//�� ��ȯ
		
		byte bNum = 10;
		int num = bNum; //byte�� ���� bNum ���� int�� ���� iNum�� ������
		
		System.out.println(num);		
		
		//�� ��ȯ�� �Ͼ ���� long 1Num
		long lNum = 10; //10�̶�� ���� ���ͷ��� ���Ǯ�� 4byte���� ���� ������ ó�� long 8byte�� ���� -> ����ȯ
		float fNum = lNum; //�ִ� �� ������ �� -> float�� �� ������ �� -> �� ��ȯ
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //num �� float�� �� ��ȯ ��
		// ������� double�� ����ȯ�� �Ͼ��.
		System.out.println(dNum);

		
	}

}
