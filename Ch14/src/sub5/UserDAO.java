package sub5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.mysql.cj.xdevapi.Result;

/**
 * DAO
 *  - Data Access Object
 *  - 데이터베이스 CRUD 처리 객체
 * 
 *
 */
public class UserDAO {
	
	//싱글톤 객체 만들기
	private static UserDAO instance = new UserDAO();
	//UserDAO 외부에서 활용
	public static UserDAO getInstance() {
		return instance;
	}
	//UserDAO 외부에서 사용x
	private UserDAO() {};
	
	//DB정보 (final 상수:한 번 초기화된 값으로 고정, 대문자사용)
	private final String HOST = "jdbc:mysql://localhost:3306/userdb";
	private final String USER = "root";
	private final String PASS = "1234";
	
	//1,2단계 반복:객체 생성
	private Connection getConnection () throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		return DriverManager.getConnection(HOST, USER, PASS);
	}
	
	//close 메서드를 위한 객체
	private Connection conn;
	private Statement stmt;
	private PreparedStatement psmt;
	private ResultSet rs;

	
	public void insertUser(UserVO vo) {
		try {
			conn = getConnection();
			String sql = "";
			psmt = conn.prepareStatement(SQL.INSERT_USER);
			psmt.setString(1, vo.getUid());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setInt(4, vo.getAge());
			
			psmt.executeUpdate();
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	
	public UserVO selectUser(String uid) {
		
		UserVO vo = new UserVO();
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_USER);
			psmt.setString(1, uid);
			rs = psmt.executeQuery();
			//uid값 primary키(중복없음) 1개 또는 없음 -> if
			if(rs.next()) {
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
			}
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return vo;
	}
	
	
	public List<UserVO> selectUsers() {
		
		List<UserVO> users = new ArrayList<>();
		
		try {
			Connection conn = getConnection();
			Statement stmt = conn.createStatement();
			stmt.executeQuery(SQL.SELECT_USERS);
			ResultSet rs = stmt.executeQuery(SQL.SELECT_USERS);
			
			while(rs.next()) {
				
				UserVO vo = new UserVO();
				vo.setUid(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAge(rs.getInt(4));
				
				users.add(vo);
			}
			
			close();
			
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return users;
		
	}
	
	public int updateUser(UserVO vo) {
		int result = 0;
		
		try {
			
			conn = getConnection ();
			psmt = conn.prepareStatement(SQL.UPDATE_USER);
			psmt.setString(1, vo.getName());
			psmt.setString(2, vo.getHp());
			psmt.setInt(3, vo.getAge());
			psmt.setString(4, vo.getUid());
			
			result = psmt.executeUpdate();
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	public int deleteUser (String uid) {
		int result = 0;
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.DELETE_USER);
			psmt.setString(1, uid);
			
			result = psmt.executeUpdate();
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		 
		return result;
	}
	
	
	public void close() throws SQLException {
		if(rs != null) {
			rs.close();
		}
		if(stmt != null) {
			stmt.close();
		}
		if(psmt != null) {
			psmt.close();
		}
		if(conn != null) {
			conn.close();
		}
	}
	
	
}
