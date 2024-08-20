package 메서드;

import java.util.Random;

public class Ex08완전수구하기 {

	public static void main(String[] args) {
		
		
		//메서드 문제는 모두 여기에
		
		int num1 = 10;
		
		int num2 = 2;
		
		boolean divisor = isdivisor(num1, num2);
		
		System.out.println(divisor);
		
		System.out.println();
		// 2)
		
		getdivisor(10);
		getdivisor(16);
		getdivisor(24);
		
		System.out.println();
		// 3)
		
		int num = 10;
		int result = getsumofdivisors(num);
		
		System.out.println(num+"의 약수의 합 : "+result);
		getdivisor(10);		
		
		
		// 완전수란
		// 나를 제외한 약수들의 합이 나와 같은 것
		
		
		System.out.println();
		// 4) isperfectnumber()
		
		int num3 = 28;
		boolean result2 = isperfectnumber(num3);
		System.out.println(num3+"의 완전수 여부 : "+result2);
		
		
		
		System.out.println();
		// 5) getperfectnumber()
		
		int start = 2;
		int end = 1000;
		getperfectnumber(start, end);
		
		
		
		
		
		
	}
	// 1) isdivisor() : 약수인지 아닌지 확인해주는 메서드
	
	public static boolean isdivisor(int a, int b) {
//		if(a%b==0) {
//			return true;
//		}else {
//			return false;
//		}
		
		return a % b == 0 ? true:false; //삼항연산자 활용
			
	}
	
	
	
	// 2) getdivisor()
	
	public static void getdivisor(int a) {
		
		System.out.print(a+"의 약수 : ");
		for(int i = 1; i<a+1; i++) {
			
			if(isdivisor(a,i)) {
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		
	}
	
	// 3) getsumofdivisors()
	
	
	public static int getsumofdivisors(int a) {
		int sumdiv = 0;
		for(int i = 1; i<a+1; i++) {
			
			if(isdivisor(a,i)) {
				sumdiv += i;
			}
			
		}
		return sumdiv;
	}
	
	
	// 4) isperfectnumber()
	
	public static boolean isperfectnumber(int a) {
		if(getsumofdivisors(a)-a == a) {
			return true;
		}else {
			return false;
		}
	}
	
	// 5) getperfectnumber()
	
	public static void getperfectnumber(int a, int b) {
		
		Random rd = new Random();
		int result = 0;
		while(true) {
			int pernum = rd.nextInt(b)+1+a;
			if(isperfectnumber(pernum)) {
				result = pernum;
				break;
			}
		
		}
		System.out.println(result);
		
	}
	
	
	
	

}
