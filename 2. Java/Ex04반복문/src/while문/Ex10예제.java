package while문;

import java.util.Random;
import java.util.Scanner;

public class Ex10예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		
		
		System.out.println("====1부터 100까지 숫자 맞추기 게임====");
		
		int rdint = rd.nextInt(100)+1;
		while(true) {
			
			System.out.print("1부터 100사이의 정수를 출력해보세요 : ");
			int answer = sc.nextInt();
			
			if (rdint == answer) {
				System.out.println("정답");break;
			}else if(rdint > answer) {
				System.out.println("Up");
			}else if(rdint < answer) {
				System.out.println("Down");
			}else {
				
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
