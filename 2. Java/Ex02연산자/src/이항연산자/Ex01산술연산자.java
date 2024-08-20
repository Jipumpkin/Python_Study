
package 이항연산자;

import java.util.Scanner;

public class Ex01산술연산자 {

	public static void main(String[] args) {
		//산술 연산자 종류
		
		// +,-,*,/,%
		// 더하기, 뺴기, 곱하기, 몫, 나머지
		
		// 숫자 2개 준비하기(각각 num1, num2라는 변수에 3과 7을
		// 저장 해주자
		
		int num1 = 3;
		int num2 = 7;
		System.out.println(num1 + num2);
		System.out.println(num1 - num2);
		System.out.println(num1 * num2);
		System.out.println(num1 / num2);
		System.out.println(num1 % num2);
		// ctrl + alt + 위/아래 방향키
		
		
		// 실습) num3와 num4에 사용자가 입력한 값이 
		// 저장 될 수 있도록 만들어 보자
		// sacnner - nextInt()
		// 그리고 나서 num3와 num4에 산술 연산자 들의 결과값을 출력해보자
		// 단, /(몫) 연산 결과값이 소수점의 보여지게 만들어보자
		// 힌트) int/int -- int
		
		//sacnner - nextInt()
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자를 입력하세요 >> ");
		int num3 = sc.nextInt();
		System.out.print("두번째 숫자를 입력하세요 >> ");
		int num4 = sc.nextInt();
		
		
		
		
		System.out.println((double)num3 / num4);
		
		
		// + : 문자열 연산이 가능하다.
		// 10 + 5 + 6 왼쪽에서 오른쪽으로 계산
		
		System.out.println(7+3+"7");
		System.out.println(7+"3"+7);
		System.out.println("7"+3+7);
		
		// 문자열과 숫자가 더해지면 숫자는 문자열로 형변환된다.(앞뒤무관)
		
		System.out.println("더하기 결과값 : "+(num1+num2));
		
		// ()로 묶어주면 먼저 연산이 된다.
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
