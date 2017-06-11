package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InitParamServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dirPath=getInitParameter("dirPath");
		String userid=getInitParameter("userid");
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=resp.getWriter();
		
		out.print("<html><body>");
		out.print("���͸� ��� : "+dirPath+"<br/>");
		out.print("���̵� �� : "+userid+"<br/>");
		out.print("</body></html");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	

}
