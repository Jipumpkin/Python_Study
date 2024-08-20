package 학생관리클론;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		
		Scanner sc = new Scanner(System.in);
		Ctrl con = new Ctrl();
		
		while(true) {
			System.out.print("[1]학생추가 [2]학생리스트 [3]학생검색 [4]학과수정 [5]학생삭제 [6]종료 > ");
			int sel = sc.nextInt();
			
			
			if(sel == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("성별 : ");
				String gender = sc.next();
				System.out.print("학과 : ");
				String major = sc.next();
				
				StuDTO dto = new StuDTO(name,age,gender,major);
				
				con.StuAdd(dto);
				
				
				
				
			}else if(sel == 2) {
				
			}else if(sel == 3) {
				
			}else if(sel == 4) {
				
			}else if(sel == 5) {
				
			}else if(sel == 6) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		
		

	}

}
