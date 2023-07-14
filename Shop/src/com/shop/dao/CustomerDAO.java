package com.shop.dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;

import com.shop.db.DBHelper;
import com.shop.db.SQL;
import com.shop.vo.CustomerVO;

//DAO DB사용 정보 중복 (상속)
public class CustomerDAO extends DBHelper {

	//싱글톤
	private static CustomerDAO instance = new CustomerDAO();
	public static CustomerDAO getInstance() {
		return instance;
	} 
	
	private CustomerDAO() {}
	
	//기본 CRUD 메서드
	public int insertCustomer(CustomerVO vo) {
		
		int result = 0;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.INSERT_CUSTOMER);
			psmt.setString(1, vo.getCustId());
			psmt.setString(2, vo.getName());
			psmt.setString(3, vo.getHp());
			psmt.setString(4, vo.getAddr());
			
			//1:insert, 0:실패(custId중복될 때-프라이머리키)
			result = psmt.executeUpdate();
			
			close();
			
		}catch (SQLIntegrityConstraintViolationException e) {
			System.out.println("이미 사용 중인 아이디입니다.");
		}catch (ClassNotFoundException e) {
			System.out.println("이미 사용 중인 아이디입니다.");
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public CustomerVO selectCustomer(String custId) {
		//선언
		CustomerVO vo = null;
		
		try {
			conn = getConnection();
			psmt = conn.prepareStatement(SQL.SELECT_CUSTOMER);
			psmt.setString(1, custId);
			
			rs =psmt.executeQuery();
			
			if(rs.next()) {
				//생성
				vo = new CustomerVO();
				vo.setCustId(rs.getString(1));
				vo.setName(rs.getString(2));
				vo.setHp(rs.getString(3));
				vo.setAddr(rs.getString(4));
				vo.setRdate(rs.getString(5));
			}
			
			close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		return vo;
	}
	
	public List<CustomerVO> selectCustomers() {
		return null;
	}
	
	public int updateCustomer(CustomerVO vo) {
		return 0;
	}
	
	public int deleteCustomer(String custId) {
		return 0;
	}
	
	
		
	}

