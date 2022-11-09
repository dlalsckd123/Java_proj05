package chapter01;

public class DataTpye {

	public static void main(String[] args) {
		// 변수를 생성후 출력 하기
		// 변수를 선언전에 변수에 어떤 데이터 형식을 저장할지 선언
		int a ;		// 변수 선언
		a = 10;
		System.out.println(a);
		a = 20;
		System.out.println(a);

		//a = 10.5;  // 실수는 담을 수 없다.
		
		float b; //float : 실수를 저장할 수 있는 변수
		b = 10;  //정수가 실수로 변환
		System.out.println(b);
		
		double c; //실수를 저장하는 double
		c = 10.5;
		System.out.println(c);
	}

}
