package chapter04.ex01;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <완료 시간 : 1시 20분>
		// IF 문을 사용해서, if .... else if.... else if ... else
		//스캐너를 사용해서 가지고 있는ㄴ 돈을 입금 받습니다.
		// 0 ~ 3000 		: 걸어 다닙니다.
		// 3000 ~ 30000 	: 지하처을 타고 다닙니다.
		// 30000 ~ 100000 	: 택시를 타고 다닙니다.
		// 100000 ~ 		: 비행기를 타고 다닙니다.
		
		
		int mony;
		Scanner sc = new Scanner(System.in);
		System.out.println("보유하고 있는 금액을 입력하세요 : ");
		mony = sc.nextInt();
		
		
		if(mony >= 0 && mony < 3000) {
		System.out.println("걸어 다닙니다.");
		}else if (mony >=3000 && mony < 30000) {
			System.out.println("지하철을 타고 다닙니다.");
		}else if (mony >= 30000 && mony < 100000) {
			System.out.println("택시를 타고 다닙니다.");
		}else if (mony >=100000) {
			System.out.println("비행기를 타고 다닙니다.");
		}else {
			System.out.println("보유중인 금액이 부족합니다.");
		}
	}

}
