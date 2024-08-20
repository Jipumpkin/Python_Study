package 책관리;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		
		BookData b1 = new BookData("Java", 21000, "홍길동");
		BookData b2 = new BookData("C++", 29000, "박문수");
		BookData b3 = new BookData("Database", 31000, "김장독");
		BookData b4 = new BookData("Android", 18000, "이순신");
		BookData b5 = new BookData("Web", 26000, "엄준식");

		BookData[] book = {b1,b2,b3,b4,b5};
		
		
		System.out.print("금액을 입력해라 : ");
		int money = sc.nextInt();
		System.out.println("[구매가능한 책 목록]");
		
		
		
		for(int i = 0; i<5; i++) {
			if(money >= book[i].getPrice()) {
				System.out.println("[ "+book[i].getTitle()+", "+book[i].getPrice()+", "+book[i].getWriter()+" ]");
			}
		}
		
		
		
		
		
		
		

	}

}
