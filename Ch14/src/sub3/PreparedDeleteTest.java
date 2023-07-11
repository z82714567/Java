package sub3;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedDeleteTest {

	public static void main(String[] args) {
		
		//DB정보
		
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계
			String sql = "DELETE FROM `User2` WHERE `uid`=?";
			PreparedStatement psmt = conn.prepareStatement(sql);
			psmt.setString(1, "j101");
			//4단계
			psmt.executeUpdate();
			//5단계
			//6단계
			psmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Delete 완료...");
	}
}
