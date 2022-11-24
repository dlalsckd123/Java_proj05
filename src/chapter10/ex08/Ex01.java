package chapter10.ex08;

class Animal {
	void run() {
		System.out.println("모든 동물을 달립니다.");
	}
}
class Man extends Animal {
	void ManMethod() {
		System.out.println("Man 클래스의 메소드");
	}
	@Override
	void run() { 
		System.out.println("모든 남자는 달립니다.");
}
}
class Woman extends Animal{
	void WomanMethod() {
		System.out.println("Woman 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 여자는 달립니다.");
	}
}

class Lion extends Animal{
	void LionMethod() {
		System.out.println("Lion 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 사자는 달립니다.");
	}
}
class Tiger extends Animal{
	void TigerMethod() {
		System.out.println("Tiger 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 호랑이는 달립니다.");
	}
}

class Cat extends Animal{
	void CatMethod() {
		System.out.println("Cat 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 고양이는 달립니다.");
	}
}

class Dog extends Animal{
	void WomanMethod() {
		System.out.println("Dog 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 개는 달립니다.");
	}
}

class DogChild extends Dog{
	void DogChildMethod() {
		System.out.println("DogChild 클래스의 메소드");
	}
	@Override
	void run() {
		System.out.println("모든 강아지는 달립니다.");
	}
}
public class Ex01 {

	public static void main(String[] args) {
		// Animal : 부모클래스, run() 정의
		// 자식 클래스 : Man, Woman, Lion, Tiger, Cat, Dog, DogChild	<== 다형성
		//	- 부모의 run 메소드를 재 정의
		//	arr 배열에 Animal 저장후 For, Enhanced For 문으로 출력, run() 메소드 출력
		
		Animal a1 = new Animal();
		Animal a2 = new Man();
		Animal a3 = new Woman();
		Animal a4 = new Lion();
		Animal a5 = new Tiger();
		Animal a6 = new Cat();
		Animal a7 = new Dog();
		Dog d1 = new DogChild();
		
		Animal[] arr = new Animal[] { a1, a2, a3, a4, a5, a6, a7, d1};
		
		System.out.println("==== For 문을 사용해서 출력 ====");
		for(int i = 0; i<arr.length; i++) {
			Animal aa = arr[i];
			aa.run();
		}
		System.out.println("==== Enhanced for 문을 사용해서 출력 ====");
		for(Animal k : arr) {
			k.run();
		}
	}

}
