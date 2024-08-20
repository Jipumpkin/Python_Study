package 학생;

public class Student {
	
	private String name;
	private String number;
	private int age;
	private int scoreJava;
	private int scoreWeb;
	private int scoreAndroid;
	
	public Student() {
		
	}
	public Student(String Na, String Num, int Ag, int scojava, int scoweb, int scoand) {
		name = Na;
		number = Num;
		age = Ag;
		scoreJava = scojava;
		scoreWeb = scoweb;
		scoreAndroid = scoand;
		
	}
	
	
	
	public void show() {
		System.out.println(name+"님 안녕하세요.");
		System.out.println("[ "+number+", "+age+"살"+" ]");
		System.out.println(name+"님의 Java점수는"+scoreJava+"점 입니다.");
		System.out.println(name+"님의 Web점수는"+scoreWeb+"점 입니다.");
		System.out.println(name+"님의 Android점수는"+scoreAndroid+"점 입니다.");
		System.out.println("===================================================");
		
	}
	
	
	
	
	
	
	
	
	
	
}
