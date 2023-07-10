package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2023/07/10
 * 이름 : 노수현
 * 내용 : Delete 실습하기
 */
public class DeleteTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";

		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 - 데이터베이스 연결
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계 - Statement 생성
			Statement stmt = conn.createStatement();
			//4단계 - SQL문 전송
			String sql = "DELETE FROM `User1` WHERE `uid` = 'J101'";
			stmt.executeUpdate(sql);
			//5단계 - 결과받기
			//6단계 - 연결 해제
			stmt.close();
			conn.close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Delete 완료...");
	}
}
