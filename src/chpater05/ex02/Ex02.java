package chpater05.ex02;

import java.util.Arrays;

public class Ex02 {

	public static void main(String[] args) {
		// <문제> 배열 변수 : arr1, 배열의 방의 갯수 : 500개
		// 배열방에 3의 배수 와 5의 배수를 저장
		// 출력 : 1. for , 2, Enhanced for, 3. Arrays. toString() 를 사용
		
		/*
		  System.out.println("1. for 문 출력 ");
		 
		int[] arr1 = new int[500];
		for (int i=0, j=5, k=3; i <500; i++, j +=5, k+=3) {
			arr1[i]=j;
			arr1[i]=k;
		}
		for (int i =0; i<500; i++) {
			System.out.print(arr1[i] + " ");
		}
		System.out.println();
		System.out.println("2. Enhanced for 출력 ");
		for (int i=0, j=5, k=3; i<500; i++, j+=5, k+=3) {
			arr1[i]=j;
			arr1[i]=k;
		}
		for(int a : arr1) {
			System.out.print(a + " ");
			
			}
		
		System.out.println();
		System.out.println("2. Arrays.toString() 출력");
		System.out.println(Arrays.toString(arr1));
		*/
		
		int i=0;		//index : 방 번호를 담는 변수
		int[] arr1 = new int [500];
		
		for (int a= 1; a<3000; a++) { // a: 3의배수, 5의 배수를 저장하는 변수
			if(a% 3==0 || a% 5==0) {
				arr1[i]=a;
				i++;
				
			}
			if (i>499) {
				break;
			}
		}
		System.out.println("====for문으로 출럭====");
		for(i=0; i<500; i++) {
			System.out.print(arr1[i] + " ");
		}
		
	System.out.println();
	System.out.println("=== Enhanced for === ");
	for(int k : arr1) {
		System.out.printf("%d", k);
	}
	System.out.println();
	System.out.println("==== Array.toString() ====");
	System.out.println(Arrays.toString(arr1));
	}

}
