package doubleEx;

public class TypeInferenceEx {

	public static void main(String[] args) {
		var i = 10; //int i = 10 ���� �����ϵ�
		var j = 10.0; //double j = 10.0 ���� �����ϵ�
		var str = "hello"; // String str = "hello"�� �����ϵ�
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "test"; //�ٸ� ���ڿ��� ���� ����
		//str = 3; str ������ string������ ���� ���Ǿ��� ������ ���� ���� ���� �� ����

		
	}

}
