package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
		System.out.println("charvalue:" + charvalue);
								// "��"�� ��µȴ�.
		
		long longvalue = 500;
		intvalue = (int) longvalue;
		/* ����
		int intvalue = (int) longvalue; 
		 						// intvalue �� �̹� ���ǵǾ����Ƿ� �� �� �� �����ϸ� �� �ȴ�.
		 										*/
		System.out.println("intvalue : " + intvalue);
	}

}
