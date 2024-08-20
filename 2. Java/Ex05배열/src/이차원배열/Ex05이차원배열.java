package 이차원배열;

import java.util.Scanner;

public class Ex05이차원배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		int[] point = {92, 32, 52, 9, 81, 2, 68};
		
		int min = 0;
		int max = 0;
		int dis = point[0] - point[1];
		
		for(int i = 0; i < 6; i++) {
			
			for(int j = 0; j < 6; j++) {
				
				int minus = point[i] - point[j];
				
				if(minus>0 && minus<dis) {
					dis = minus;
					min = i;
					max = j;
				}
				
				
			}
			
		}
		
		System.out.println("result["+min+","+max+"]");
		
		
		
		
		
//		System.out.print("92, 32, 52, 9, 81, 2, 68 중 첫번째 숫자 선택 > ");
//		
//	    int sel1 = sc.nextInt();
//	    
//		System.out.print("92, 32, 52, 9, 81, 2, 68 중 두번째 숫자 선택 > ");
//		
//	    int sel2 = sc.nextInt();
		
		
		
		
		
		

	}

}
