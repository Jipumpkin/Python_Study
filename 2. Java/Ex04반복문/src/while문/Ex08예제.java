package while문;

import java.util.Scanner;

public class Ex08예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("첫번째 수 입력 : ");
			int num1 = sc.nextInt();
			System.out.print("두번째 수 입력 :");
			int num2 = sc.nextInt();
			System.out.print("연산 방식 선택 [1] 더하기 [2] 빼기 : ");
			int num3 = sc.nextInt();
			
			if(num3==1) {
				System.out.println("연산 결과는 "+(num1+num2)+" 입니다.");
			}else if(num3==2) {
				System.out.println("연산 결과는 "+(num1-num2)+" 입니다.");
			}
			
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
