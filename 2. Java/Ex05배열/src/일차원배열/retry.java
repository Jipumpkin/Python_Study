package 일차원배열;

import java.util.Random;

public class retry {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] lotto = new int[5];
		
		for(int i = 0; i<lotto.length; i++) {
			
			lotto[i] = rd.nextInt(10)+1;
			
			for(int j = 0; j<5; j++) {
				
				if(lotto[j]==lotto[i]) {
					i--;
					break;
				}
				
			}
			
			
			
			
		}
		
		System.out.println("===결과===");
		for(int i = 0; i<lotto.length; i++) {
			
			System.out.print(lotto[i]+" ");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
