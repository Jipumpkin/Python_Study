package while문;

import java.util.Scanner;

public class Ex05예제 {

	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
//        int sum = 0;
//        int sum2 = 0;
//
//        while (true) {
//            System.out.print("숫자 입력 : ");
//            
//            int num = sc.nextInt();
//
//            if (num%2==1) {
//                sum++;
//                System.out.println("홀수 개수 : "+sum+"개");
//                System.out.println("짝수 개수 : "+sum2+"개");
//            }else if(num%2==0) {
//                sum2++;
//                System.out.println("홀수 개수 : "+sum+"개");
//                System.out.println("짝수 개수 : "+sum2+"개");
//            }else if(num==-1) {
//            	System.out.println("종료");
//            	break;
//            }
//        }
        
        
        int sum3 = 0;
        int sum4 = 0;
        
        
        do {
        	System.out.print("숫자 입력 : ");
        	int num3 = sc.nextInt();
        	
        	if(num3%2==1) {
        		sum3++;
        		
        	}else if(num3==-1) {
        		System.out.println("종료");
        		break;
        	}else {
        		sum4++;
        	}
        	
        	System.out.println("홀수 개수 : "+sum3+"개");
            System.out.println("짝수 개수 : "+sum4+"개");
        	
        	
        }while(true);
        
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
