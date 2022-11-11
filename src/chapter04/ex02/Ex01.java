package chapter04.ex02;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		//<문제> switch 문을 사용하여 프로그램 하세요.
		// 스캐너 정수 1 를 인풋 받으면 "금메달입니다" 출력
		// 			2 를 인풋 받으면 "은메달입니다" 출력
		//			3 를 인풋 받으면 "동메달입니다" 출력
		//			그 외 값을 인풋 받으면 "메달이 없습니다" 출력
		
		int medal;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("몇등인지 입력해 주세요 >>>");
		medal = sc.nextInt();
		
		switch(medal) {
		case 1:
			System.out.println("금메달입니다.");
			break;
		case 2:
			System.out.println("은메달입니다.");
			break;
		case 3:
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
		System.out.println("==================문제 2=================");
	//<문제 2> switch 문을 사용하여 프로그램하세요.
		//스캐너 정수 gold 를 인풋 받으면 "금메달입니다" 출력
		//			silver를 인풋 받으면 "은메달입니다." 출력
		//			bronze 를 인풋 받으면 "동메달입니다" 출력
		// 			그외 닶을 인풋 받으면 "메달이 없습니다" 출력
		String medal2;
		System.out.println("자신의 메달을 영어로 입력하세요 >>>");
		medal2 = sc.next();
		
		switch(medal2) {
		case ("gold"):
			System.out.println("금메달입니다.");
			break;
		case ("silver"):
			System.out.println("은메달입니다.");
			break;
		case ("bronze"):
			System.out.println("동메달입니다.");
			break;
		default :
			System.out.println("메달이 없습니다.");
			break;
		}
	}

}
