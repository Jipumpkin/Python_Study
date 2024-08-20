package 학생정보관리프로그램;

public class StudentDTO {
	
	// DTO : data trensfer object
	// student 테이블에 있는 컬럼만큼 필드, getter가 만들어져 있어야 한다
	// name, age, gender, major
	
	private String name;
	private int age;
	private String gender;
	private String major;

	
	// 생성자 - 매개변수 4개
	public StudentDTO(String name, int age, String gender, String major) {
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.major = major;
	}
	public StudentDTO(String name, int age, String major) {
		this.name = name;
		this.age = age;
		this.major = major;
	}
	public StudentDTO(String name, int age) {
		this.name = name;
		this.age = age;
	}
	public StudentDTO(String name) {
		this.name = name;
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
	
	// getter
	
	
	
}
