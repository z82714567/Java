package sub2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 * 날짜 : 2023/07/10
 * 이름 : 노수현
 * 내용 : Insert 실습하기
 */
public class InsertTest {

	public static void main(String[] args) {
		
		//DB정보
		String host = "jdbc:mysql://127.0.0.1:3306/userdb";
		String user = "root";
		String pass = "1234";
		
		try {
			//1단계 - JDBC 드라이버 로드
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2단계 - 데이터베이스 접속(연결)
			Connection conn = DriverManager.getConnection(host, user, pass);
			//3단계 - SQL실행 객체 생성
			Statement stmt = conn.createStatement();
			//4단계 - SQL실행(쿼리문 세미콜론 생략 가능, 쿼리문 작성처럼 똑같이 띄어쓰기도)
			String sql = "INSERT INTO `User1` VALUES ('J101','김유신','010-1234-1001', 23);";
			stmt.executeUpdate(sql);
			//5단계 - 결과처리(SELECT문일 경우만 해당 INSERT,UPDATE,DELETE생략)
			
			//6단계 - 연결해제
			stmt.close();
			conn.close();
			
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("Insert 완료...");
		
		
	}
}
