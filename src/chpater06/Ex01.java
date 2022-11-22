package chpater06;

class Man{
	
	String name = "홍길동";
	int age = 30;
	String phone = "010-1111-1234";
	String arr = "서울 종로구 인사동";
	double weight = 70.5;
	
	
	//기본 생성자는 생략됨
	
	//메소드 : 
	void add1() {
		// 1 ~ 100 까지 2의 배수를 출력하고 더한값을 출력
		int sum = 0;
		for(int i = 1; i<=100; i++ ) {
			if(i % 2== 0) {
				System.out.print(i + " " );
			}
			}
		System.out.println();
		for(int j = 1; j<=100; j++) {
			if(j % 2== 0) {
				sum += j ;
			}
			
		}
		System.out.println("2의 배수의 합은 = " + sum);
	}
	
	
	void add2() {
		//1 ~ 500 까지 3의 배수와 4의 배수를 출력하고 더한값출력
		int sum = 0;
		for(int i=1; i<=500; i++) {
			if(i % 3==0 || i % 4==0) {
				System.out.print(i + " " );
			}
		}
		System.out.println();
		for(int j = 1; j<=500; j++) {
			if(j % 3==0 || j % 4==0) {
				sum += j ;
			}
		}
		System.out.println("3배수, 4배수의 합은 = " + sum);
		
	}
	void add3() {
		// 1 ~ 1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력
		int sum = 0;
		for(int i = 1; i<=1000; i++) {
			if(i % 4 != 0) {
				System.out.print(i + " " );
			}
		}
		for(int j =1; j<=1000; j++) {
			if(j % 4 != 0) {
				sum += j;
			}
		}
		System.out.println("\n1~1000까지중 4의배수만 제외한 값 = " + sum );
	}
	
}




public class Ex01 {

	public static void main(String[] args) {
		//  객체 생성 및 객체의 필드의 값이나 메소드 호출 
		Man f = new Man();
		System.out.println("===2의 배수와 2의 배수의 합 구하기===");
		f.add1();
		System.out.println("===1~500까지 3의배수와 4의배수 출력 후 합 구하기===");
		f.add2();
		System.out.println("===1~1000까지 1씩 증가하고 4의 배수만 출력되지 않도록 하고 더한값 출력===");
		f.add3();
		System.out.println(f.age);
		System.out.println(f.name);
		System.out.println(f.phone);
		System.out.println(f.weight);
		
	}

}
