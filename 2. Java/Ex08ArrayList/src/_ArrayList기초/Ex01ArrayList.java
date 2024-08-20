package _ArrayList기초;

import java.util.ArrayList;

public class Ex01ArrayList {
	
	public static void main(String[] arg) {
		
		// 가변배열 : ArrayList
		// 데이터에 개수에 따라 크기가 늘어나거나 줄어들수 있는 배열
		
		// 1) 가변배열을 선언 및 생성
		ArrayList<String> list = new ArrayList<>();
		
		// 2) 데이터를 추가하는 기능
		// - add(String str)
		list.add("조자연");
		list.add("최영화");
		list.add("박병관");
		
		// -add(int index, /string str)
		list.add(1, "이도연"); // 이미있으면 원래 인덱스의 값들이 뒤로 밀림
		
		// 3) 데이터를 확인하는 방법(가져오는 방법)
		// - get(int index)
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		
		// get에 들어있는 index값은 변수로 사용 될 수 있다
		// 즉, 순차적인 접근이 가능하다.
		
		//list.size() -> ArrayList의 크기 값을 반환하는 메서드
		
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		// 4) 데이터를 삭제하는 기능
		// remove(int index) - 삭제하고싶은 데이터의 인덱스
		list.remove(0); // 삭제시 뒤에 있는 인덱스의 값들은 앞으로 당겨짐
		
		// 0이도연 1최영화 2박병관
		System.out.println(list.get(0));
		
		
		
		// 4) 모든데이터를 삭제하는 기능
		// - clear()
		list.clear();
		
		System.out.println(list.size());
		
		ArrayList<Integer> numbers = new ArrayList<>();
		// ArrayList는 레퍼런스형 데이터 타입만 저장할 수 있다.
		// int,char,boolean - 기본데이터타입
		
		// int - Integer
		// float - Float
		
		// <> - generic - Collection
		// 객체 자료형만 저장 할 수 있는 자료구조
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
