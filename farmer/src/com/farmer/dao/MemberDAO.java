package com.farmer.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.farmer.dto.MemberVO;

public interface MemberDAO {
	
	MemberVO selectMemberById(SqlSession session, String memId) throws SQLException;
	
	void insertMember(SqlSession session, MemberVO member) throws SQLException;
	
	void deleteMember(SqlSession session, MemberVO member) throws SQLException;
	
	void updateMember(SqlSession session, MemberVO member) throws SQLException;
}
