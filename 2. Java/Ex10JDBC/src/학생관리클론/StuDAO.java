package 학생관리클론;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class StuDAO {
	PreparedStatement psmt = null;
	Connection conec = null;
	int cnt = 0;
	ResultSet rs = null;
	
	public void dbOpen() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
	        String id = "hr";
	        String pw = "12345";
	        String url = "jdbc:oracle:thin:@localhost:1521:xe";
	        
	        conec = DriverManager.getConnection(url, id, pw);
	        
	        
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
			System.out.println("동적 로딩 실패");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("연결실패");
		}
	}
	
	
	
	
	public void dbClose() {
		try {
            if(psmt != null)
               psmt.close();
            if(conec != null)
               conec.close();
            if(rs != null)
               rs.close();

            
         } catch (SQLException e) {

            e.printStackTrace();
            System.out.println("자원 반납 오류");
         }
	}
	
	
	
	
	
	
	public void StuAdd(StuDTO dto) {
		
		try {
			dbOpen();
			
			String sql = "insert into student values(?,?,?,?)";
			
			psmt = conec.prepareStatement(sql);
			
			psmt.setString(1, dto.getName());
			psmt.setInt(2, dto.getAge());
			psmt.setString(3, dto.getGender());
			psmt.setString(4, dto.getMajor());
			
			
			
			
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("SQL 오류 발생");
		} finally {
			dbClose();
		}
		
	}
	
	public void StuList(StuDTO dto) {
		
	}
	
	public void StuSerch(StuDTO dto) {
		
	}
	
	public void StuUpdate(StuDTO dto) {
		
	}
	
	public void StuDel(StuDTO dto) {
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
