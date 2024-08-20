package 사람;

public class Person {
	
	
	
	private String name;
	private int age;
	
	public Person() {
		
	}
	
	public Person(String ipName, int ipAge) {
		name = ipName;
		age = ipAge;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String ipName) {
		name = ipName;
	}
	
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int ipAge) {
		age = ipAge;
	}
	
	
	
	
	public void show() {
		System.out.println("객체 학생 이름 : "+name+", 나이 : "+age);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
