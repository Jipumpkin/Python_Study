package if_else문;

import java.util.Scanner;

public class Ex02if_else문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		
		System.out.println("사려는 추석 세트 갯수를 아래에 입력 ");
        
		
		int cnt = sc.nextInt();
		
		if (cnt>10) {
			System.out.println(cnt*9000 + "원 입니다.");
		}else {
			System.out.println(cnt*10000 + "원 입니다.");
		}
		
		
		
		
	}

}
