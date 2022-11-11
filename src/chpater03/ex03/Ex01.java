package chpater03.ex03;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <실습 문제> <완료시간 : 6시 10분 / p.jangwoo@gmail.com Ex01.java>
		// 정수 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 출력 다르면 false 출력
		// 이름 2개를 Scanner 로 인풋 받고 두 값이 같으면 true를 다르면 false를 출력
			// 등가연산자 사용.
			// 기본자료형 : == 
		
		int a;
		int b;
			//참조자료형 : aName.equals(bName)
		String aName;
		String bName;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("a값(정수)을 입력하세요 >>>");
		a = sc.nextInt();
		System.out.println("b값(정수)을 입력하세요 >>>");
		b = sc.nextInt();
		
		System.out.println("a이름을 입력하세요 >>>>");
		aName=sc.next();
		System.out.println("b이름을 입력하세요 >>>>");
		bName=sc.next();
		
		
		System.out.println("a값과 b값의 비교 값은 " + (a == b) + " 입니다.");
		System.out.println("a이름과 b이름의 비교 값은 " + aName.equals(bName) + " 입니다.");
		
	}

}
