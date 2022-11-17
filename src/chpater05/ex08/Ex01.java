package chpater05.ex08;

import javax.annotation.processing.SupportedSourceVersion;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		//		args : 	합게 40 77 99 100 200
		
		//합계 : <정수를 더한 값을 출력>
		String s = args[0];
		int sum = 0;
		
		for (int i =1; i<args.length; i++) { //i의 0번방은 String 값이 들어가 있기에 1번방부터 시작함.
			sum += Integer.parseInt(args[i]);
		}
		System.out.print(s + " : ");
		System.out.println(sum);
		
		System.out.println("=============================");
		System.out.println("합계" + 1 + 2 + 3); //합계123
		System.out.println(1 + 2 + 3 + "합계"); //6합계
		
		}
		
		
		
	}


