package doubleEx;

public class TypeInference {

	public static void main(String[] args) {
		// 지역 변수 자료형 추론(local variable type inference)
		// 지역 변수만 가능 {} 내에서만 가능함
		var num = 10;
		var dNum = 10.0;
		var str = "hello";
		//자바 10 자료형 없이 변순 선언하기!
		// 타입을 추론한다 , 컴파일러가 변수에 대입되는 자료를 보고 추측하여 알 수 있습니다.
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(str);

	}

}
