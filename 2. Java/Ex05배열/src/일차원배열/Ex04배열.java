package 일차원배열;

import java.util.Scanner;

public class Ex04배열 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 1) 점수가 저장 될 수 있는 배열 선언 및 생성
		// 크기 : 5, int
		
		// 2) score[0] ~ score[4] = sc.nextInt
		
		// 3) 입력된 값을 한번 출력
		// 4) 최대/최소값 출력
		
		
		
		
		
		
		
		int[] score = new int[5];
		
		String list = "";
		
		
		int sum = 0;
		int avg = 0;
		
		
		for(int i = 0; i<score.length; i++) {
			System.out.print((i+1)+"번째 입력 : ");
			score[i] = sc.nextInt();
			list = list + score[i] + " ";
			sum += score[i];
		}
		
		int max = score[0];
		int min = score[0];
		
		for(int i = 0; i<score.length; i++) {
			if(score[i]>max) {
				max = score[i];
			}
			if(score[i]<min) {
				min = score[i];
			}
		}
		
		avg = sum/score.length;
		
		System.out.println("입력된 점수 : "+list);
		
		System.out.println("최고점수 : "+max);
		
		System.out.println("최소점수 : "+min);
		
		System.out.println("총합 : "+sum);
		
		System.out.println("평균 : "+avg);
		
		
		
		
		
		

	}

}
