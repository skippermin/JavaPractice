package doubleEx;

public class DoubleEx2 {

	public static void main(String[] args) {
		double dnum = 1;
		
		for(int i=0; i<10000; i++) {
			dnum = dnum + 0.1;
			//for문은 지정한 문장을 정해진 횟수만큼 반복해서 수행하는 반복문
			// 여기에서는 더하기를 10000번 반복하라는 의미입니다. 			
		}
		System.out.println(dnum);
		
	}

}
