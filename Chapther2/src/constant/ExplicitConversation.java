package constant;

public class ExplicitConversation {

	public static void main(String[] args) {
		// ū ������ �������� �� ��ȯ
		int iNum = 1000;
		byte bNum = (byte)iNum; //������ ���� �ٲٷ��� �ٲ� ���� ��ȣ�� �Ἥ ����ؾ� �Ѵ�.
		// ���̳��� ����Ʈ�� ���ϴ� ���� �ƴ϶� �� ���� ����Ʈ�� ���� �ɶ� �ۿ��� ���Եȴ�
		System.out.println(iNum);
		System.out.println(bNum); // ū������ �������� ������ �� ������ �ս� �� ���ǵȴ�.
		
		double dNum = 3.14; //8byte
		iNum = (int)dNum; //typecasing
		System.out.println(iNum); //�Ҽ��� ���� ���� ���� ���� �κ��� ���� �����´�.
		//Ÿ�� �ɽ����� �ϴ� �� !
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // ���ϱ����� int�� �� ��ȯ �ߴ�. 3+4
		int num2 = (int)(dNum + fNum); // 2���� �Ǽ��� ���� ���ߴ�. ���ϸ� 3.14 + 0.9 = 4.23
		// 4.23�� int�� �ٲ� ��!
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
