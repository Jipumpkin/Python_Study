package JDBC기초;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Ex02Update {

   public static void main(String[] args) {

      // Scanner를 사용해서 사용자한테 이름 나이를 입력받아서
      // 전공을 수정해보자
      Scanner sc = new Scanner(System.in);
      PreparedStatement psmt = null;
      Connection con = null;
      
      System.out.print("본인의 이름을 입력하세요 >> ");
      String name = sc.next();
      System.out.print("나이를 입력하세요 >> ");
      int age =  sc.nextInt();
      System.out.print("수정할 전공을 입력하세요 >> ");
      String major = sc.next();
      // Student 자료형을 사용해서 캡슐화를 진행해주시면 됩니다.
      // 생성자를 사용해서 필드 3개를 초기화 시켜주면 됩니다.
      Student stu = new Student(name, age, major);
      
      // JDBC 코드 - UPDATE STUDENT SET MAJOR = ? WHERE NAME = ? AND AGE = ?;
      
      
      // 1. 동적 로딩
      
      try {
         Class.forName("oracle.jdbc.driver.OracleDriver");
         // ojdbc11.jar에 있는 오라클 드라이버의 경로를 입력
         // 예외상황이 발생할 수 도 있는 코드는 try~catch문으로 감싸주자!
         
         // 2. 연결 권한 확인
         // - id, pw, url
         String id = "hr";
         String pw = "12345";
         String url = "jdbc:oracle:thin:@localhost:1521:xe";
         
         con = DriverManager.getConnection(url, id, pw);
         // DriverManager한테 id, pw, url 주면서 연결 권한 확인
         // - 연결 권한을 가지고 돌아온다
         // - con이라는 변수에 담아놓고 필요할 때 사용할 예정
         
         // 3. 쿼리문 준비하기
         String sql = "UPDATE STUDENT SET MAJOR = ? WHERE NAME = ? AND AGE = ?";
         
         /// 4. PreparedStatement에 쿼리문을 담아준다!
         psmt = con.prepareStatement(sql);
         // 연결권한을 사용해서 psmt에 쿼리문 담아주기!
         
         // + 채워줄 ? 인자가 있으면 채워주는 작업을 진행하자
         psmt.setString(1, stu.getMajor());
         psmt.setString(2, stu.getName());
         psmt.setInt(3, stu.getAge());
         
         int cnt = psmt.executeUpdate();
         // - 쿼리문을 데이터 베이스로 전송
         // - 데이터베이스에서 쿼리문을 실행
         // - 결과값도 받아오는 기능
         // 결과값 : 내가 만든 쿼리문으로 인해 영향을 받은 행이 있는지 없는지 int 자료형의 결과값
         // 1 : 영향을 받은 행이 있음 .. 쿼리문 실행에 성공
         // 0, -1 : 영향을 받은 행이 없음 .. 쿼리문 실행에 실패
         
         if(cnt > 0) {
            System.out.println("업데이트 성공");
         }else {
            System.out.println("업데이트 실패");
         }
         
      } catch (ClassNotFoundException e) {
         e.printStackTrace();
         System.out.println("동적 로딩 실패");
      } catch (SQLException e) {
         e.printStackTrace();
         System.out.println("연결 실패");
      }finally {
         
         // try ~ catch ~ finally
         // finally 안쪽에 작성되는 코드는 마지막에 무조건 한번은
         // 실행되는 코드가 들어온다!
         
         // 자원반납이 중간에 에러가 발생해도, try안에 있는 코드가
         // 다 실행 되더라도 마지막에 꼭 한번 실행될 수 있도록 
         
         // close();
         
         // - 내가 사용했던 자원을 역순으로 닫아줘야한다!
         // PreparedStatement ---> Connection
         
         try {
            // 사용된적이 있는 기능만 반납할 수 있도로 if문 추가
            if(psmt != null)
               psmt.close();
            if(con != null)
               con.close();
            // 실행코드가 1개면 중괄호 생략
         } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("자원 반납 오류");
         }
         // try문 안에만 사용할 수 있도록 선언 및 초기화를 진행 했기 때문
      }
      
      
      
      
      
      
      
      
      
      
      
   }

}
