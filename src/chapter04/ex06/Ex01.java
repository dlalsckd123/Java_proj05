package chapter04.ex06;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 스캐너로 인풋 받은 값을 선택시 해당 내용을 이중 for 문을 사용해서 출력하세요.
		// 4. 프로그램 종료시 까지 무한 루프를 돌려서 작동 시키세요.
		// 1 ~ 4번 외
		
		System.out.println("================================================================");
		System.out.println("1. 구구단 출력 | 2. 19단 출력 | 3. 19단중 7배수단만 출력 | 4. 프로그램 종료");
		System.out.println("================================================================");
		System.out.println("위의 번호를 선택하세요 >>>");
		int num;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		if (num==1) {
		for(int a=1; a<10; a++) {
			System.out.println(a+ "단 출력");
			for(int b=1; b<10; b++) {
				System.out.println(a + " * " + b + " = " + a * b );
			}
			}
			}else if(num==2) {
				for(int c=1; c<20; c++) {
					System.out.println(c+ "단 출력");
					for(int d=1; d<20; d++) {
						System.out.println(c + " * " + d + " = " + c * d );
					}
	}

}else if(num==3) {
	for(int f=7; f<20; f+=7) {
		System.out.println(f + "단 출력");
		for(int g=1; g<20; g++) {
			System.out.println(f + " * " + g + " = " + f * g );
		}
	}
}else if(num==4){
	System.out.println("프로그램  종료");
}else {
	System.out.println("번호를 잘못 입력하셨습니다. 1 ~ 4만 선택해 주세요.");
}
		}}