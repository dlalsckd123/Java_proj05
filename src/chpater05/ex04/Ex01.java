package chpater05.ex04;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// <문제>
		Scanner sc = new Scanner(System.in);
		//배열을 인풋 받는 변수 선언
		int[] arr1;    //배열 변수 선언
		int n; 		//선택자 (1,2,3,4) 번호를 인풋 받는 변수
		int idx; 	//배열의 방의 크기를 스캐너로 인풋 받는 변수
		
		while (true) { //아래 값들이 루프함, 4번 선택시 break;
		
		System.out.println("===============================");
		System.out.println("1.인풋 값을 받아서 방의 크기를 지정하고 7의 배수와 8의 배수 저장 후 출력");
		System.out.println("2.인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장 후 출력");
		System.out.println("3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 6의 배수는 제외");
		System.out.println("4. 프로그램 종료");
		System.out.println("===============================");
		
		System.out.println("1 ~ 4번까지 번호를 선택하세요 >>>>");
		n = sc.nextInt();
		
		if(n == 1) {
			//1번을 선택시 출력 하는 프로그램 작성
			System.out.println("1번 선택 : 배열의 방의 크기를 넣어주세요 >>>");
			idx = sc.nextInt(); //배열의 방의 크기를 스캐너로 받아서 idx 변수에 할당.
			arr1 = new int[idx]; //arr1 배열 변수의 방의 크기를 지정
			//7의 배수와 8의 배수를 저장하는 프로그램을 작성 : for 반복문을 사용해서 처리
			
			int i = 0; //배열의 방 번호를 지정하는 변수
			int a; 	   //7의 배수와 8의 배수를 저장하는 변수
			for(a=1; ; a++) { //조건을 생략 하면 무한 루프
				if(a % 7 == 0 || a % 8 ==0) { //7의 배수 이거나 8의 배수라면
					arr1[i] = a;	//배열 방에 7의 배수와 8의 배수를 저장
					i++;			//배열의 방의 번호증가는 값이 저장될때만 증가되어야 됨
				}
				if(i == idx) {	//i=방번호이고, idx : 인풋 받은 방의 갯수
				break;
				
				}
			}
			System.out.println("인풋 받은 방의 갯수 : " + idx);
			System.out.println("마지막 방 번호" + i);
			System.out.println("마지막 방번호에 들어간 값 : " +  a);
			// for 문을 사용해서 배열에 (arr1) 저장된 값을 출력
			System.out.println("1. 7의 배수, 8의 배수 출력 됨...");
			for(i = 0; i<arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			
			}
			System.out.println();
			
			//System.out.println("100번방의 값 출력 : " + arr1[100]); // 오류남 : 99번방까지만 해야함
		}else if(n == 2) {
			//2번을 선택시 출력 하는 프로그램 작성
			System.out.println("2번 선택 : 방의 크기를 넣어주세요 >>>>");
			//2. 인풋 값을 받아서 방의 크기를 지정하고 1씩 증가하도록 값을 넣는데 4의 배수만 빼고 저장후 출력
			idx = sc.nextInt();		//배열 방의 크기
			arr1 = new int[idx];	//스캐너로 받은 값을 방크기로 지정
			
			//for 문을 사용해서 1씩증가 하는데 4의 배수는 배열에 넣지 않고 저장
			int i =0;		//방번호
			int a;		//값을 저장하는 변수
			for(a = 1; ; a++) { //조건을 생략 하면 무한 루프
					if(a % 4 == 0) {
						continue;  //continue 를 만나면 아래 내용은 실행되지 않고 증가식으로 올라감.
					}
					arr1[i] = a;
					i++;
					if(i==idx-1) {
						break;
					}
			}
			//for 문을 사용해서 배열에 들어간 값을 출력
			for (i=0; i<arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			
			
		System.out.println();
		}else if(n == 3) {
			//3번을 선택시 출력 하는 프로그램 작성
			System.out.println("3번 선택 : 방의 크기를 입력 하세요 >>>");
			idx = sc.nextInt();
			arr1 = new int[idx];
			
			//3.인풋 값을 받아서 방의 크기를 지정하고 3의 배수만 저장하는데 6의 배수는 제외
			int i=0; //방번호
			int a;	 //3의 배수만 저장하되 6의 배수는 저장하지 않도록
			
			//for 문을 사용해서 값을 저장
			for(a=1; ; a++) { //조건을 생략 하면 무한 루프
				if(a % 3 == 0) {	//3의 배수이고
					if(a % 6 != 0) {	//6의 배수가 아닐때
					arr1[i] = a;
					i++;
					}
					}
				
				if(i == idx) {
					break;
				}
				
			}
			//for 문을 사용해서 넣은 값을 출력
			System.out.println("배열의 내용을 출력 ");
			for (i=0; i<arr1.length; i++) {
				System.out.print(arr1[i] + " ");
			}
			System.out.println();
		}else if(n == 4) {
			//4번을 선택시 출력 하는 프로그램 작성
			System.out.println("4번 선택");
			break;
		}else 
			//위의 조건이 만족 하지 않을때: 1~4 이외으 값이 들어 왔을때
			System.out.println(" 1 ~ 4번 까지만 입력 해 주세요.");
			
		}
		System.out.println("프로그램이 종료 되었습니다.");
		sc.close();
		}
		
		
		/*
		
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
	*/
		//강사님꺼
		
		
		
		
}

