
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// 1 1 2 2 2 8이 되도록 사용자 입력에 부족한 수를 출력
		
		Scanner sc = new Scanner(System.in);
		
		
		String ches = sc.next();
		
		String[] Clist = ches.split(" ");
		int[] Cnum = new int[6];
		int[] resu = {1,1,2,2,2,8};
		
		
		
		for(int i = 0; i<Clist.length; i++) {
			
			Cnum[i] = Integer.parseInt(Clist[i]);
			
			
		}
		
		for(int i = 0; i<6; i++) {
			resu[i] = resu[i] - Cnum[i];
			System.out.print(resu[i]+" ");
			
			
		}
		
		
		
		
		
		

	}

}
