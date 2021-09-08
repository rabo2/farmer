package com.farmer.service;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSessionFactory;

import com.farmer.dao.MemberDAO;
import com.farmer.dto.MemberVO;

public class MemberServiceImpl implements MemberService{
	private MemberDAO memberDAO;
	private SqlSessionFactory sqlSessionFactory;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public MemberVO getMemberById(String member) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void regist(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modify(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remove(MemberVO member) throws SQLException {
		// TODO Auto-generated method stub
		
	}

}
