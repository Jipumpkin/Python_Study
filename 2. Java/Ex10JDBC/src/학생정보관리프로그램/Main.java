package 학생정보관리프로그램;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("[1]학생등록 [2]학생전체조회 [3]학생검색 [4]학생정보수정 [5]학생정보삭제 [6]프로그램종료 >>");
			int sel = sc.nextInt();
			
			if(sel == 1) {
				System.out.print("이름 : ");
				String name = sc.next();
				System.out.print("나이 : ");
				int age = sc.nextInt();
				System.out.print("성별 : ");
				String gender = sc.next();
				System.out.print("전공 : ");
				String major = sc.next();
				
				StudentDTO dto = new StudentDTO(name, age, gender, major);
				// dto를 db에 등록하려면
				// controller에 있는 insert로 전달
				
				Controller con = new Controller();
				con.insert(dto);
				
				
				
			}else if(sel == 2) {
				Controller con = new Controller();
				con.select();
				
			}else if(sel == 3) {
				
				System.out.print("검색할 학생의 이름을 입력 : ");
				String name = sc.next();
				StudentDTO dto = new StudentDTO(name);
				
				Controller con = new Controller();
				
				con.serch(dto);
				
				
				
				
				
				
				
				
			}else if(sel == 4) {
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("나이 입력 :");
				int age = sc.nextInt();
				System.out.println("수정할 전공 입력 :");
				String major = sc.next();
				StudentDTO dto = new StudentDTO(name, age, major);
				Controller con = new Controller();
				
				
				con.update(dto);
				// 학새 정보 수정 성공/학생 정보 수정 실패
			}else if(sel == 5) {
				//학생 정보 삭제
				System.out.println("이름 입력 : ");
				String name = sc.next();
				System.out.println("나이 입력 : ");
				int age = sc.nextInt();
				
				
				
				// StudentDTO 캡슐화를 진행 dto
				StudentDTO dto = new StudentDTO(name, age);
				Controller con = new Controller();
				con.delete(dto);
				// 학생정보 삭제 성공/실패
				
			}else if(sel == 6) {
				System.out.println("프로그램 종료.");
				break;
			}
			
		}
		
		
		
	}

}
