package 이중for문;

import java.util.Scanner;

public class Ex04별찍기2 {

	public static void main(String[] args) {
		//행의 갯수 입력받아 별찍기
		
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("행 입력 : ");
		int num = sc.nextInt();
		for(int i = 0; i < num; i++) {
			
			for(int i2 = 0; i2 < num-i; i2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
