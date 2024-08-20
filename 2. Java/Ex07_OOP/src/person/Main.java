package person;

public class Main {

	public static void main(String[] args) {
		// 설계도를 사용하는것
		// 설계도의 이름 레퍼런스형 변수명 = new 설계도의 이름();
		Person p1 = new Person();
		// new - 새로운 주소값을 가지는 동적 메모리를 할당
		
		System.out.println(p1);
		
		// Person - 필드(나이, 이름, 성별), 메서드(숨쉬기,먹기,자기)
		
		// . <- 연산자임 / 참조연산자
//		p1.name = "김박최수연";
//		// Stirng name = "김박최수연"
//		p1.age = 20;
//		p1.gender = "여자";
		
		
//		System.out.println(p1.name);
//		p1.breathe();
//		p1.eat();
//		p1.sleep();
		
		
		// 실습) Person 설계도를 사용해서 p2를 만들어보자
		// p2의 필드를 짝꿍의 데이터로 초기화를 시켜보자
		// 그리고 출력하기
		// 최영화 : 20 : 여자
		
		
		Person p2 = new Person();
		
		p2.name = "김희은";
		p2.age = 27;
		p2.gender = "여자";
		
		
		System.out.print(p2.name+" : "+p2.age+" : "+p2.gender);
		
		
		
		
		
		
		
		
		
		
		

	}

}
