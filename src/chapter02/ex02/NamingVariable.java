package chapter02.ex02;

public class NamingVariable {

	public static void main(String[] args) {
		// 변수에는 값을 대입해서 변화되는 값을 할당 할 수 있다.
		// 변수 이름 지정 하기
		//  - 변수명은 소문자로 시작, 클래스 이름은 대문자로 시작 (필수)
		//  - 변수명으로 한글을 사용할 수 있는 byte (권장하지 않는다)
		//  - 변수명으로 특수문자는 _, $ 만 사용 가능
		//  - 변수명으로 숫자는 사용 가능하나 변수명 첫자리에 숫자가 오련 오류가 발생
		//  - 변수명으로 자바에서 사용하는 예약어는 사용하면 안됨 (package, class public)
		
		//자료형 변수명
		boolean aBcD; //boolean : true, False 에 넣을 수 있다.
		aBcD = true;
		aBcD = false;
		// aBcD = 10; -true, false 말고는 오류가 발생한다
		byte 가나다라; // 1byte의 데이터만 저장
		short _abcd; // _, $ 를 사용할 수 있다.
		boolean $_abcd; //
		//boolean %abcde; // _, $ 이외의 특수 문자는 변수명으로 사용 불가능
		//char 3abcd;		//
		char a3bcd;			// 
		long abcd3; 
		//double class;      /// 자바에서 사용되는 예약어는 변수명으로 사용할 수 없다.
		
		// int my work; // 변수명으로 공백은 매울수 없다.
		int myWork;		// 변수명은 처음은 소문자, 이어서 여러단어를 적용할때 첫자 대문자
		String myClassName; //권장 사항
		
		// 상수 : 값을 넣으면 그 값을 변화 하지 못하도록 설정 
		   // - 상수명은 전체를 대문자로 지정 (필수는 아니지만 권장)
		
		double PI = 3.141592;		// 변수 : PI 변수에 값을 변화 시켜 줄수 있다.
		System.out.println(PI); //3.141592
		PI = 123.456;
		System.out.println(PI); //123.456
		
		final double PI2 = 3.141592; //상수 : 값을 넣으면 수정 할 수 없다.
		System.out.println(PI2);
		// PI2 = 123.456;		//상수 이므로 다른 값을 넣을 수 없다.
		System.out.println(PI2);
		final int MY_DATA = 10;
		final float my_Data;  // 권고 사항 
		
		
		
	}

}
