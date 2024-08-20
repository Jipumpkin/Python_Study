package 저금통;

public class PiggyBank {

	private int money;
	// private : 필드를 클래스 외부에서 접근할 수 없도록 도와주는 제한자
	// private로 되어있는 필드는 존재하고 있는 클래스 내부에 메서드를 통해서만
	//접근이 가능하다
	
	//Piggybank 클래스의 필드에 접근할수 있는 메서드를 만들어줘야한다
	// - 생성자(constructor)
	
	public PiggyBank(int money) {
		this.money = money;
		// - 기본 생성자 : 클래스를 만들때 생략되어있다.
		// 1. 객체 생성을 할수있다
		// 2. 필드를 초기화 시키는 기능을 가지고 있다
	}
	
	
	// 생성자의 특징 (아주중요)
	// 1. 생성자도 메서드 - ()
	// 2. 생성자는 리턴타입이 없다 (void도 올수없다)
	// 3. 기본생성자는 생략되어있다.
	// 4. 새로운 생성자를 내가 만들면
	//	  필드를 초기화시키는 생성자를 만들면
	//    기본 생성자는 사용할 수 없게 된다.
	//  기본생성자도 사용하고 필드 초기화도 같이 쓰고싶으면? > 오버로딩쓰면됨
	// 5. 생성자의 이름은 클래스(설계도)의 이름과 같다
	
	
	
	
	
	
	
	
	
	
	
	// getter/setter
	// getter : 필드에 있는 값을 수정하고 싶을때 사용하는 메서드
	
	public int getMoney() { // getter
		// 현재 필드에 있는 값을 결과로 돌려주면됨
		return money;
	}
	
	public void setMoney(int money) { // setter
		// 매개변수 money : 어떤 값으로 수정할 건지에 대한 데이터
		this.money = money;
	}
	
	
	
	
	public void deposit(int money) {
		this.money += money;
		// 필드 변수명이랑 매개변수명을 같이하려면 this 키워드 쓰면됨
		System.out.println(money+"원 저금 완료");
	}
	public void withdraw(int a) {
		money -= a;
		System.out.println(a+"원 인출 완료");
		
	}
	public void showMoney() {
		System.out.println("잔액 : "+money+"원");
	}
}
