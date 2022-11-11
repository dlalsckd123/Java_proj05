package chapter02.ex08;

import java.util.*;
import java.io.*;

public class Ex01 {

	public static void main(String[] args) {
		// <문제> 스캐너를 등록 하고,
		// 어머니 이름, 아버지 이름, 형제 이름, 자신 이름
		// 어머니 나이, 아버지 나이, 형제 나이 , 자신 나이

		//콘솔에서 인풋 받은 이름은 모드 출력
		// 나이의 합계와 평균을 출력
		
		Scanner sc = new Scanner(System.in);
		
		String name1;
		String name2;
		String name3;
		String name4;
		
		int m; //어머니
		int p; //아버지
		int b; //동생
		int na; //나
		

		System.out.println("어머니의 성함을 입력하세요 >>>> ");
		name1 = sc.next();
		
		System.out.println("어머니의 나이를 입력하세요 >>>> ");
		m = sc.nextInt();
		
		System.out.println("아버지의 성함을 입력하세요 >>>> ");
		name2 = sc.next();
		
		System.out.println("아버지의 나이를 입력하세요 >>>> ");
		p = sc.nextInt();
		
		System.out.println("동생의 이름을 입력하세요 >>>> ");
		name3 = sc.next();
		
		System.out.println("동생의 나이를 입력하세요 >>>> ");
		b = sc.nextInt();
		
		System.out.println("자신의 이름을 입력하세요 >>>> ");
		name4 = sc.next();
		
		System.out.println("자신의 나이를 입력하세요 >>>> ");
		na = sc.nextInt();
		
		int sum = m + p + b + na;
		double avg = sum/4.0;
		
		System.out.println("어머니의 성함은 :" + name1 + "이고, 나이는 : " + m + "세 입니다." );
		System.out.println("아버지의 성함은 :" + name2 + "이고, 나이는 : " + p + "세 입니다." );
		System.out.println("남동생의 이름은 :" + name3 + "이고, 나이는 : " + b + "세 입니다." );
		System.out.println("저의 이름은 :" + name4 + "이고, 나이는 : " + na + "세 입니다." );
		System.out.println("우리 가족의 나이 합계는 : "+ sum + "이고, 평균은 :" + avg + "입니다.");
	}

}
