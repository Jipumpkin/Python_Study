package 마우스;

public class Main {

	public static void main(String[] args) {
		//BallMouse
		BallMouse mouse1 = new BallMouse();
		
		mouse1.drag();
		mouse1.leftClick();
		mouse1.rightClick();
		
		WheelMouse mouse2 = new WheelMouse();
		
		mouse2.drag();
		mouse2.leftClick();
		mouse2.rightClick();
		
		mouse2.scroll();
		
		// 상속
		// : 기존의 클래스의 변수/메서드를 물려받아
		// 새로운 클래스를 구성하는것
		
		// 기존클래스 : 부모클래스, 수퍼클래스
		// 새로운 클래스 : 자식클래스, 서브클래스
		
		// 부모 <---데이터를 탐색해나가는 방향-- 자식
		
		// extends(확장하다) 
		// public class 자식클래스 extends 부모클래스
		
		HealthMouse mouse3 = new HealthMouse();
		
		mouse3.health();
		
		// 1. 다중 상속은 불가능하다
		// - 두 명 이상의 부모클래스를 가질 수 없다
		// 2. 상속 횟수에는 제한이 없다
		// 3. 모든 클래스는 기본적으로 Object클래스를 상속받고 있다.
		// Object는 자바에서 최상위 클래스, 최상위 계층구조에 위치한 자료형이다.
		
		
		
	}

}
