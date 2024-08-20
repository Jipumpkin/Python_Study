package 메서드;

public class Ex01메o리o {

	public static void main(String[] args) {
		
		// 매개변수 있고, 리턴타입(데이터타입이 명시)이 있는 메서드
		
		System.out.println(minus(1,2));
		
		
		

	}//main 밖 - 메서드 정의
	
	// 1) public : 공공의
	// - 클래서 내외부에서 자유로운 접그을 할 수 있도록 도와주는 제한자
	// ( private, protected, default )
	// 2) static
	// 메모리 공간이 굉장히 작기 때문에 남용하면 안됨 (static)
	// 3) int : 리턴타입
	// 내가 메서드를 사용했을 때 돌려받는 결과값에 대한 데이터 타입
	// 4) 메서드명(호출명)
	public static int minus(int a, int b) {
		// {} (body) == 메서드 로직
		return a-b;
		// int result a-b;
		// return result;
		
		// return : 리턴타입에 데이터타입이 명시되어이쓰면
		// 반드시 메서드 로직 안에 return 키워드가 명시되어야 한다.
	}

}
