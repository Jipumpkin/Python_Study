package 메서드;

public class Ex07메서드실습 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 24;
		int result = largerNumber(num1, num2);
		System.out.println("큰수확인 : "+result);

	}
	
	public static int largerNumber(int a, int b) {
		
		if(a>b) {
			return a;
		}else if(a<b) {
			return b;
		}else {
			return 0;
		}
		
		
	}

}
