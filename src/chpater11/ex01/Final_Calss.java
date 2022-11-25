package chpater11.ex01;

class Aaa{
	int m;
	final int n;
	
	Aaa(){
		n = 10;
	}
	
	
	Aaa(int n){
		this.n = n;
	}
	
	void run() {
		System.out.println("Aaa 클래스의 run() 입니다.");
	}
	
}

final class Bbb extends Aaa {		//final 이 들어갈 경우상속이 불가한 클래스
	
}

//상속 불가 : 부모클래스 이름에 final 키가 할당됨
// class Ccc extends Bbb{}

public class Final_Calss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
