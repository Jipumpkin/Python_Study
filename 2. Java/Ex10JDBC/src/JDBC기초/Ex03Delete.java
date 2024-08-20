package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex03Delete {

   public static void main(String[] args) {

      // Scanner를 사용해서 이름과 나이를 입력받아 행을 삭제해보자
      Scanner sc = new Scanner(System.in);
      Connection con = null;
      PreparedStatement psmt = null;
      // 나중에 자원반납을 finally구문 안쪽에서 진행하려면 전역변수
      
      System.out.print("삭제할 학생의 이름을 입력하세요 >> ");
      String name = sc.next();
      System.out.print("나이를 입력하세요 >> ");
      int age = sc.nextInt();
      
      // 위에서 입력받은 두 개의 데이터 캡슐화 진행하지
      /// Student 클래스를 사용해서 하나의 묶음으로 관리하기
      // 2개를 초기화 시키는 생성자를 만들자
      
      Student stu = new Student(name, age);
      // JDBC 코드 작성하기 - DELETE STUDENT ...
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         
         String id = "hr";
         String pw = "12345";
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         
         con = DriverManager.getConnection(url, id, pw);
         
         String sql = "DELETE FROM STUDENT WHERE NAME = ? AND AGE =? "; 
         
         psmt = con.prepareStatement(sql);
         // - ?
         psmt.setString(1, stu.getName());
         psmt.setInt(2, stu.getAge());
         
         int cnt = psmt.executeUpdate();
         // cnt : 테이블에 영향을 받은 행이 있는지 없는지에 대해 int 자료형의 결과값
         
         if(cnt > 0) {
            System.out.println("데이터 삭제 성공");
         }else {
            System.out.println("데이터 삭제 실패");
         }
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("동적 로딩 실패");
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 실패");
      }finally {
         
         // - 사용한 역순으로 close
         try {
            if(psmt != null)
               psmt.close();
            if(con != null)
               con.close();
         } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("자원 반납 오류");
         }
         
         
         
      }
      
      
      
      
      
      
      
      
      
   }

}
