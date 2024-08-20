package person;

public class Person {
	
	
	// 설계도에 해당하는곳
	// class == 설계도
	// 1) Field(필드) : 데이터, 변수, 속성, 정보
	// 내가 설게하고자 하는 Object(Person) 가 가질 수 있는 데이터
	
	// 사람이 가질 수 있는 데이터(변수)는?
	// - 나이
	int age;
	// - 성별
	String gender;
	// - 이름
	String name;
	// 필드를 만들 때는 선언만 해준다
	// 이름을 "김박최수연" 으로 설계도를 만들어 놓으면 이 설계도를 통해
	// 만들어지는 모든 사람들은 이름이 "김박최수연"이 된다.
	
	// 2) Method(메서드) : Object의 행위/행동, 기능
	// 사람이 할 수 있는 행위/행동
	
	// - 숨쉬기
	public void breathe() {
		System.out.println("스읍");
		System.out.println("하아");
	}
	// - 밥먹기
	public void eat() {
		System.out.println("쩝쩝쩝");
	}
	// - 잠자기
	public void sleep() {
		System.out.println("드르렁");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
