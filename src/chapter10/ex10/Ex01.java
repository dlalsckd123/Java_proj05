package chapter10.ex10;

import java.util.Objects;

class C {
	String stuID;
	String name;
	int age;
	
	C(String stuID, String name, int age){
		this.name = name ;
		this.stuID = stuID;
		this.age = age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name, stuID);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		C other = (C) obj;
		return age == other.age && Objects.equals(name, other.name) && Objects.equals(stuID, other.stuID);
	}
	
	
	//c1.equals(c2) //stuID 필드를 재정의 해서, stuID가 같으면 true, 아니면 false
	
	//생성자 , 기본생성자1, 생성자2
	
	//toString 메소드 재정의 : 필드의 값을 출력, 객체
}

public class Ex01 {

	public static void main(String[] args) {
		
		
		String c1 = new String ("1111");
		String c2 = new String ("1111");
		String c3 = new String ("홍길동");
		String c4 = new String ("김남길");
		int c5 = 3;
		int c6 = 5;
		
		
		System.out.println("====stuID 비교=====");
		System.out.println(c1 == c2);		
		System.out.println(c1.equals(c2));
		
		System.out.println("====Name 비교=====");
		System.out.println(c3 == c4);		
		System.out.println(c3.equals(c4));
		
		System.out.println("====age 비교 ====");
		System.out.println(c5 == c6);
		//System.out.println(c5.equals(c6));
		
		
	}

}
