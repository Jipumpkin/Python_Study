package 일차원배열;

public class Ex02배열 {

	public static void main(String[] args) {
		
		// 배열을 임의의 값으로 초기화를 진행하되
		// 값은 3, 7, 18, 71, 9, 12, 24
		// 1차원 정수형 배열 - arr
		
		// 배열의 값 중 홀수 인 값이 몇개인지 출력하는 코드 작성
		
		
//		int[] arr = {3,7,18,71,9,12,24};
//		
//		int cnt = 0;
//		String 홀수 = "";
//		
//		for(int i = 0; i<arr.length; i++) {
//			if(arr[i]%2==1) {
//				cnt++;
//				홀수 = 홀수+arr[i]+" ";
//			}
//		}
//		System.out.println("array에 들어있는 홀수는 "+홀수+"이며, 총 "+cnt+"개 입니다.");
		


		
		
		
		int[] arr = {3,7,18,71,9,12,24};
		
		int cnt = 0;
		
		int[] arr2 = new int[arr.length];
		
		for(int i = 0; i<arr.length; i++) {
			if(arr[i]%2==1) {
				cnt++;
				arr2[i] = arr[i];
			}
		}
		System.out.print("array에 들어있는 홀수는 ");
		
		for(int i = 0; i < arr2.length; i++) {
			if(arr2[i]!=0) {
				System.out.print(arr2[i]+" ");
			}
		}
		
		
		
		System.out.println("이며, 총 "+cnt+"개 입니다.");
		
		
		
		
		
		
		
		
		

	}

}
