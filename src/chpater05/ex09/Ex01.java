package chpater05.ex09;

public class Ex01 {

	public static void main(String[] args) {
		/*
		국어 영어 수학 과학				국어 영어 수학 과학			 국어 영어 수학 과학				국어  영어  수학  과학
홍딜동	70  88  77  99  	이순신	80  68  87  79		김똘똘 60  86  87  30		홍길순	77   56   80   99
		 
메인 메소드 args로 아래와 같은 값이 인풋되었을 경우 <출력> 과 같이 출력해 보세요
args : 홍길동 70 88 77 99 이순신 80 68 87 79 김똘똘 60 86 87 30 홍길순 77 56 80 99

<for 문을 사용해서 출력 하세요>

<출력>
		 */
		
		
		
		
		int n=0;
		String s1 = args[0]; 
		
		
		int sum = 0;
		double avg = 0;
		
		System.out.println("      국어 영어 수학 과학");
		
		for (int i =0; i<args.length; i++) { //i의 0번방은 String 값이 들어가 있기에 1번방부터 시작함.
			
		if(i % 5==0) {
			for (i =0; i<5; i++) {
				args[i]=args[n];
				n++;
				System.out.print(args[i] + "  ");
			
			}
			System.out.println();
		
		}
		}
	
	}
}	



