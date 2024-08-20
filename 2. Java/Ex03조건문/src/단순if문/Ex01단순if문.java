package 단순if문;
import java.util.Scanner;
public class Ex01단순if문 {

	public static void main(String[] args) {
		
		
		//제어문
		//컴파일 방향을 개발자가 원하는 방향으로 제어하기 위한 문법
		
		// 1) 조건믄
		// : 조건식(예/아니오)에 따라서 만족하면 실행시키고 만족하지
		// 않으면 다음 코드로 넘어갈 수 있도록 하는 문법
		
		// if, if-else, elseif, swtich-case
		
		
		// 단순 if문의 문법 구족
		// if (조건식) { 조건이 true일 경우, 실행시킬 코드 }
		
		// 조건식 : 결과값으로 boolean자료형을 돌려주는 식
		// (비교연산식, 논리연산식, boolean)
		
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("나이 입력 : ");
		int age = sc.nextInt();
		
		if (age>19) {
			System.out.println("성인입니다.");
		}
		
		
		
		
		
		
		
		
		
	}

}
