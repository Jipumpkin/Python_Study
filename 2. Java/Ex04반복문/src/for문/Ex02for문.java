package for문;

import java.util.Scanner;

public class Ex02for문 {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 1부터 100까지 수 중에서 3의 배수만 출력하시오
		
		for (int i = 3; i<101; i+=3) {
			System.out.print(" "+i);
		}

		System.out.println();
		System.out.println();
		
		
		// 100까지 3의 배수면서 5의 배수를 출력
		
		for (int i = 15; i<101; i+=15) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println();
		
		// 한개의 자연수를 입력받아 그 수의 배수를 차례대로 10개를 출력하는 프로그ㄻ을 작성하시오
		
		
		int num = sc.nextInt();
		int num1 = num;
		
		
		for (int i = 1; i<11; i++) {
			
			System.out.print(" "+num1);
			num1+=num;
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
