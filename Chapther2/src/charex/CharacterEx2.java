package charex;

public class CharacterEx2 {

	public static void main(String[] args) {
		char ch1 = 'A';
		System.out.println(ch1); //문자 출력 A
		System.out.println((int)ch1); // 문자에 해당하는 정수 값 65 (아스키 코드)출력
		
		char ch2 = 66; // 정수 값 대입
		System.out.println(ch2); // 정수 값에 해당하는 문자 출력 -> B
		
		int ch3 = 67; 
		System.out.println(ch3); //문자 정수 값 출력 -> 67
		System.out.println((char)ch3);// 정수 값에 해당하는 문자 출력 -> C
		
		
	}

}
