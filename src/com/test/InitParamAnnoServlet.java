package com.test;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name="InitParamAnnoServlet",urlPatterns={"/initParamAnno"},initParams={@WebInitParam(name="dirPath",value="d:\\test"),@WebInitParam(name="userid",value="system")})
public class InitParamAnnoServlet  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String dirPath=getInitParameter("dirPath");
		String userid=getInitParameter("userid");
		
		resp.setContentType("text/html;charset=EUC-KR");
		PrintWriter out=resp.getWriter();
		
		out.print("<html><body>");
		out.print("디렉터리 경로 : "+dirPath+"<br/>");
		out.print("아이디 값 : "+userid+"<br/>");
		out.print("</body></html");
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req,resp);
	}
	
	

}
