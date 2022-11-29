package chpater13.ex05.a;

interface A {
	void cry();
	void fly();
}
class B {
	
	A a = new C();
	
	void abc() {
		a.cry();
		a.fly();
		//인너 클래스 : 외부파일에 별도로 생성하지 않고 클래스 내부에 생성 후 바로 사용
		}
		
	}
	class C implements A {
		@Override
		public void cry() {
			System.out.println("끼요오옷");
			
		}
		@Override
		public void fly() {
			System.out.println("펄럭펄럭");
			
		}
	}


//A 클래스의 abc() 메소드 호출시 C 클래스의 구현된 메소드 출력 

public class Anonimous_Class01 {

	public static void main(String[] args) {
		B b = new B();
		b.abc();

	}

}
