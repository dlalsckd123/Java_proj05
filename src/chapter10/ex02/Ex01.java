package chapter10.ex02;

class Human{
	String name;
	int age;
	
	void eat() {
		System.out.println("모든 사람은 먹습니다.");
	}
}

class Student extends Human {	
	String stuID;
	void StuEat() {
		System.out.println("학생은 방을 먹습니다.");
	}
}
class Student2 extends Student{
	String stu2ID;
	void stu2Eat() {
		System.out.println("학생 2는 음식을 맛나게 먹습니다.");
	}
}

public class Ex01 {

	public static void main(String[] args) {
		// 업캐스팅 실습
		// 1. Student 클래스를 생성하면서 Human 타입으로 지정 	: h1
		// 2. Student 클래스를 생성하면서 Student 타입으로 지정 	: s1
		
		// 3. Student2 객체를 생성하면서 Human 타입으로 지정 	: h2
		// 4. Student2 객체를 생성하면서 Student 타입으로 지정 	: s2
		// 5. Student2 객체를 생성하면서 Student2 타입으로 지정 : s3
		
		System.out.println("====h1 출력문====");
		Human h1 = new Student();
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//true
		System.out.println(h1 instanceof Student2); 	//false
		
		System.out.println("====s1 출력문====");
		Student s1 = new Student();
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//true
		System.out.println(h1 instanceof Student2); 	//false
		
		System.out.println("====h2 출력문====");
		Human h2 = new Student2();
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//true
		System.out.println(h1 instanceof Student2); 	//false
		
		System.out.println("====s2 출력문====");
		Student s2 = new Student2();
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//true
		System.out.println(h1 instanceof Student2); 	//false
		
		System.out.println("====s3 출력문====");
		Student2 s3 = new Student2();
		System.out.println(h1 instanceof Human); 		//true
		System.out.println(h1 instanceof Student); 		//true
		System.out.println(h1 instanceof Student2); 	//false
	}

}
