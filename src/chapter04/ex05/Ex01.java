package chapter04.ex05;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> do while 문으로 무한 루프를 돌립니다.
		// 스캐너에서 1을 넣으면 "1. 평균 출력" 으로 출력
		// 스캐너에서 2을 넣으면 "2. 합계 출력" 으로 출력
		// 스캐너에서 3을 넣으면 "3. 이름 출력" 으로 출력
		// 4번을 넣으면 do while 문을 빠져나옴 " 프로그램 종료"
		
		System.out.println("=====================================================");
		System.out.println("1. 평균 출력 | 2. 합계 출력 | 3. 이름 출력 | 4. 프로그램 종료");
		System.out.println("======================================================");
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		
		
		do {
			System.out.println("번호를 입력해 주세요 1 ~ 4");
			a = sc.nextInt();
			if(a == 1) {
				System.out.println("1번이 입력되었습니다. / 평균 출력");
			}else if (a==2) {
				System.out.println("2번이 입력되었습니다. / 합계 출력");
			}else if (a==3) {
				System.out.println("3번이 입력되었습니다. / 이름 출력");
			}else if (a==4) {
				System.out.println("4번이 입력되었습니다. / 프로그램 종료");
				
			}else {
				System.out.println("잘못된 입력 입니다. 1~4까지만 넣어주세요.");
			}
		
		}while(a<4);
		System.out.println("Do While 문을 빠져 나왔습니다.");
	}

}
