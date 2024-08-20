import java.util.Scanner;

public class Ex00자판기프로그램 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		

		
		System.out.println("돈을 넣으세요");
		
		int money = sc.nextInt();
		
		if (money > 10000) {
			System.out.println("만원권 이하만 투입가능합nida");
		}else {
			System.out.println("아래 메뉴중 고르세요");
			System.out.println("1.아우터(700원) 2.이구동성(1000원) 3.에그몽(500원) >>");
			
			
			int menu = sc.nextInt();
			
			
			if (menu < 1||menu > 3) {
				System.out.println("없는 메뉴입니다");
			}
			
			
			int price = 0;
			
			
			if (menu == 1) {
				price = 700;
			}else if (menu == 2) {
				price = 1000;
			}else if (menu == 3) {
				price = 500;
			}
			
			
			int 잔돈;
			
			if (money < price) {
				System.out.println("돈이 모잘라요");
				잔돈 = money;
			}else {
				잔돈 = money - price;
				System.out.println("잔돈 : "+ 잔돈 + "원");
			}
			
			
			int 만원 = 잔돈/10000;
			int 천원 = 잔돈/1000;
			int 오백원 = (잔돈%1000)/500;
			int 백원 = (잔돈%1000)%500;
			
			
			if (만원 == 1) {
				System.out.println("만원 : 1장");
			}else {
				System.out.println("천원 : " + 천원 + "장, "+"오백원 : "
						+ 오백원 + "개, " + "백원 : "+ 백원 + "개");
			}
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
