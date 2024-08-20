package while문;

import java.util.Scanner;

public class Ex07예제 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		// 숫자, 문자한개(char) 자료를 비교할때 
		// : ==
		
		// 문자열이 같다를 비교할 떄는
		// : equals()
		
		String name = "김박최수연";
		// name.equals("김박최수연")
		// boolean 값 반환
		
		
		// 문자열 입력은 sc.next();
		
		
		String ID = "abcd";
		String PW = "12345";
		int logcount = 1;
		
		
		while(true) {
			System.out.print("아이디를 입력하세요 : ");
			String inID = sc.next();
			System.out.print("비밀번호를 입력하세요 : ");
			String inPW = sc.next();
			
			if(ID.equals(inID) && PW.equals(inPW)) {
				System.out.println("로긴성공~");
				break;
			}else {
				if(logcount==3) {
					System.out.println("로그인 3회 실패. 본인인증 요망");
					break;
				}
				logcount++;
				System.out.print("아이디와 비밀번호가 틀렸다. 재시도 할까? N/Y : ");
				String answer = sc.next();
				if (answer.equals("N")||answer.equals("n")) {
					break;
				}else if (answer.equals("Y")||answer.equals("y")) {
				}else {
					System.out.println("장난치지마라~");
					break;
				}
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
