package chapter04.ex02;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 1월 ~ 12월까지 월을 인풋 받아서 해당월의 일수를 출력해 주면 됩니다.
		// 출력 : 1 월은 31일 입니다.
		// 		 2 월은 28일 입니다.
		// 		 month 월은 day 일 입니다.
		// switch 문으로 작성 
	Scanner sc = new Scanner(System.in);	
	int month;
	int day1 = 31;
	int day2 = 30;
	int day3 = 28;
	
	System.out.println("1월 ~ 12월중 하나를 입력해 주세요 >>>>");
	month = sc.nextInt();
	switch(month){
	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		System.out.println("입력하신 "+month+"월의 일수는 "+day1+"일 입니다.");
		break;
	case 4: case 6: case 9: case 11:
		System.out.println("입력하신 "+month+"월의 일수는 "+day2+"일 입니다.");
		break;	
	case 2: 
		System.out.println("입력하신 "+month+"월의 일수는 "+day3+"일 입니다.");
		break;
	default :
		System.out.println("해당 월은 존재하지 않습니다.");
		break;
	}
	
	}

}
