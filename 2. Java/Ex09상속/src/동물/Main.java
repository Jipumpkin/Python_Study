package 동물;

public class Main {

	public static void main(String[] args) {
		
		Penguin p1 = new Penguin();
		
		// 업캐스팅 (Upcasting)
		Animal a1 = p1; // p1은 자료형이 Penguin
		//자동형변환과 비슷한 개념
		// p1 : 성별, 밥을먹는다, 잔다, 헤엄친다, 알을낳는다
		a1.move();
		// 1) 오버라이딩된 메서드는 자식 클래스에 있던것이 실행된다.
		// 2) 고유하게 가지고 있는 메서는 사용할수 없게 된다.
		
		
		// 다운캐스팅 (Downcasting)
		// : 부모클래스가 자식클래스 타입으로 형변환되는 것을 말한다.
		// 단, 업캐스팅이 된 부모클래스자료형만 자식클래스로 바꿀 수 있다.
		Animal a2 = new Animal();
//		Whale w1 = (Whale)a2;
		
		Penguin p2 = (Penguin)a1;
		// 동물은 고래다 -> 말이안됨
		// 강제형변환
		// 1) 다운캐스팅을 진행하면 업캐스팅때 사용할수 없게되었던 고유한 기능을 다시 사용할수 있게 된다.
		
		Eagle e1 = new Eagle();
		Eagle e2 = new Eagle();
		
		Penguin p3 = new Penguin();
		whale w2 = new whale();
		
		
		Animal a3 = e1;
		Animal a4 = e2;
		Animal a5 = p3;
		Animal a6 = w2;
		
		// 업캐스팅하여 같은 자료형이되어 배열로 관리할수가 있게 됨
		
		//====================================================
		
//		Animal a7 = new Animal();
//		Mammal m1 = new Mammal();
//		// class
//		Whale w = new Whale();
		
		// 추상 메서드가 구체화 되지 않은 클래스의 객체는 생성 할 수 없다.
		
		
		
		
	}

}
