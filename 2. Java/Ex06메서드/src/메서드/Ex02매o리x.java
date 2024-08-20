package 메서드;

public class Ex02매o리x {

	public static void main(String[] args) {
		
		// 매개변수는 있으나 리턴타입(void)이 없는 메서드
		
		sumPrint(1023,13,123);
		
//		System.out.println(sumPrint(1,2,3));
		// 출력문을 출력하려고 하면 에러발생
		
		
		

	}// main 밖
	
	public static void sumPrint(int a, int b, int c) {
		System.out.println(a+b+c);
		//void는 return이라는 키워드가 필수가 아니다.(써도된다)
		// void : 기능 자체를 결과값을 돌려주는 경우
	}

}
