package chapter04.ex01;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// <<스캐너에서 번호를 입력 받아서 아래 내용을 작동 시키는 프로그램을 작성 해주세요.
		// IF
		
		Scanner sc = new Scanner(System.in);
		int select;
		
		int kor,math,eng; //국어, 수학, 영어
		
		int a; //홀짝
		
		String aName;
		String bName;
		
		
		System.out.println("=========================================");
		System.out.println("1.학점의 합계/평균 | 2.홀수/짝수 | 3.같은 이름식별");
		System.out.println("=========================================");
		System.out.println("위의 번호를 선택하세요.>>>>");
		select = sc.nextInt();
		
		if (select == 1) {
			System.out.println("국어 점수를 입력하세요 >>>");
			kor = sc.nextInt();
			System.out.println("영어 점수를 입력하세요 >>>");
			eng = sc.nextInt();
			System.out.println("수학 점수를 입력하세요 >>>");
			math = sc.nextInt();
			
			int sum = kor+eng+math;
			double avg = sum/3.0;
			
			System.out.printf("학점의 합계 : "+sum +", 평균은 : " + "%4.2f" + " 입니다.\n", avg); 
			//%4.2f를 추가해서 소수점 2개까지만 출력
			
		}else if (select == 2) {
			System.out.println("정수 값을 입력하세요");
			a = sc.nextInt();
			System.out.println("입력하신 값은 "+ a +"이며 이 값은 " + (a % 2 == 0 ? "짝수" : "홀수") + " 입니다." );
			
		}else if (select == 3) {
			System.out.println("글자 a를 입력해 주세요.");
			aName = sc.next();
			System.out.println("글자 b를 입력해 주세요.");
			bName = sc.next();
			boolean g = aName.equals(bName);  //두 문자의 true / false 판명
			String t;
			if(g == true) { //참, 거짓을 한글로 남기기 위해 if문 추가 사용 //aName.equals(bName); 이것만 출력할경우 true, false 만 나옴
				t = "참";
			} else {
				t = "거짓";
			}
			System.out.println("위 두개의 비교는 " + t +"입니다." );
			
	
			
		}else {
			System.out.println("번호를 1, 2, 3 중에만 입력해 주세요. ");
		}
		
	}

}
