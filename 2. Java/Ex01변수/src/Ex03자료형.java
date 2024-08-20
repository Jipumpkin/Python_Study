
public class Ex03자료형 {

	public static void main(String[] args) {
		// 1. 논리형
		// boolean : 1byte(8bit - 2^8)
		// true false 값만 저장할수 있는 자료형
		// 위를 제외한 다른 값을 넣으면 type mismatch error 발생
		
		boolean isHot = true;
		System.out.println(isHot);
		
		// 2. 문자형
		// 1) char : 2byte
		// 문자 한개를 저장 할 수 있는 자료형
		// ''(작은따옴표)로 감싸줘야 한다.
		// 유니코드 문자도 저장 할 수 있다.
		
		char firstName = '조';
		
		// 3. 정수형
		// 1) byte : 1byte
		byte num1 = 127;
		// -128 ~ 127 범위의 숫자만 저장 가능
		// 벗어나면 타입 미스매치 에러 발생
		// 1byte  - 8bit - 2^8 - 256

		// 2) short : 2byte(16bit)
		short num2 = 128;
		
		// 3) int : 4byte - 정수형 데이터 타입 중 기본으로 사용됨
		// -21억 ~ 21억
		int num3 = 200;
		
		//long : 8byte
		//생략
		
		
		// 기본 데이터 타입을 선언하는것은 메모리 공간을 차지하게됨
		// long을 선언하는 순간 8byte 의 메모리를 차지하게됨
		// byte short는 너무 작고,  long은 매우 크기때문에
		// 적절한 int를 사용함.
		// 메모리를 효율적으로 사용하기 위함
		
		// 4. 실수형 : 소수점이 붙은 숫자들
		// 1) float : 4byte 
		// 2) double : 8byte 
		// 소수점이 붙은 숫자는 일단 double 로 만들어짐
		double pi1 = 3.141592;
		
		
		
		
		// * 형변환 (cast / casting) - convert...
		
		// 1) 강제현변환(명시적 형변환)
		float pi2 = (float) 3.141592;
		// float pi2 = 3.141592f; 도 가능
		// 손실값이 발생할 수 있기때문에 형변환을 명시함으로써 그를 알리기 위함
		
		
		// 2) 자동형변환(묵시적 형변환)
		double pi3 = pi2; // pi2 = float
		// 작은 자료형의 값을 큰 자료형에 담기때문에 자동으로 변환됨
		
		
		
		// char에 문자 한개도 담을 수 있고, 유니코드도 가능
		// 97이라는 십진수 (숫자,정수형) --> a
		
		int num = 97;
		
		//char자료향으로 형변환 해서 출력했을때 a라는 문자 한개가
		// console에 보이는지 확인 (ch라는 변수명)
		char ch = (char)num;
		System.out.println(ch); //a
		
		// 만약에 문자 여러개를 저장하고 싶다면?
		// 래퍼런스형 데이터 타입
		// String : 문자열을 저장할 수 있는 데이터 타입. (대문자 유의)
		
		// 나의 이름을 저장 할 수 있는 name이라는 변수를 만들어보자
		
		String name = "조자연";
		// 큰 따옴표""를 사용해서 데이터를 감싸 대입해야 한다.
		
		System.out.println(name);
		
		//주소값 : 데이터가 저장되어있는 장소
		//주소값을 Reference : 참조 하는 데이터 타입

		
		
		
		
		
	}

}
