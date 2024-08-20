package while문;

import java.util.Scanner;

public class Ex06예제 {

	public static void main(String[] args) {
		// 현재 몸무게와 목표 몸무게를 입력받고 주차별 감량 몸무게를 입력받기
		
		// 목표 몸무게를 달성하면 축하한다는 문구를 입력하고 입력을 멈추기
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("현재 몸무게 입력 : ");
		int 현재몸무게 = sc.nextInt();
		System.out.print("현재 몸무게 입력 : ");
		int 목표몸무게 = sc.nextInt();
		System.out.println();
		int N = 1;
		
		
		do {
			
			System.out.print(N+"주차 감량 뭄무게 입력 : ");
			int 몸무게 = sc.nextInt();
			
			if (몸무게 >= 20) {
				System.out.println("수치가 비정상입니다.");
				continue;
			}
			
			현재몸무게 = 현재몸무게 - 몸무게;
			
			if (현재몸무게 > 목표몸무게) {
				N++;
			}else {
				System.out.println(현재몸무게+"kg 달성. 축하합니다.");
				break;
			}
			
		}while(true);
		
		
		
		
		
		
		
		
		
		

	}

}
