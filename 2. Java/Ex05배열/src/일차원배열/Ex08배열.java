package 일차원배열;

import java.util.Scanner;

public class Ex08배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("==채점하기==");
		System.out.println("답을 입력하세요");
		
		
		int[] answer = {1,4,3,2,1};
		int[] user = new int[5];
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i+1)+"번 답>>");
			user[i] = sc.nextInt();
			
		}
		
		System.out.println("정답확인");
		
		int 점수 = 0;
		
		for(int i = 0; i < 5; i++) {
			if(answer[i]==user[i]) {
				System.out.print("O ");
				점수 = 점수+20;
			}else {
				System.out.print("X ");
			}
		}
		System.out.print(" 점수 : "+점수);
		
		
		
		

	}

}
