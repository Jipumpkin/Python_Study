package 이차원배열;

public class Ex00이차원배열개념 {

	public static void main(String[] args) {
		
		// 이차원 배열
		// : 1차원 배열 안에 1차원 배열이 들어가 있는 구조
		// : 같은 자료형의 데이터들을 관리하는 구조
		
		// 1) 이차원 배열 선언 및 생성
		// 자료형[][] 배열명 = new 자료형[5][3];
		
		
		int[][] arr = new int[5][3];
		
		System.out.println(arr);
		
		System.out.println(arr[0]); //주소값
		//3칸짜리 배열이 만들어져있는 주소
		System.out.println(arr[1]);
		
		arr[0][0] = 1;
		arr[0][1] = 2;
		//arr[0]는 3칸짜리 배열이 저장되어있는 주소값을 저장하는 
		//레퍼런스형 변수가 됨
		
		
		//arr2라는 이차워 ㄴ배열
		// 크기는 5,5 정방형 이차원 배열
		// 1~25라는 숫자를 순차적으로 대입
		
		int num = 1;
		
		int[][] arr2 = new int[5][5];
		
		
//		arr2[0][0] = num;
//		
//		num++;
//		arr2[0][1] = num;
//		
//		num++;
//		arr2[0][1] = num;		
//		
//		num++;
//		arr2[0][3] = num;
//		
//		num++;
//		arr2[0][4] = num;		
//		
//		num++;
//		arr2[0][5] = num;		
		
		
		
		
		for(int j = 0; j < arr2.length; j++) {
			
			for(int i = 0; i < arr2.length ; i++) {
				arr2[j][i] = num;
				num++;
			}
			
		}
		
		// 1 2 3 4 5
		// 6 7 8 9 10
		// 11 12 13 14 15
		// 16 17 18 19 20
		// 21 22 23 24 25
		
		for(int j = 0; j < arr2.length; j++) {
			
			for(int i = 0; i < arr2.length ; i++) {
				System.out.print
				(arr2[j][i]+"\t");
			}System.out.println();
			
		}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
