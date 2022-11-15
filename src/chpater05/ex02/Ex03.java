package chpater05.ex02;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		// 스캐너로 배열의 방 번호를 인풋 받습니다.
		// 배열 변수 : arr1, 2의 배수를 저장후 출력,
		// 배열 변수 : arr2, 3의 배수를 인풋 받아서 출력
		// arr1.length : 배열의 방의 갯수를 자동으로 알아옴
		
		
		
		Scanner sc=new Scanner(System.in);
		int a;
		int b;
		System.out.println("2의 배수 방의 개수를 입력하세요");
		a = sc.nextInt();
		int[] arr1 = new int[a];
		
		
		
		System.out.println("3의 배수 방의 개수를 입력하세요");
		b=sc.nextInt();
		int[] arr2 = new int[b];
		
		
		
		int c=2; //2의 배수
		int d=3; //3의 배수
		
		
		
	System.out.println("2의 배수");
		for(int i=0; i<arr1.length; i++) {
			arr1[i] = c;
			c+=2;
		
		}
		for(int i=0; i<arr1.length; i++) {
			System.out.print(arr1[i] + " ");
		}
		
		
		
		System.out.println();
		System.out.println("3의 배수");
		for(int i=0; i<arr2.length; i++) {
			arr2[i] = d;
			d+=3;
		
		}
		
		
		
		for(int i=0; i<arr2.length; i++) {
			System.out.print(arr2[i] + " ");
	}
/*
//강사님이 푸는 방법
int idx; //방의 갯수를 지정 받는 변수
System.out.println("방의 갯수를 넣어주세요>>>");
idx = sc.nextInt();
int[] arr3 = new int[idx]; // 2의 배수 저장
int[] arr4 = new int[idx]; // 3의 배수 저장

// arr3(2의배수), arr4(3의 배수) 배열 변수에 값 저장
for (int q=0, w=2; q<arr3.length; q++, w+=2) {
	arr3[q] = w;
	
}
for (int q =0, w=3; q<arr4.length; q++, w+=3) {
	arr4[q] = w;
}
		System.out.println("2의 배수 출력");
for (int k : arr3) {
	System.out.print(k + " ");
}
System.out.println();
System.out.println("3의 배수 출력");
for (int q= 0; q<arr4.length; q++) {
	System.out.print(arr4 + " ");
}
*/
}
}
