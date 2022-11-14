package chapter04.ex03;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 2중 for문을 사용해서 1~ 19단 까지 출력
		// 3의 배수 출력
		// 3의 배수 출력은 완성 했지만 안나오는 단의 출력문 삭제하는 방법 모르겠음
		
		//1. 1~19 단까지 출력
		// 단을 출력
		
		/*
		for(int i = 1; i<20; i++) {
			System.out.println(i+"단 출력");
			for(int j= 1; j<20; j++) {
				
				if(i% 3==0) {
					
					System.out.println(i + " * " + j + " = " + i*j);
				}
						
				}
			}
			*/
		//강사님 답
		for (int i=3; i<20; i+=3) {
			//단을 출력
			System.out.println(i + "단 출력");
			for(int j=1; j<20; j++) {	// i 일때 19번 루프
				System.out.println(i + " * " + j + " = " + i*j);
			}
			
			
			
		}}}
		
		
	
