package if_else문;

import java.util.Scanner;

public class Ex03else_if문 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("a과목의 맞힌 문재 갯수 : ");
		int a = sc.nextInt();
		System.out.print("b과목의 맞힌 문재 갯수 : ");
		int b = sc.nextInt();
		System.out.print("c과목의 맞힌 문재 갯수 : ");
		int c = sc.nextInt();
		System.out.print("d과목의 맞힌 문재 갯수 : ");
		int d = sc.nextInt();
		System.out.print("e과목의 맞힌 문재 갯수 : ");
		int e = sc.nextInt();
		
		String result;
		
		
		if (a+b+c+d+e < 60) {
			result = "불합격";
		}else if (a<8) {
			result = "불합격";
		}else if (b<8) {
			result = "불합격";
		}else if (c<8) {
			result = "불합격";
		}else if (d<8) {
			result = "불합격";
		}else if (e<8) {
			result = "불합격";
		}else {
			result = "합격";
		}
		
		
		System.out.println("당신은 " + result + "이다.");
		

	}

}
