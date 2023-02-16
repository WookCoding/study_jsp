package com.example.app.member;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.example.app.Action;
import com.example.app.Result;
import com.example.app.dao.MemberDAO;

public class MemberLoginActionController implements Action{
	@Override
	public Result execute(HttpServletRequest req, HttpServletResponse resp) throws ServerException, IOException {
		MemberDAO memberDAO = new MemberDAO();
		HttpSession session = req.getSession();
		Result result = new Result();
		String path = null;
		Long memberId = null;
		
		memberId = memberDAO.login(req.getParameter("MemberIdentification"), req.getParameter("MemberPassword"));
		
		if(memberId != null) {
			path = "/index.main";
			session.setAttribute("memberId", memberId);
		}else {
			path = "/login.member?login=false";
		}
		
		result.setPath(req.getContextPath() + path);
		result.setRedirect(true);
		
		return result;
	}
}
