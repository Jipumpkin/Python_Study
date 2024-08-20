package 삼항연산자;
import java.util.Scanner;


public class Ex01삼항연산자 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("정수를 입력해라 > ");
		int num = sc.nextInt();
		
		
		System.out.println(num+"은(는) "+(num%2==0? "짝수다":"홀수다"));
		String 결과 = (num%2==0? "짝수":"홀수");
		System.out.println(결과);
		
		
		
		

	}

}
