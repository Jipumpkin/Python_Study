package 일차원배열;

import java.util.Random;

public class Ex06배열 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] lotto = new int[5];
		
		
		for(int i = 0; i<lotto.length; i++) {
			int lottonum = rd.nextInt(10)+1;
			
			boolean uni = true;
			
			for(int i2 = 0; i2<lotto.length; i2++) {
				if(lotto[i2]==lottonum) {
					uni = false;
					break;
				}
			
			}
			if(uni) {
				lotto[i] = lottonum;
			}else {
				i--;
			}
				
				
			
//			if(lotto[0]!=lottonum&&lotto[1]!=lottonum&&lotto[2]!=lottonum&&lotto[3]!=lottonum&&lotto[4]!=lottonum) {
//				lotto[i] = lottonum;
//			}else {
//				i--;	
//			}
			
		}
		System.out.println("=====로또타임=====");
		System.out.println("이번주 출력번호는...");
		
		
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
