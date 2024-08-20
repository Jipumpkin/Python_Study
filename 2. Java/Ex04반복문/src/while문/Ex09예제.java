package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex09예제 {

	public static void main(String[] args) {
		Random rd = new Random();
		Scanner sc = new Scanner(System.in);
		
		
		
//		int randomNumber = rd.nextInt(10);
		// bound를 10으로 주면 0부터 9까지의 랜덤한 숫자를 가져온다.
		// 1부터 10까지는 어떻게?
		// rd.nextInt(10) + 1 ; 하면됨 ㅋ
		
		
		
		
		while(true) {
			System.out.println("=====기초덧셈문제=====");
			
			int num1 = rd.nextInt(10)+1;
			int num2 = rd.nextInt(10)+1;
			
			System.out.print(num1+" + "+num2+" = ");
			int result = sc.nextInt();
			
			if((num1+num2)==result) {
				System.out.println("성공");
				break;
			}else {
				System.out.println("실패");
				int answer = 0;
				while(true) {
					System.out.print("다시 실행할까요? Y/N : ");
				    String sel = sc.next();
				    
				    
				    if(sel.equals("N")||sel.equals("n")) {
				    	answer = 1;
				    	break;
				    }else if (sel.equals("Y")||sel.equals("y")) {
				    	answer = 2;
				    	break;
				    }else {
				    	System.out.println("입력 오류.");
				    }
				    
				    
				}
				
				if(answer==1) {
					break;
				}
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
