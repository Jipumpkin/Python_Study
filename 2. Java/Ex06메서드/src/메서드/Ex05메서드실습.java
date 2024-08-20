package 메서드;

public class Ex05메서드실습 {

	public static void main(String[] args) {
		
		add(3,5);
		sub(3,5);
		mul(3,5);
		div(3,5);
		
		// 출력하는 기능을 기지고 있다 - void
		// 전달인자가 2개 - 매개변수 2개

	}
	public static void add(int a,int b) {
		System.out.println(a+b);
	}
	public static void sub(int a,int b) {
		System.out.println(a-b);
	}
	public static void mul(int a,int b) {
		System.out.println(a*b);
	}
	public static void div(int a,int b) {
		System.out.println(a/b);
	}

}
