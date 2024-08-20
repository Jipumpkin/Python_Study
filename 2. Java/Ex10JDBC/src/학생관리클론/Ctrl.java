package 학생관리클론;

public class Ctrl {
	
	StuDAO dao = new StuDAO();
	
	public void StuAdd(StuDTO dto) {
		dao.StuAdd(dto);
	}
}
