package switch문;

import java.util.Scanner;

public class Ex02switch문 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("1월~12월 중 숫자 하나를 입력하세요 >> ");
        int month = sc.nextInt();

        switch (month) {
            case 3:
            case 4:
            case 5:
                System.out.println("봄이다");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("여름이다");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("가을이다");
                break;
            case 12:
            case 1:
            case 2:
                System.out.println("겨울이다");
                break;
            
        }

        
    }
}
