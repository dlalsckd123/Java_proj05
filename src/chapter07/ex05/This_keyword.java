package chapter07.ex05;

class A{
	//필드
	int m;
	int n;
	
	//메소드 : 정수값 2개를 받음 , this 키를 생략한 경우
	void init (int a, int b) { 	//메소드 내의 : a, b, c <== 지역 변수, 
		int c; 
		c = 3;
		m = a;		//this.m : 인풋 매개변수 , 실행블락에 매개변수 받는변수, 필드의 변수
		n = b;		//this.b : 기본적으로 this 키가 생략되어 있다.
		
		
	}
	//this 키를 명시 해야 하는 경우
	void init2 (int m, int n) {
		m = m;
		n = n;
	}
	
	//메소드
	void work() {
		this.init (2, 3); 		//this : 자신의 객체의 필드나 메소드 호출.
		System.out.println(m + " " + n);
	}
	
}


public class This_keyword {

	public static void main(String[] args) {
		// This : 자기 자신 객체의 필드나 메소드, <== 필드 , 메소드에 적용
		// This() : 자신객체의 다른 생성자 호출시 사용
		// super : 상속에서 부모의 객체의 필드나, 메소드를 사용. <
		// super() : 부모클래스의 생성자 호출 할때 사용

		
	}

}
