package chpater13.ex08;

interface Animal{
	public void cry();
	public void fly();
}
class B {
	Animal b = new Bb();
	void bcd() {
		b.cry();
		b.fly();
	}
	
}
class Bb implements Animal{
	@Override
	public void cry() {
		System.out.println("독수리는 끼요오옷");
		
	}
	@Override
	public void fly() {
		System.out.println("펄럭펄럭");
		
	}
}

class A{
	//2. 익명 이너 클래스
	Animal a = new Animal() {
		public void cry() {System.out.println("고양이는 야옹");}
		public void fly() {System.out.println("고양이는 못날아");}
	};
	void abc() {
		a.cry();
		a.fly();
	}
}

class C {
	//메소드의 인풋 매개변수의 타입이 : interface Animal
	void cde(Animal c) {
		c.cry();
		c.fly();
	}
}

//인터페이스를 사용해서 4가지 형태로 출력
// 1. Animal을 구현한 Inner 클래스를 생성 후 메소드 출력
// 2. Animal을 익명 클래스로 생성해서 출력
// 3. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 생성
// 4. 객체 메소드의 인풋 매개변수로 Animal 타입을 인풋 받아서 출력 : 참조변수 없이 출력

public class Ex01 {

	public static void main(String[] args) {
		//1. Inner 클래스
		System.out.println("==== Inner 클래스 소환 ====");
		B a1 = new B();
		a1.bcd();
		
		
		//2. 익명클래스
		System.out.println("==== 익명 클래스 소환 ====");
		A a2 = new A();
		a2.abc();
		
		//3. 매개변수 참조변수 생성
		System.out.println("==== 매개변수 참조변수 생성 소환 ====");
		C a3 = new C();
		Animal a4 = new Animal() {
			@Override
			public void cry() {
				System.out.println("호랑이는 어흥");
			}
			@Override
			public void fly() {
				System.out.println("호랑이는 날지 못한다.");
			}
		};
		a3.cde(a4);
		
		//4. 매개변수 참조변수 없이 생성.
		System.out.println("==== 매개변수 참조변수 없이 출력 소환 ====");
		a3.cde(new Animal(){
		@Override
		public void cry() {
			System.out.println("강아지는 멍멍");
		}
		@Override
		public void fly() {
			System.out.println("강아지는 날지 못한다.");
		}
		});
	}

}
