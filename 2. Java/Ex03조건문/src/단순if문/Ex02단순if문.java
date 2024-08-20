package 단순if문;

import java.util.Scanner;

public class Ex02단순if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if (num%15==0) {
			System.out.println("3과 5의 배수입니다.");
		}
		

	}

}
