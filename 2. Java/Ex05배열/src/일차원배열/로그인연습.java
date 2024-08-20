package 일차원배열;

import java.util.Scanner;

public class 로그인연습 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		String[] id_arr = new String[3];
		int[] pw_arr = new int[3];
		
		while(true) {
			boolean logsuc = false;
			System.out.print("[1]회원가입 [2]로그인 [3]종료 >> ");
			
			int sel = sc.nextInt();
			int Rcount = 0;
			
			if(sel==3) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}else if(sel==1) {
				if(Rcount!=3) {
					System.out.println("회원가입을 진행합니다.");
					System.out.print("회원가입 아이디 입력 : ");
					id_arr[Rcount] = sc.next();
					System.out.print("회원가입 비밀번호 입력 : ");
					pw_arr[Rcount] = sc.nextInt();
					System.out.println("회원가입 성공.");
					Rcount++;
				}else {
					System.out.println("회원가입 인원이 초과되었습니다.");
				}
				
			}else if(sel==2) {
				System.out.println("로그인을 시도합니다.");
				System.out.print("로그인 아이디 입력 >> ");
				String logid = sc.next();
				System.out.print("로그인 비밀번호 입력 >> ");
				int logpw = sc.nextInt();
				
				for(int i = 0; i<3; i++) {
					if(id_arr[i] != null && id_arr[i].equals(logid) && pw_arr[i] == logpw) {
						System.out.println("로그인 성공");
						logsuc = true;
						break;
					}
				}
				
				
			}
			
			if(logsuc) {
				break;
			}
			
			
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
