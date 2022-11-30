package chapter14.ex02;

public class Ex01 {

	public static void main(String[] args) {
		
		// try ~ catch ~ finally 구문을 사용해서 예외 처리
		int[] arr = new int[] {1,2,3,4};
		
		//실행시 예외 발생 : ArrayIndexOutOfBoundsException
		
		try {
			System.out.println(arr[1]);
			System.out.println("try 생성 구문");
			
		} catch (ArrayIndexOutOfBoundsException e){
			System.out.println("정확한 배열값을 입력하세요.(0 ~ 3까지의 배열밖에 없습니다.)");
		}
		finally {
		//무조건 작동 되는 블락
			System.out.println("Finally 블락 : 예외와 상관없이 항상 작동됨");
			
		}
		System.out.println("프로그램 종료");
	}

}
