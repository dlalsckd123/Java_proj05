package chapter10.ex01;

class Animal{			//Animal클래스를 상속 해서 Tiger, Eagle, Lion 를 생성
						// 자식 클래스에서는 필드1, 메소드1 정의
						//LionChild 클래스는 Lion 클래스를 상속 해서 필드1, 메소드 1.
	String name;
	int age;
	String color;
	
	void eat() {
		System.out.println("모든 동물은 먹습니다.");
	}
	void sleep () {
		System.out.println("모든 동물은 잠을 잡니다.");
	}
}
class Tiger extends Animal{
int TigerID;
	
	void tigerName() {
		System.out.println("동물원의 호랑이 입니다.");	
}
}
class Eagle extends Animal{
int EagleID;
	
	void eagleName() {
		System.out.println("동물원의 독수리 입니다.");	
}
}
class Lion extends Animal{
int LionID;
	
	void lionName() {
		System.out.println("동물원의 사자 입니다.");	
}
}
class LionChild extends Lion{
	//Student2 --> Student --> Human
	//Human 의 모든 필드와 메소드
	//Student 의 모든 필드와 메소드 상속
	
	int Lion2ID;
	void lionName2 () {
		System.out.println("사자의 자식입니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		Animal a1 = new Animal();
		a1.name = "동물";
		a1.age = 100;
		a1.color = "동물색";
		System.out.println("이름은 : " + a1.name + "이며, 나이는 : "+a1.age+"살 입니다, 색상은 : "+a1.color +"입니다." );
		
		a1.eat();
		a1.sleep();
		
		System.out.println("====TIGER 출력====");
		Tiger t1 = new Tiger();
		t1.name = "호돌이";
		t1.age = 3;
		t1.color = "호랑이색";
		System.out.println("이름은 : " + t1.name + "이며, 나이는 : "+t1.age+"살 입니다, 색상은 : "+t1.color +"입니다." );
		
		t1.eat();
		t1.sleep();
		
		System.out.println("====Eagle 출력====");
		Eagle e1 = new Eagle();
		e1.name = "대머리";
		e1.age = 5;
		e1.color = "독수리색";
		System.out.println("이름은 : " + e1.name + "이며, 나이는 : "+e1.age+"살 입니다, 색상은 : "+e1.color +"입니다." );
		
		e1.eat();
		e1.sleep();
		
		System.out.println("====Lion 출력====");
		Lion l1 = new Lion();
		l1.name = "갈기털";
		l1.age = 9;
		l1.color = "사자색";
		System.out.println("이름은 : " + l1.name + "이며, 나이는 : "+l1.age+"살 입니다, 색상은 : "+l1.color +"입니다." );
			
		l1.eat();
		l1.sleep();
		
		System.out.println("====Lion2 출력====");
		LionChild l2 = new LionChild();
		l2.name = "아기사자";
		l2.age = 1;
		l2.color = "사자색";
		System.out.println("이름은 : " + l2.name + "이며, 나이는 : "+l2.age+"살 입니다, 색상은 : "+l2.color +"입니다." );
			
		l2.eat();
		l2.sleep();
		
	
	}

}
