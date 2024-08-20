package while문;

import java.util.Scanner;

public class Ex00while문 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		// while문
		// 반복 횟수가 정해져 있지 않은 ㄱㅇ우 사용한다
		// ex) 사용자가 5라는 숫자를 입력하면 멈출건데
		//     몇번쨰에서 5라는 숫자를 입력할지 모르는 상황
		
		
		// while문의 구조
		// while(조건식){조건식이 true인 동안 실행되는 코드}
		
		// 1)조건식을 사용해서 while문을 멈춰보자
		
//		int num1 = 1;
//		// 2) 조건식을 true
//		//    종료 조건을 준다.
//		
//		
//		while(num1 <= 10) {
//			System.out.println("출력");
//			num1++;
//			
//		}
		
		
		//실습) 사용자로부터 숫자를 입력받는 걸 반복
		// 사용자가 숫자로 7을 입력하면 멈추게 만들자
		
		
//		while(true) {
//			System.out.print("정수 입력 : ");
//			int num = sc.nextInt();
//			
//			if (num == 7) {
//				System.out.println("종료");
//				break;
//			}
//		}
		
		int num = 0;
		while(num!=7) {
			System.out.print("정수 입력 : ");
			num = sc.nextInt();
				
			}
		System.out.println("종료");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
	
		
		
		
		
		
		

	}

}
