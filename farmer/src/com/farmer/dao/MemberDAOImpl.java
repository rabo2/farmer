package com.farmer.dao;

import java.sql.SQLException;

import org.apache.ibatis.session.SqlSession;

import com.farmer.dto.MemberVO;

public class MemberDAOImpl implements MemberDAO{

	@Override
	public MemberVO selectMemberById(SqlSession session, String memId) throws SQLException {
		MemberVO member = session.selectOne("Member-Mapper.selectMemberById", memId);
		return member;
	}

	@Override
	public void insertMember(SqlSession session, MemberVO member) throws SQLException {
		session.update("Member-Mapper.insertMember", member);
		
	}

	@Override
	public void deleteMember(SqlSession session, MemberVO member) throws SQLException {
		session.update("Member-Mapper.deleteMember", member);
	}

	@Override
	public void updateMember(SqlSession session, MemberVO member) throws SQLException {
		session.update("Member-Mapper.updateMember", member);
	}

}
