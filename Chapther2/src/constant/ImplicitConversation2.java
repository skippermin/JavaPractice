package constant;

public class ImplicitConversation2 {

	public static void main(String[] args) {
		byte bNum = 10;
		int iNum = bNum; //byte�� ���� int �� ������ ���Ե�
		
		System.out.println(bNum);
		System.out.println(iNum);

		int iNum2 = 20;
		float fNum = iNum2; // int�� ���� float�� ������ ���Ե�
		
		System.out.println(iNum);
		System.out.println(fNum);
		
		//double dNum = fNum + iNum;
		double dNum;
		dNum = fNum + iNum;
		System.out.println(dNum);

		
	}

}
