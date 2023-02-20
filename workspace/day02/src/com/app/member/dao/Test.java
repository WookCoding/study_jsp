package com.app.member.dao;

import com.app.member.domain.MemberVO;

public class Test {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		MemberDAO memberDAO = new MemberDAO();
		
//		memberVO.setMemberBirth("2011-01-01");
//		memberVO.setMemberIdentification("ljw1235");
//		memberVO.setMemberName("임욱");
//		memberVO.setMemberPassword("ljw1235");

//		memberDAO.join(memberVO);
		
//		System.out.println(memberDAO.checkId("ljw1234"));
		
		
//		System.out.println(memberDAO.login("ljw1234", "ljw1234"));
		
//		memberDAO.selectAll().stream().forEach(data -> System.out.println(data.getMemberName()));
	
		memberVO.setMemberId(memberDAO.login("ljw1234", "ljw1234"));
		memberVO.setMemberName("임종욱");
		
		memberDAO.update(memberVO);
		
	}
}
