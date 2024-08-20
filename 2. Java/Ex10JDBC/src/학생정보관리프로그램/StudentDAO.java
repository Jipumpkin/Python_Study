package 학생정보관리프로그램;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentDAO {
	PreparedStatement psmt = null;
	Connection conn = null;
	int cnt = 0;
	ResultSet rs = null;
	// DAO : database access object
	
	// 데이터베이스 연결하는 기능 - dbopen()
	
	public void dbOpen() {
		// 1. 동적로딩
		// 2. 연결권한
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        String id = "hr";
	        String pw = "12345";
	        String url = "jdbc:oracle:thin:@localhost:1521:xe";
	        
	        conn = DriverManager.getConnection(url, id, pw);
	        
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
	
	
	
	
	public void dbclose() {
		try {
            if(psmt != null)
               psmt.close();
            if(conn != null)
               conn.close();
            if(rs != null)
               rs.close();
            // rs는 사용된적이 없으면 반납하지 않도록
            // insert, update, delete메서드에서 실행시켜도 반납 x
            
         } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("자원 반납 오류");
         }
	}
	
	
	
	
	
	// dto를 데이터베이스에 저장하는 학생등록기능
	public int insert(StudentDTO dto) {
		
		// 사용자가 입력했었던
		// name, age, gender, major - dto에 들어있는 상태
		
		
		// jdbc코드
		
		// 1.동적로딩
		try {
//			Class.forName("oracle.jdbc.driver.OracleDriver");
//	        String id = "hr";
//	        String pw = "12345";
//	        String url = "jdbc:oracle:thin:@localhost:1521:xe";
//	        
//	        conn = DriverManager.getConnection(url, id, pw);
			
			dbOpen();
	        
	        String sql = "insert into student values(?,?,?,?)";
	        psmt = conn.prepareStatement(sql);
	        // - ? 인자 채워주는 작업
	        psmt.setString(1, dto.getName());
	        psmt.setInt(2, dto.getAge());
	        psmt.setString(3, dto.getGender());
	        psmt.setString(4, dto.getMajor());
	        
	        cnt = psmt.executeUpdate();
	        // cnt가 데이터베이스와 연결하고 나서 받아온 결과값
	        // cnt를 View한테 어떤 값인지를 알려줘야함.
			
	
		} catch (SQLException e) {
			e.printStackTrace();
			
		} finally {
	         dbclose();
		}
		
		
		
		return cnt;
		// 2.연결 권한 확인
		// 3.쿼리문 준비
		// 4.쿼리문 psmt 넣기
		// 5.쿼리문 실행 및 결과값 처리
		// 6.자원반납
     	}
	
	
	
	public int update(StudentDTO dto) {
		
		try {
			
			dbOpen();
			String sql = "UPDATE STUDENT SET MAJOR = ? WHERE NAME = ? AND AGE = ?";
	        psmt = conn.prepareStatement(sql);
	        
	        psmt.setString(1, dto.getMajor());
	        psmt.setString(2, dto.getName());
	        psmt.setInt(3, dto.getAge());
	        
	        cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql 문법 오류");
			
		} finally {
			dbclose();
		}
		
		return cnt;
	}
	
	
	
	
	public int delete(StudentDTO dto) {
		
		try {
			
			dbOpen();
			String sql = "DELETE FROM STUDENT WHERE NAME = ? AND AGE =? "; 
	        
			
			psmt = conn.prepareStatement(sql);
			
	        psmt.setString(1, dto.getName());
	        psmt.setInt(2, dto.getAge());
	        
	        
	      
	        
	        cnt = psmt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql 문법 오류");
			
		} finally {
			dbclose();
		}
		return cnt;
	}
	
	public void select() {
		
		try {
			
			dbOpen();
	        String sql = "select * from student";
	        
	        psmt = conn.prepareStatement(sql);
	        rs = psmt.executeQuery();
	        
	        while(rs.next()) {
	        	
	        	String name = rs.getString("name");
	        	int age = rs.getInt("age");
	        	String gender = rs.getString("gender");
	        	String major = rs.getString("major");
	        	
	        	System.out.println(name + age + gender + major);
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql 문법 오류");
			
		} finally {
			dbclose();
		}
	}
	
	public void serch(StudentDTO dto) {
		
		try {
			
			dbOpen();
	        String sql = "select * from student where name = ?";
	        psmt = conn.prepareStatement(sql);
	        
	        psmt.setString(1, dto.getName());
	        rs = psmt.executeQuery();
	        
	        while(rs.next()) {
	        	
	        	String name = rs.getString("name");
	        	int age = rs.getInt("age");
	        	String gender = rs.getString("gender");
	        	String major = rs.getString("major");
	        	
	        	System.out.println(name + age + gender + major);
	        }
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("sql 문법 오류");
			
		} finally {
			dbclose();
		}
	}
		
		
		
		
		
		
		
		
	
}
