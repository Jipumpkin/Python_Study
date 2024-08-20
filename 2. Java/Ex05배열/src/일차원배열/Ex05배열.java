package 일차원배열;

import java.util.Scanner;

public class Ex05배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] thr = new int[10];
		
		String thrlist = "";
		
		for(int i = 0; i<thr.length; i++) {
			System.out.println((i+1)+"번 쨰 정수 입력>>");
			thr[i] = sc.nextInt();
			if(thr[i]%3==0) {
				thrlist = thrlist + thr[i] + " ";
			}
		}
		System.out.println("3의 배수 : "+thrlist);
		
		
		
	}

}
