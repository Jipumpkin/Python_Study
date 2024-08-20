package 학생스코어;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		// 1. StudentScore 자료형을 관리하는 배열생성하기
		// 크기는 3으로 이름은 score
		
		StudentScore[] score = {
			    new StudentScore(),
			    new StudentScore(),
			    new StudentScore()
			};

		
		// 2. 값을 입력받아서 StudentScore를 초기화 하기
		// 즉 생성자를 사용해서 필드를 초기화하고
		// 사용자가 입력한 값을 전달인자로 사용하기
		
		
		for(int i = 0; i<score.length; i++) {
			
			System.out.print((i+1)+"번째 학생의 이름을 입력하세요. >> ");
			score[i].setName(sc.next());
			System.out.print((i+1)+"번째 학생의 Java 점수를 입력하세요. >> ");
			score[i].setScoreJava(sc.nextInt());
			System.out.print((i+1)+"번째 학생의 Web 점수를 입력하세요. >> ");
			score[i].setScoreWeb(sc.nextInt());
			System.out.print((i+1)+"번째 학생의 Android 점수를 입력하세요. >> ");
			score[i].setScoreWeb(sc.nextInt());
			
			System.out.println();
			
			
			
			
			
		}
		
		
		
		// 3. 2번에 해당하는걸 3번 진행해야함 - for문을 사용해서 반복
		// 0,1,2 인덱스에 사용자가 입력한 값이 각각 들어가줘야함
		
		// 4. 입력이 다 끝나고나면 for문을 사용해서 각각의 데이터를 출력
		// 0,1,2 인덱스에 저장되어있는건 주소값
		// 주소값을 참조해서 이름이랑 점수들을 출력해보자
		// (데이터를 가져와주는 기능은 업나? - getter가 만들어져있음)
		
		
		for(int i = 0; i<3; i++) {
			int 총점 = score[i].getScoreAndroid() + score[i].getScoreJava() + score[i].getScoreWeb() ;
			int 평균 = (score[i].getScoreAndroid() + score[i].getScoreJava() + score[i].getScoreWeb())/3 ;
			System.out.println(score[i].getName()+"님의 총점은 "+총점+"점, 평균은 "+평균+"점 입니다.");
		}
		
		
		
		
		

	}

}
