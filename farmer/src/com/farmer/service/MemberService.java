package com.farmer.service;

import java.sql.SQLException;

import com.farmer.dto.MemberVO;

public interface MemberService {
	MemberVO getMemberById(String member) throws SQLException;
	
	void regist(MemberVO member) throws SQLException;
	
	void modify(MemberVO member) throws SQLException;
	
	void remove(MemberVO member) throws SQLException;
}
