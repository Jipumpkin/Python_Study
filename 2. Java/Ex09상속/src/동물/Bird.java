package 동물;

public class Bird extends Animal {

	public void egg() {
		System.out.println("알낳음");
	}
	
	@Override
	public void move() {
		System.out.println("난다");
	}
	
	
	
	// 오버라이딩(Override) : 재정의
	
	// 오버로딩(Overloading) : 중복정의
	
}
