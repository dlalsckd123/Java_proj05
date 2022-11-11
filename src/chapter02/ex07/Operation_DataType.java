package chapter02.ex07;

public class Operation_DataType {

	public static void main(String[] args) {
		// 같은 자료형 간의 연산 vs 다른 자료형 간의 연산
		
		//1. 같은 자료형 간의 연산
		int value1 = 3+5; //8
		int value2 = 8/5; //1 	int/int = int (소수점은 안나옴)
		
		System.out.println(value1);
		System.out.println(value2);
		
		float data1 = 3.0F + 5.0F;
		System.out.println(data1);
		
		double data2 = 8.0 / 5.0; 
		System.out.println(data2); //1.6
	
		double data3 = 8/5;		   // int/int = int(1)
		System.out.println(data3); //1.0
		
		double data4 = 8/5.0;  //정수 8이 double 형으로 업캐스팅이 일어나서 연산
		System.out.println(data4); //1.6
		
		//주의 : 편균을 계산 할때 double
		
		System.out.println("===================================");
		
		//2. 다른 자료형 간의 연산 (작은 자료형은 높은 자료형으로 업캐스팅이 자동으로 일어나고 연산)
		
		//int data5 = 5 + 3.5;  //오류 발생
		int data5 =  5 + (int)3.5; //8
		double data6 = 5+3.5; //8.5
		int data7 = (int) (5+3.5); //8
		double data8 = 5/2.0; //정수 5가 double로 업캐스팅
		double data9 = 5/2; //2.0
		
		System.out.println(data5);
		System.out.println(data6);
		System.out.println(data7);
		System.out.println(data8);
		System.out.println(data9);
		System.out.println("============================");
		
		int data11 = 50;
		double data12 = 33.33;
		
		//업캐스팅 : data11(int) ==> data11(double)
		System.out.println(data11 + data12); //50==> double
		//업캐스팅 : data11(int) ==> data11(double)
		System.out.println(data11 / data12); //50==>double
		//다운캐스팅 : data12(double) ==> data12(int)
		System.out.println(data11 /(int)data12 );
		
		//<문제>
		//국어 : 90, 수학 : 88, 영어 : 77, 음악 : 90, 과학 : 99
		//각 과목의 점수를 int의 변수를 만들어 저장후 : 합계(sum), 평균(avg) 값을 출력
		int ku = 90;
		int su = 88;
		int en = 77;
		int mu = 90;
		int si = 99;
		int sum = ku + su + en + mu + si;
		double avg = sum/5.0;
		
		System.out.println("합계는 : " + sum);
		System.out.println("평균은 : " + avg);
		
		
	}

}
