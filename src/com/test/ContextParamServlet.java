package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ContextParam")
public class ContextParamServlet  extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String driver=getServletContext().getInitParameter("driver");
		String savePath=getServletContext().getInitParameter("savePath");
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=resp.getWriter();
		
		out.print("<html><body>");
		out.print("디렉터리 경로 : "+driver+"<br/>");
		out.print("아이디 값 : "+savePath+"<br/>");
		out.print("</body></html");
	}
	
	

}
