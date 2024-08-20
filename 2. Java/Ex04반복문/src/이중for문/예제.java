package 이중for문;

import java.util.Scanner;

public class 예제 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("단수입력 : ");
		
		int 단 = sc.nextInt();
		
		System.out.println("어느 수까지 출력 : ");
		
		int 곱해질수 = sc.nextInt();
		
		System.out.println(단+"단");
		
		
		int count = 1;
		
		while(true) {
			
			
			System.out.println(단+"*"+count+"="+단*count);
			count++;
			
			if(count>곱해질수) {
				break;
			}
			
			
			
		}
		
		
		

	}

}
