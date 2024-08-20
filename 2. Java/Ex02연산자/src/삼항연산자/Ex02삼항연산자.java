package 삼항연산자;

import java.util.Scanner;

public class Ex02삼항연산자 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 수를 입력해라 > ");
		int num1 = sc.nextInt();
		System.out.print("두번째 수를 입력해라 > ");
		int num2 = sc.nextInt();
		
		int 큰수 = num1>num2?num1:num2;
		int 작은수 = num1>num2?num2:num1;
		
		System.out.println("둘중 큰수에서 작은수를 뺀 결과는 "+(큰수-작은수)+"이다");
		
		
		
		
		
		
		
		
		

	}

}
