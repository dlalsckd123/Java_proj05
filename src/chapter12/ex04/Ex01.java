package chapter12.ex04;

interface Animal extends Animal1, Animal2, Animal3{}

interface Animal1 {
	void cry();
}

interface Animal2 {
	void run();
	
}

interface Animal3 {
	void eat();
}

//Cat, Tiger	< == cry(), run()
//Dog, Lion 	< == run(), eat()
//Eagle			< == cry(), run(), eat

//배열에 넣어서 오버라이딩된 메소드 출력
	//instanceof를 사용해서 객체 내부에 Cat, Tiger 타입이 존재하면 Cry, run()
	//instanceof를 사용해서 객체 내부에 Dog, Lion 타입이 존재하면 eat(), run()
	//instanceof를 사용해서 객체 내부에 Eagle 타입이 존재하면 eat(), run(), cry()

class Cat  implements Animal {
	@Override
	public void cry() {
		System.out.println("냐옹");
	}
	@Override
	public void run() {
		System.out.println("냥냥냥냥");
	}	
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
		
}
class Tiger  implements Animal{
	@Override
	public void cry() {
		System.out.println("어흫");
	}
	@Override
	public void run() {
		System.out.println("호다다다닥");
	}
	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}
}

class Dog  implements Animal{
	@Override
	public void run() {
		System.out.println("멍멍");
	}
	@Override
	public void eat() {
		System.out.println("개사료");
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
	
}
class Lion implements  Animal{
	@Override
	public void run() {
		System.out.println("크아아아앙");
	}
	@Override
	public void eat() {
		System.out.println("생고기");
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		
	}
}
class Eagle implements  Animal{
	@Override
	public void cry() {
		System.out.println("끼요오오오옷");
	}
	@Override
	public void run() {
		System.out.println("펄럭펄럭");
	}
	@Override
	public void eat() {
		System.out.println("참새고기");
	}
	@Override
	public String toString() {
		return "Eagle [toString()=" + super.toString() + "]";
	}
}



	
public class Ex01{
	public static void main(String[] args) {
		Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		
		//System.out.println("====cry, run 두개만 포함====");
		Animal[] arr = new Animal[] {a1, a2, a3, a4 ,a5};
		
		
		for(int i=0; i<arr.length; i++) {
			if(arr[i] instanceof Cat || arr[i] instanceof Tiger ) {
			System.out.println();
			arr[i].cry();
			arr[i].run();
		}else if(arr[i] instanceof Dog || arr[i] instanceof Lion) {
			System.out.println();
			arr[i].eat();
			arr[i].run();
		}else {
			System.out.println();
			arr[i].cry();
			arr[i].eat();
			arr[i].run();
		}
		}
		}
}
/*
 //강사님 방법
 interface Animal {
 }

interface Animal1 extends Animal {
	void cry();
}

interface Animal2 extends Animal{
	void run();
	
}

interface Animal3 extends Animal {
	void eat();
}
 class Cat  implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("냐옹");
	}
	@Override
	public void run() {
		System.out.println("냥냥냥냥");
	}	

class Tiger  implements Animal1, Animal2 {
	@Override
	public void cry() {
		System.out.println("어흥");
	}
	@Override
	public void run() {
		System.out.println("호랑이는 달립니다.");
	}	
	
	class Dog  implements Animal2, Animal3 {
	@Override
	public void run() {
		System.out.println("");
	}
	@Override
	public void eat() {
		System.out.println("냥냥냥냥");
	}	
	
	.........
	
	
	Public class Ex01{
	public static void main(String[] args){
	Animal a1 = new Cat();
		Animal a2 = new Tiger();
		Animal a3 = new Dog();
		Animal a4 = new Lion();
		Animal a5 = new Eagle();
		Animal[] arr = new Animal[] {a1, a2, a3, a4 ,a5};
		
		for (int i = 0; i<arr.length; i++){
		if(arr[i] instanceof Cat || arr[i] instanceof Tiger){
			((Animal1)arr[i]).cry();
			((Animal2)arr[i]).run();
		}
		if(arr[i] instanceof Dog || arr[i] instanceof Lion){
			((Animal3)arr[i]).eat();
			((Animal2)arr[i]).run();
			}
		if(arr[i] instanceof Eagle){
			((Animal1)arr[i]).cry();
			((Animal3)arr[i]).eat();
			((Animal2)arr[i]).run();
			}
		}
		}
	

  */

