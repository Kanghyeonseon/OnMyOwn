package sec03;

public class CastingExample {

	public static void main(String[] args) {
		int intvalue = 44032;
		char charvalue = (char) intvalue;
		System.out.println("charvalue:" + charvalue);
								// "가"가 출력된다.
		
		long longvalue = 500;
		intvalue = (int) longvalue;
		/* 오답
		int intvalue = (int) longvalue; 
		 						// intvalue 는 이미 정의되었으므로 한 번 더 정의하면 안 된다.
		 										*/
		System.out.println("intvalue : " + intvalue);
	}

}
