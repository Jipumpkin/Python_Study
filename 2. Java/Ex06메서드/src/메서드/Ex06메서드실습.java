package 메서드;

public class Ex06메서드실습 {

	public static void main(String[] args) {
		
		
		int num1 = 5;
		int num2 = 2;
		char op = '-';
;		
		System.out.println(cal(num1,num2,op));
		
		// op에 -가 있으면 num1과 num2를 빼기한 결과값

	}
	
	public static int cal(int a, int b, char c) {
		// 전달인자 매개변수의 이름을 같은 이름을 주는 편
		// 나중에 어떤 데이터를 사용하는지 구분하기 위해서
//		if(c=='-') {
//			return a-b;
//		}else if(c=='+') {
//			return a+b;
//		}else if(c=='*') {
//			return a*b;
//		}else if(c=='/') {
//			return a/b;
//		}else {
//			return 0;
//		}
//		
		//모든 경우의 수에 대해 return이 있어야한다. if문은 else문이 필요,
		int result = 0;
		if(c=='-') {
			result = a-b;
		}else if(c=='+') {
			result = a+b;
		}else if(c=='*') {
			result = a*b;
		}else if(c=='/') {
			result = a/b;
		}
		
		return result;
		
		// else문 없이는 이렇게 가능
		// 없는 연산자 사용했을때 경우도 만들어주면 좋음
	}

}
