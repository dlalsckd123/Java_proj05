package chpater05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		
		System.out.println("===============================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 6의 배수는 제외");
		System.out.println("4. 프로그램 종료");
		System.out.println("===============================");
		
		Scanner sc = new Scanner(System.in);
		
		
		int i = 0; 

		System.out.println("번호를 입력하세요 >>>>");
		int su = sc.nextInt();
		
			
			if (su == 1) {
				System.out.println("7의 배수, 8의 배수 방의 개수를 입력하세요");
				i = sc.nextInt();
				int[] arr1 = new int[i];
				for (int a= 1; a<3000; a++) { // a: 7의배수, 8의 배수를 저장하는 변수
					if(a% 7==0 || a% 8==0) {
						arr1[i]=a;
						i++;
			}
		}
		for(i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
	}
			}else if (su==2) {
				System.out.println("1씩증가하며 4의 배수만 빼는 방의 개수를 입력하세요.");
				i = sc.nextInt();
				int[] arr2 = new int[i];
				for (int b=1; b<arr2.length; b++ ) {
					if(b%4!=0) {
						System.out.print(b + " ");
					}
				}
				
			}else if (su==3) {
				System.out.println("3의 배수만 저장하며 그중 6의 배수인 경우 빼고 저장후 출력하는 방의 개수를 입력하세요.");
				i = sc.nextInt();
				int[] arr3 = new int[i]; 
				
				for (int c=3; i<arr3.length; c+=3) {
					if(c %6!=0) {
						arr3[i]=c;
						i++;
						System.out.print(c + " ");
					}
					
				}
				
			}else if(su==4) {
				System.out.println("프로그램을 종료합니다.");
}else {
	System.out.println("숫자를 잘못 입력하셨습니다. 1 ~ 4까지만 입력하세요.");
}
	
}
}
