package 계산기;

public class Calculater {
	
	
	private int num1;
	private int num2;
	
	public Calculater(int n1, int n2) {
		num1 = n1;
		num2 = n2;
	}

	

	public void setNum1(int num1) {
		this.num1 = num1;
	}


	public void setNum2(int num2) {
		this.num2 = num2;
	}
	
	
	
	public int sum() {
		return num1+num2;
	}
	
	public int sub() {
		return num1-num2;
	}
	
	public int mul() {
		return num1*num2;
	}
	
	public double div() {
		return num1/num2;
	}
	
	
	
	
	
	
	
	
}
