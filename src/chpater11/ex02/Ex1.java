package chpater11.ex02;

	class Student {
		//필드
		String name;
		
		//합계와 평균을 출력 하는 메소드
		void sum_avg() {
		System.out.println("합계와 평균을 출력하는 메소드 입니다.");
		}
	}

	
	class Student_Sub extends Student{
		
		//자식의 필드
		int kor=0;	//국어 점수
		int eng=0;	//영어 점수
		int math=0; 	//수학 점수
	
	public Student_Sub(String name, int kor, int eng, int math) {
		super();
		super.name=name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	void sum_avg() {
		int sum = kor + eng + math;
		double avg = sum /3.0;
		System.out.printf("%s 학생의 합계는 %d 이고, 평균은 %4.2f 입니다.", name, sum, avg);
		System.out.println();
		}
	
	//부모의 sum_avg() 메소드를 오버라이딩해서 객체의 kor, eng, math 의 합계와 평균을 출력하는 메소드
	
	}
	
	public class Ex1 {
		
	
		public static void main(String[] args) {
		// 
		// 생성자를 사용해서 객체 생성시 필드의 값을 할당하고
		/*
		홍길동 70 80 77
		이순신 80 68 87
		김똘똘 60 86 87
		홍길순 77 56 80
		강감찬 55 66 77
		*/
		
		//Student 배열변수 arr 변수에 모든 객체를 저장해서
		
		//배열의 값을 for 문으로 출력 할때 < 그 학생의 국어, 영어 수학 의 합계, 평균>
			//오버라이딩된 메소드 출력
			// 5명의 학생의 국어에 대한 합계, 평균
		
	Student s1 = new Student_Sub ("홀길동", 70, 88, 77);
	Student s2 = new Student_Sub ("이순신", 80, 68, 87);
	Student s3 = new Student_Sub ("김똘똘", 60, 86, 87);
	Student s4 = new Student_Sub ("홍길순", 77, 56, 80);	
	Student s5 = new Student_Sub ("강감찬", 55, 66, 77);	
	
	System.out.println("2. 생성된 객체를 Student 배열에 저장 =======");
	
	Student[] arr = new Student[] {s1, s2, s3, s4, s5};
	
	System.out.println("3. 배열의 값을 For 문을 사용해서 출력시 각각의 내용값 출력");
	int [] sum = new int [3]; 	// sum[0] : 국어합계, [1] : 영어합계 , [2] 수학 합계
	//각 학생의 합계 및 평균
	for(int i = 0; i<arr.length; i++) {
		//각 학생의 합계및 평균을 오버라이딩된 메소드로 호출
		arr[i].sum_avg();
		
		sum[0] += ((Student_Sub)arr[i]).kor;
		sum[1] += ((Student_Sub)arr[i]).eng;
		sum[2] += ((Student_Sub)arr[i]).math;
		
		if (i == arr.length-1) {
			System.out.println("=============================================");
			System.out.printf("5명의 국어 점수의 총 합은 %d 이고 평균은 %4.2f 입니다.", sum[0], sum[0]/5.0);
			System.out.println();
			System.out.printf("5명의 영어 점수의 총 합은 %d 이고 평균은 %4.2f 입니다.", sum[1], sum[1]/5.0);
			System.out.println();
			System.out.printf("5명의 수학 점수의 총 합은 %d 이고 평균은 %4.2f 입니다.", sum[2], sum[2]/5.0);
			System.out.println();
	}
	
	}

}
}