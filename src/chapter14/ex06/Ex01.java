package chapter14.ex06;

//1. 예외 발생할때 각
class AA {
	void abc() {		//bcd()메소드 호출
		//bcd() 메소드 호출
	}
	void bcd() {	//메소드 블락에서 직접 예외 처리
		System.out.println(3/0);
		int [] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
			System.out.println("AA 예외 발생");
		}
	}
}

//2. 예외를 전가 : 메소드를 호출하는 쪽에서 예외를 처리하도록 : throws
class BB{
	void abc() {
		//bcd() 메소드 호출
	}
	void bcd() throws InterruptedException{	//예외를 미루는것 : throws
		System.out.println(3/0);
		int[] arr = new int[] {1,2,3};
		System.out.println(arr[5]);
		try {
			throw new InterruptedException();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("BB 예외 발생");
			throw e;
			
		}
	}
}

public class Ex01 {

	public static void main(String[] args) {
		

	}

}
