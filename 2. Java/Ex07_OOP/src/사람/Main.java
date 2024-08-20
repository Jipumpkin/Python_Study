package 사람;

public class Main {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		
		person1.setAge(20);
		person1.setName("박지호");
		
		Person person2 = new Person("김희은", 25 );
		
		person1.show();
		person2.show();
		
		
		
		// 객체배열
		// - Person 자료형을 관리하는 배열을 선언 및 생성
		
		Person[] pArray = new Person[2];
		// 0 ~ 1
		pArray[0] = person1;
		pArray[1] = person2;
		
		System.out.println(pArray[0].getName());
		System.out.println(pArray[1].getName());
		
		
		
		for(int i = 0; i< pArray.length; i++) {
			System.out.println(pArray[i].getName());
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
