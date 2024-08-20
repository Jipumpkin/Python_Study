package 일차원배열;

import java.util.Scanner;

public class Ex09로그인프로그램 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] id_array = new String[3];
        int[] pw_array = new int[3];

        int Rcount = 0;

        while (true) {
            System.out.print("[1]회원가입 [2]로그인 [3]종료 ");
            
            
            
            int sel = sc.nextInt();

            boolean logfal = true;

            if(sel == 3) {
                System.out.println("프로그램이 종료되었습니다");
                break;
            }else if (sel == 1) {
                System.out.println("==회원가입==");

                if(Rcount == 3) {
                    System.out.println("더이상 가입할수 없습니다.");
                    continue;
                }

                System.out.print("회원가입 아이디 입력 : ");
                id_array[Rcount] = sc.next(); 
                System.out.print("회원가입 비밀번호 입력 : ");
                pw_array[Rcount] = sc.nextInt();

                System.out.println("회원가입 완료");
                Rcount++;

            }else if (sel == 2) {
                System.out.println("==로그인==");

                System.out.print("아이디 입력 : ");
                String logid = sc.next(); 
                System.out.print("비밀번호 입력 : ");
                int logpw = sc.nextInt();

                for (int i = 0; i < 3; i++) {
                    if (id_array[i] != null && id_array[i].equals(logid) && pw_array[i] == logpw) {
                        System.out.println("로그인 성공");
                        logfal = false;
                        break;
                    
                }
            }
            

            if(logfal) {
            	System.out.println("로그인 실패. 다시 시도합니다.");
            }
            
            
        }
        
        
        
        
        
        
        // 사용자 첫 입력시 문자열을 입력했을떄 오류를 안띄우고 진행시키는 방법?
        
        
        
        
        
        
        
   
        }

    
   }
}
