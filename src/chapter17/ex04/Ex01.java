package chapter17.ex04;

import java.util.ArrayList;

//car 객체를 3개정도 생성해서 ArrayList에 저장후 객체를 출력시 필드의 값을 출력 하도록함.
//for. Enhanced For, 컬렉션 객체자체를 출력시

class Car{
	String company;
	String carModel;
	String color;
	int maxSpeed;
	
	Car(String company, String carModel, String color, int maxSpeed){
		this.company = company;
		this.carModel = carModel;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

	@Override
	public String toString() {
		return "Car [company=" + company + ", carModel=" + carModel + ", color=" + color + ", maxSpeed=" + maxSpeed
				+ "]";
	}
	
}

public class Ex01 {

	public static void main(String[] args) {

		ArrayList<Car> a1 = new ArrayList();
		
		Car c1 = new Car("기아","k5" ,"검은색", 220);
		Car c2 = new Car("현대","아반떼","노란색",200);
		Car c3 = new Car("볼보","S90","흰색", 250);

		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
		
		for (int i = 0; i<a1.size(); i++) {
			Car ss1 = a1.get(i); 
			System.out.println(ss1);
		}
		System.out.println("===========================");
		for (Car k :a1) {
			System.out.println(k);
		
		}
		System.out.println("================================");
		System.out.println(a1);
	}

}
