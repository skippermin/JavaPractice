package charex;

public class CharacterEx22 {

	public static void main(String[] args) {
		char ch1 ='한';
		char ch2 ='\uD55C'; //유니코드 '한'값이고 16진수로 표현 
		/*16진수 숫자 하나가 4비트를 사용하므로 한글 '한'이라고
		 * 글자를 표현하는 데 4비트 4개, 즉 2바이트를 사용합니다. 
		 */
		
		System.out.println(ch1);
		System.out.println(ch2);
		
	}

}
