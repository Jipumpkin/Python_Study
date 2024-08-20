package 일차원배열;

public class Ex03배열 {

	public static void main(String[] args) {
		
		int[] arr = {23,45,95,17,6,89,47,56,68,71};
		
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		
		System.out.println("최대값 : "+max);
		System.out.println("최솟값 : "+min);
		
		
		// {} scope(영역)
		// 지역변수 : 특정 구역에서만 사용할수 있도록 선언 및 초기화
		// 전역변수 : 전체 영역에서 사용가능한 변수
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
