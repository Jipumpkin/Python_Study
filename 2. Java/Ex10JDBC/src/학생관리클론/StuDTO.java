package 학생관리클론;

public class StuDTO {
	
	private String name;
	private int age;
	private String gender;
	private String major;
	
	
	
	public StuDTO(String name, int age, String gender, String major) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.major = major;
	}
	public String getName() {
		return name;
	}
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
	public String getMajor() {
		return major;
	}
	
	
	
	
	

}
