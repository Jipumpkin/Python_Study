package 일차원배열;

public class Ex01배열개념 {

	public static void main(String[] args) {
		
//		// 배열의 필요성
//		String b1 = "양준영";
//		String b2 = "방상제";
//		String b3 = "김지호";
//		String b4 = "김창민";
//		String b5 = "조자연";
//		
//		// 5명의 학생 이름을 for문을 사용하면 출력할수 있지 않을까?
//		
//		// 변수를 만드는건 서로 다르 ㄴ공간이 5개가 생긴것 (흩어져있음)
//		// for문을 사용한 순차적인 접근은 불가능하게 만들어짐
//		
//		
//		// 이름을 관리하는 배열을 만들어주자
//		// 1) 배열을 생성하는 방법
//		// 자료형[] 배열명 = new 자료형[배열의 크기]
//		// 자료형 : 내가 배열에 저장하고 시은 데이터들의 타입
//		// [] --> 배열을 의미
//		// new --> 동적 메모리를 새롭게 할당 해주는 키워드
//		
//
//		
//	
//		// 배열을 생성할 떄는 뒤쪽에서반드시 크기를 정해줘야한다.
//		
//		String[] names = new String[5];
//		// - 배열은 인덱스 구조를 가지고 있다.
//		System.out.println(names);
//		// names : 래퍼런스형 변수(주소값을 참조하는 변수)
//		
//		// 기본 데이터타입이 저장되는 방법 (boolean, int, double, char, , , ,)
//		// 래퍼런스형 데이터 타입이 저장되는 방법 (String, 배열)
//		
//		names[1] = b1;
//		names[2] = b1;
//		names[3] = b3;
//		names[4] = b4;
//		names[0] = b5;
//		// ArrayIndexOutofBoundException : 예외상황
//		// - 실행을 시켜야 알 수 있는 에러
//		// - 인덱스 값이 초과 / 없는 인덱스 값에 접근
//		// index 기본적으로 0부터 시작한다
//		// names가 가질 수 있는 인덱스 값은 0~4
//		
//		// 인덱스를 변수로 사용/for문을 사용해서 names배열에 
//		// 저장되어있는 이름 5개를 출력해보자
//		
//		System.out.println(names[0]);
//		System.out.println(names[1]);
//		System.out.println(names[2]);
//		System.out.println(names[3]);
//		System.out.println(names[4]);
//  				
//		for(int i = 0; i<5; i++) {
//			System.out.println(names[i]);
//		}
//		
//		// 학생수가 증가하면?
//		// names[5] = "한재옥";
//		// 앞에서 배열을 생성 할 때 정해놓은 크기를 뒤에서 바꿀 수 없다.
//		
//		
//		//+배열의 크기를 가져와주는 기능
//		System.out.println(names.length);
//		
//		for(int i = 0; i<names.length; i++) {
//			System.out.println(names[i]);
//		}
		
		
		
		// 실습) 배열을 임의의 값 8개로 초기화를 해보자
		// 7,11,20,30,5,45,17,9
		int[] ary = new int[8];
		
		ary[0] = 7;
		ary[1] = 11;
		ary[2] = 20;
		ary[3] = 30;
		ary[4] = 5;
		ary[5] = 45;
		ary[6] = 17;
		ary[7] = 9;
		
		// - 배열 안에서 홀수만 출력해보자
		//7 11 5 45 17 9
		
		for(int i = 0; i<ary.length; i++) {
			if(ary[i]%2==1) {
				System.out.print(ary[i]+" ");
			}
		}
		
		
		// - 배열 안에 짝수의 개수를 출력해보자
		//짝수의 개수 : 2개
		System.out.println();
		
		int count = 0;
		for(int i = 0; i<ary.length; i++) {
			
			if(ary[i]%2==0) {
				count++;
			}
			
		}
		System.out.print("짝수의 개수 : "+count+"개");
		
		
		// - 배열 안에 숫자들 중 가장 큰 값을 출력해보자
		//최대값 : 45
		
		System.out.println();
		
		int maxint = ary[0];
		//배열이 음수들이면 0이 최대값이 되기에 배열 안의 숫자들로만 비교되게 하기위해
		//배열 안의 임의의 수로 초기화함
		
		
		for(int i = 0; i<ary.length; i++) {
			if(ary[i]>maxint) {
				maxint = ary[i];
			}
		}
		System.out.println("최댓값 : "+maxint);
		
		
		
		
		
		
		
		
		
		

	}

}
