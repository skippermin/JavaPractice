package variable;

public class IntegerVariableEx1 {

	public static void main(String[] args) {
		
		int num1 = 12345678900; // int형으로 표현할 수 있는 범위 넘어섰기 때문에
		// 2번째 long 자바는 모든 정수 값을 int형으로 처리 하기 때문입니다. 
		long num2 = 12345678900; // 따라서 이 숫자를 long형으로 처리하라고 컴파일러에게 알려주어야 합니다.
		long num3 = 12345678900L; // 소문자로 저장해도 된다고 하네요.
		
	}

}
