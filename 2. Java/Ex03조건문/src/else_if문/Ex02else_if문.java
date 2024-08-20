package else_if문;

import java.util.Scanner;

public class Ex02else_if문 {

	public static void main(String[] args) {


		
		Scanner sc = new Scanner(System.in);
		
		
//		System.out.print("점수 입력 > ");
//		int total = sc.nextInt();
//		
//		
//		if (total >= 90) {
//			System.out.println("A입니다.");
//		}else if(total >= 80) {
//			System.out.println("B입니다.");
//		}else if (total >= 70) {
//			System.out.println("C입니다.");
//		}else {
//			System.out.println("D다");
//		}
		
		
		
		System.out.print("점수 입력 > ");
		int total = sc.nextInt();
		char grade = 'c';
		
		
		if (total >= 90) {
			grade = 'A';
		}else if(total >= 80) {
			grade = 'B';
		}else if (total >= 70) {
			grade = 'C';
		}else {
			grade = 'D';
		}
		
		System.out.println(grade + " 학점 입니다.");
		
		
		

	}

}
