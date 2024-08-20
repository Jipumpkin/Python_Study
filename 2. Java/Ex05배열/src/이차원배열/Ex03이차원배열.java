package 이차원배열;

public class Ex03이차원배열 {

	public static void main(String[] args) {
		
		int[][] array = new int[5][5];
		
		int num = 21;
		
		
		
		for(int j = 0; j < 5 ; j++) {
			
			
			for(int i = 0; i < 5 ; i++) {
				
				if(j%2==1) {
					array[j][i] = num;
					num++;
				}else {
					if(i==0) {
						array[j][4] = num;
						num++;
					}else if(i==1){
						array[j][3] = num;
						num++;
					}else if(i==2) {
						array[j][2] = num;
						num++;
					}else if(i==3) {
						array[j][1] = num;
						num++;
					}else if(i==4) {
						array[j][0
						         ] = num;
						num++;
					}

					
					
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
