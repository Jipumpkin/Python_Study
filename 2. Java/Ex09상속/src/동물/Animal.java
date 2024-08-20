package 동물;

public abstract class Animal {
	String Gender;
	
	public void eat() {
		System.out.println("쿰척");
		
	}
	public void sleep() {
		System.out.println("드르렁");
	}
	
	
//	public void move() {
//		System.out.println("쿵쿵");
//	}
	
	// move가 어짜피 자식 클래스에서 계속 재정의되고있음을 발견..
	// body 걍 없애버림..
	// 그렇게하려면 추상메서드로 만들어줘야함...
	// public abstract 리턴타입 메서드명();
	
	public abstract void move();
	
	// class에 갑자기 오류 발생
	// 추상 메서드를 포함하고 있는 클래스는 반드시 추상 클래스가 되어야한다.
	
	// 추상 클래스는 일반 메서드만 가지고 있을 수 있는가?
	// 가능하다.
	
	//
}
