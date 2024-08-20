package for문;

public class Ex01for문 {

	public static void main(String[] args) {
		
		// for문을 사용하여 21에서 57까지 출력하시오
		
		for(int i = 21; i < 58; i++) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println();
		
		// for문을 사용하여 96에서 53까지 출력하시오
		
		for(int i = 96; i > 52; i--) {
			System.out.print(" "+i);
		}
		
		System.out.println();
		System.out.println();
		
		// for문을 사용하여 21에 57까지의 수 중 홀수만 출력하시오
		
		for(int i = 21; i < 58; i++) {
			
			int hall = 0;
			if (i%2==1) {
				hall = i;
				System.out.print(" "+hall);
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
