package chpater11.ex04;

abstract class Car { 		//트럭, 자가용, 굴삭기 	<<== 추상 메소드를 구현한 클래스 생성
	abstract void run();
	abstract void eat();
}
class tr extends Car{
	@Override
	void run() {
		System.out.println("트럭이 굴러갑니다.");
		
	}
	@Override
	void eat() {
		System.out.println("트럭은 휘발유를 먹습니다.");
		
	}
}
class ja extends Car{
	@Override
	void run() {
		System.out.println("자가용이 굴러갑니다.");
		
	}
	@Override
	void eat() {
		System.out.println("자가용은 휘발유를 먹습니다.");
		
	}
}
abstract class gu extends Car{
	@Override
	void run() {
		System.out.println("굴삭기는 굴러갑니다.");
		
	}
}
	class g2 extends gu{
		
	
	@Override
	void eat() {
		System.out.println("굴삭기는 휘발유를 먹습니다.");
	
	}
}

public class Ex01 {

	public static void main(String[] args) {
		
		System.out.println("========트럭 출력문===========");
		Car c1 = new tr();
		c1.run();
		c1.eat();
		
		System.out.println("========자가용 출력문===========");
		Car c2 = new ja();
		c2.run();
		c2.eat();
		
		System.out.println("========굴삭기 출력문===========");
		gu c3 = new g2();
		c3.run();
		c3.eat();
		
		//gu c4 = new Car();
		//c4.run();
		//c4.eat();
		
		//g2 c4 = new gu();
		//c4.eat();
		//c4.run();
	}

}
