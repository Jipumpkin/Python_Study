package 메서드;

public class Ex09Overloading {

	public static void main(String[] args) {
		
		// 한국인 이름을 데이터베이스에 저장하는 메서드 :
		// stName(성,이름)
		stName("박","지호");
		
		// 오버로딩(중복정의)
		// 같은 클래스 내에서 같은 이름의 메서드를 정의 가능
		// 매개변수의 형태가 달라야함(데이터타입, 매개변수 개수, 순서)
		
		// 쓰는이유
		// 같은 기능을 하는 메서드들이 서로 다른 이름을 가지고 있으면 귀찮음
		// 코드의 길이가 둘어듦, 미국인 한국인 일본인 파키스탄인 구분 필요없다
	}
	
	
	public static void stName(String Fname, String Lname) {
		
	}
	public static void stName(String Fname, String Mname, String Lname) {
		
	}

}
