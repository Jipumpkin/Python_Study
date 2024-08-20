package 일차원배열;

import java.util.Scanner;

public class Ex07배열 {

   public static void main(String[] args) {

      // 1) 입력하는 도구 가져오기
      Scanner sc = new Scanner(System.in);
      // 2) 별의 개수 5개를 저장할 수 있는 배열
      int[] stars = new int[5];
      
      for(int i = 0; i < stars.length; i++) {
         // i 0 1 2 3 4 (5번 반복)
         System.out.print(i+1+"번째 별의 개수를 입력 >> ");
         stars[i] = sc.nextInt();
      }
      
      // 3 3 4 2 1
      for(int j = 0; j < stars.length; j++) {
         System.out.print(stars[j]+" : ");
         for(int i = 1; i <= stars[j]; i++) {
            System.out.print("*");
         }System.out.println();
      }
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
      
   }

}
