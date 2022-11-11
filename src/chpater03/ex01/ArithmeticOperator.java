package chpater03.ex01;

public class ArithmeticOperator {

	public static void main(String[] args) {
		// 산술 연산자와 세가지 경우의 증감 연산자.
		
		//1. 산술 연산자
		System.out.println(2 + 3); 	//5		+ : 산술연산
		System.out.println(2 + "3"); //23, 3이 문자열로 들어가기에, + : 연결 연산
		System.out.println(8-5);
		System.out.println(7*2);
		System.out.println(7/2);
		System.out.println(8%5);  //3	% : 나머지 값만 출력 
		System.out.println(8%9);  //8   % : 나머지 값만 출력
		System.out.println("======================================");
		
		//2. 증감 연산자 (case 1)
		int value1 = 3;
		value1++;  	// ++ 1씩 증가.
		System.out.println(value1); 	//4
		
		int value2 = 3;
		++value2;
		System.out.println(value2); //4
		System.out.println("======================================");
		
		//3. 증감 연산자 (case 2)
		int value3 = 3;
		int value4 = value3++; //++이 뒤에일 경우 : 먼저 value3 값을 value4에 넣고 ++을 나중에 더함
		System.out.println(value3); //4
		System.out.println(value4); //3
		
		int value5 = 3;
		int value6 = ++value5; //++이 앞에일 경우 : 증가된 value5 값을 value6에 넣기에 출려값이 동일함
		System.out.println(value5); //4
		System.out.println(value6); //4
		System.out.println("======================================");
		
		//4. 증감 연산자의 사용 case 3
		int value7 = 3;
		int value8 = 4;
		int value9 = 2 + value7-- + ++value8; //2+3(--이 뒤에있기에 value7에만 적용)+5(++이 앞에 있기에 value8값에 ++ 적용된 값)
		System.out.println(value7); //2
		System.out.println(value8); //5
		System.out.println(value9); //10
		System.out.println("======================================");
		
		int value10 = 30;
		int value11 = 40;
		int value12 = 50;
		
		int value13 = 7 + --value10 + ++value11 + value12--; //7+29+41+50
		System.out.println(value10); //29
		System.out.println(value11); //41
		System.out.println(value12); //49
		System.out.println(value13); //127
	}

}
