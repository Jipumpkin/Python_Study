package for문;

import java.util.Scanner;

public class Ex03for문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int num1 = sc.nextInt();
        int sum = 0;
		
		for (int minus = 0; num1-minus>1; minus++) {
			
			if (num1%(num1-minus)==0) {
				System.out.println(num1-minus);
				sum = sum+(num1-minus);
			}
		}
		System.out.println("약수 총합 : "+sum);
		
		// clean code라는것은
		// - 코드의 길이가 짧다.
		// - 유지보수가 용이하다
		// - 가독성이 뛰어나다
		// - 시간복잡도가 줄어든 코드이다
		// : 실행시간
		
		
		
		
		
		
		
		

	}

}
