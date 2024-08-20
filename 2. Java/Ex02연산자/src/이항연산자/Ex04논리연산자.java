package 이항연산자;

public class Ex04논리연산자 {

	public static void main(String[] args) {
		
		// NOT (!) - 부정 연산자
		System.out.println(!true);
		System.out.println(!false);
		
		// AND (&)
		// 피연산자 항에 boolean자료형이 와야 한다.
		// 양쪽 다 true라는 값을 가지고 있으면 결과값으로 true
		// 하나라도 false가 와있으면 결과값이 false 이다.
		
		int num1 = 3;
		int num2 = 4;
		System.out.println((num1<num2)&&(num1!=num2)); // true
		
		// OR (||)
		// 피연산자 항에 boolean 자료형이 와야한다.
		// 하나라도 true라는 값을 가지고 있으면 결과값으로 true
		// 양족다 false라는 값을 가지고 있으면 결과값으로 false
		
		System.out.println((num1>num2)||(num1!=num2));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
