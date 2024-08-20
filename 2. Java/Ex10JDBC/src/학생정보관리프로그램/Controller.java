package 학생정보관리프로그램;

public class Controller {
	
	// 학생등록을 진행하는 기능 = view에서 입력한 등록할데이터를 받아주는 역할
	
	public void insert(StudentDTO dto) {
		
		StudentDAO dao = new StudentDAO();
		int cnt = dao.insert(dto); //cnt
		
		if(cnt > 0) {
			System.out.println("학생 등록 성공");
			
		}else {
			System.out.println("학생 등록 실패");
		}
		
		
	}
	public void update(StudentDTO dto) {
		
		StudentDAO dao = new StudentDAO();
		int cnt = dao.update(dto); //cnt
		
		if(cnt > 0) {
			System.out.println("업데이트 성공");
			
		}else {
			System.out.println("업데이트 실패");
		}
		
		
	}
	public void delete(StudentDTO dto) {
		
		StudentDAO dao = new StudentDAO();
		int cnt = dao.delete(dto); //cnt
		
		if(cnt > 0) {
			System.out.println("삭제 성공");
			
		}else {
			System.out.println("삭제 실패");
		}
		
		
	}
	public void select() {
		
		StudentDAO dao = new StudentDAO();
		dao.select();
		
		System.out.println("조회성공");
		
		
	}
	
	public void serch(StudentDTO dto) {
		
		StudentDAO dao = new StudentDAO();
		dao.serch(dto);
		
		System.out.println("검색성공");
		
		
		
	}
	
}
