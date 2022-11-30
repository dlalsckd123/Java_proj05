package chapter14.ex03;

public class Ex01 {

	public static void main(String[] args) {
		//3 개의 예외를 하나의 try ~ catch 블락에 넣고,
			// 각각에 대해서 catch
			// 3개의 예외를 한꺼번에 처리
		 
		int[] arr = new int[] {1,2,3} ;
		
		
		//1. 숫자
		try {
			System.out.println(3/0);
		}catch (ArithmeticException e) {
			System.out.println("0으로 안나눠 집니다!");
		} 
		finally {
			System.out.println("첫번째 숫자출력 종료");
			System.out.println("========================================");
		}
		
		//2. 문자
		try {
			int num = Integer.parseInt("20A");
		}catch (NumberFormatException e) {
			System.out.println("숫자로 변환이 불가 합니다.");
		} finally {
			System.out.println("두번째 문자출력 종료");
			System.out.println("========================================");
		}
		//3. 배열
		try {
			System.out.println(arr[5]);
			System.out.println("잘 출력 되는군요");
		}catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("정확한 배열값을 입력하세요.(0 ~ 3까지의 배열밖에 없습니다.)");
		} 
		finally {
			System.out.println("세번째 배열출력 종료");
			System.out.println("========================================");
		}
		
		
		
		try {
			System.out.println(3/0); 	
			int num = Integer.parseInt("10A"); 
			System.out.println(arr[5]);
			
			}catch (ArithmeticException  e) {
				System.out.println("0으로 나누면 처리가 불가능함 ");
				
			}catch (ArrayIndexOutOfBoundsException e) {
				System.out.println("배열의 방번호를 넘겼습니다.");
			}catch(NumberFormatException e) {
			System.out.println("숫자로 변경이 불가능 합니다.");
	}finally {
				System.out.println("네번째 모든(3개)출력 종료");
			}
			
		System.out.println("==== 2단계 모든 exception을 한번에 처리");
		try {
			System.out.println(3/0); 	
			int num = Integer.parseInt("10A"); 
			System.out.println(arr[5]);
		}catch (ArithmeticException | ArrayIndexOutOfBoundsException | NumberFormatException e) {
			System.out.println("모든 예외를 하나의 블락에서 처리");
			
			System.out.println(e.getMessage());		//예외의 간단한 정보를 출력 
			e.printStackTrace();					//예외의 세부적인 정보를 출력
		}
		System.out.println("=== 3. 각각의 try 블락에서 처리 =======");
		try {
		System.out.println(3/0); 	
		int num = Integer.parseInt("10A"); 
		
		
		}catch (ArithmeticException e) {
			System.out.println("3. 0으로 나눌 수 없습니다.");
		}
		
		try {
			System.out.println(arr[5]);
		} catch (ArrayIndexOutOfBoundsException e) {
		System.out.println("3. 배열의 방을 넘겼습니다.");
		}
			
		try {
			int num = Integer.parseInt("10A"); 
		} catch (NumberFormatException e) {
			System.out.println("3. 숫자는 문자로 출력할수 없습니다.");
		}
		
		
		System.out.println("프로그램 종료");
		}

}
