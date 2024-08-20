package 이차원배열;

public class Ex04이차원배열 {

	public static void main(String[] args) {
		
		
		int[][] array = new int[5][5];
		
		int num = 21;
		
		
		
		for(int j = 1; j < 6 ; j++) {
			
			if(j%2==1) {
				for(int i = 0; i < 5; i++) {
					array[j-1][i] = num;
					num++;
				}
			}else {
				for(int i = 4; i > -1; i--) {
					array[j-1][i] = num;
					num++;
				}
			}
			
					
				

				
			
			
			
		}
		
		for(int j = 0; j < array.length; j++) {
			
			for(int i = 0; i < array.length ; i++) {
				System.out.print
				(array[j][i]+"\t");
			}System.out.println();
			
		}
		
		
	}

}
