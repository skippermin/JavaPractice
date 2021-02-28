package constant;

public class ImplicitConversation {

	public static void main(String[] args) {
		//형 변환
		
		byte bNum = 10;
		int num = bNum; //byte형 변수 bNum 값을 int형 변수 iNum에 대입함
		
		System.out.println(num);		
		
		//형 변환이 일어난 거임 long 1Num
		long lNum = 10; //10이라는 수는 리터럴이 상수풀에 4byte으로 저장 지금은 처음 long 8byte에 저장 -> 형변환
		float fNum = lNum; //애는 덜 정밀한 수 -> float는 더 정밀한 수 -> 형 변환
		
		System.out.println(fNum);
		
		double dNum = fNum + num; //num 이 float로 형 변환 됨
		// 결과값이 double로 형변환이 일어난다.
		System.out.println(dNum);

		
	}

}
