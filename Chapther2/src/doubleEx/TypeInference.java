package doubleEx;

public class TypeInference {

	public static void main(String[] args) {
		// ���� ���� �ڷ��� �߷�(local variable type inference)
		// ���� ������ ���� {} �������� ������
		var num = 10;
		var dNum = 10.0;
		var str = "hello";
		//�ڹ� 10 �ڷ��� ���� ���� �����ϱ�!
		// Ÿ���� �߷��Ѵ� , �����Ϸ��� ������ ���ԵǴ� �ڷḦ ���� �����Ͽ� �� �� �ֽ��ϴ�.
		System.out.println(num);
		System.out.println(dNum);
		System.out.println(str);

	}

}
