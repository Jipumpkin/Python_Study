package 월급계산프로그램;

public class Employee {
	// 월급 주는 기능
	String empno;
	String name;
	int pay;
	
	public int getMoneyPay() {
		
		return pay/12;
		
	}
	
	public String print() {
		
		return empno+" : "+name+" : "+pay;
	}
	
	
}
