package constant;

public class ExplicitConversation {

	public static void main(String[] args) {
		// 큰 수에서 작은수로 형 변환
		int iNum = 1000;
		byte bNum = (byte)iNum; //강제로 형을 바꾸려면 바꿀 형을 괄호를 써서 명시해야 한다.
		// 아이넘이 바이트로 변하는 것이 아니라 이 값이 바이트로 대입 될때 밖에서 대입된다
		System.out.println(iNum);
		System.out.println(bNum); // 큰수에서 작은수로 대입할 때 데이터 손실 및 유실된다.
		
		double dNum = 3.14; //8byte
		iNum = (int)dNum; //typecasing
		System.out.println(iNum); //소수점 이하 값은 유실 정수 부분의 값만 가져온다.
		//타입 케스팅을 하는 것 !
		
		float fNum = 0.9F;
		
		int num1 = (int)dNum + (int)fNum; // 더하기전에 int로 형 변환 했다. 3+4
		int num2 = (int)(dNum + fNum); // 2개의 실수를 먼저 더했다. 더하면 3.14 + 0.9 = 4.23
		// 4.23를 int로 바꾼 것!
		
		System.out.println(num1);
		System.out.println(num2);
	}

}
