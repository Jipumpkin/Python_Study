package while문;

import java.util.Scanner;

public class Ex03while문 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("숫자 입력 : ");
            int num = sc.nextInt();

            if (num == -1) {
                System.out.println("종료");
                break;
            } else {
                sum += num;
                System.out.println("누적결과: " + sum);
            }
        }
        
        
    }
}
