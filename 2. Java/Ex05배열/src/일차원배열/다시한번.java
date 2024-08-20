package 일차원배열;

import java.util.Random;

public class 다시한번 {

	public static void main(String[] args) {
		
		Random rd = new Random();
		
		int[] lotto = new int[5];
		
		for(int i = 0; i<lotto.length; i++) {
			int lotto_num = rd.nextInt(10)+1;
			
			boolean uniq = false; // 기본적으로 중복된 것으로 설정
			for (int i2 = 0; i2 < lotto.length; i2++) {
			    if (lotto_num != lotto[i2]) {
			        uniq = true; // 중복이 아닌 경우에만 true로 변경
			    }else {
			    	uniq = false;
			    	break;
			    }
			}
			if(uniq) {
				lotto[i] = lotto_num ;
			}else {
				i--;
			}
		}
			

		System.out.println("로또결과는?");
		for(int i = 0; i<lotto.length; i++) {
			System.out.print(lotto[i]+" ");
		}
		
		
		

		
		
		
		

	}

}
