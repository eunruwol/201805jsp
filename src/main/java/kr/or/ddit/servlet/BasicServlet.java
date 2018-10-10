package kr.or.ddit.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * 
* BasicServlet.java
*
* @author pc17
* @version 1.0
* @see
*
* <pre>
* << 개정이력(Modification Information) >>
*
* 수정자 수정내용
* ------ ------------------------
* pc17 최초 생성
* 현재 시간을 출력하는 html 생성하는 서블릿
* </pre>
 */
public class BasicServlet extends HttpServlet{
	
	//요청 http 메소드에 따라 실행되는 메소드가 달라진다
	//get 방식 : doGet
	//post 방식 :  doPost
	
	@Override
	public void init() throws ServletException {
		System.out.println("init");
	}
	
	@Override
	public void destroy() {
		System.out.println("destroy");
	}
	///
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		//HttpServletRequest 요청에 대한 정보
		//HttpServeletResponse : 응답에대한 정보
	
		resp.setContentType("text/html; charset=utf-8");
		
		Date date = new Date();
		SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		PrintWriter pw = resp.getWriter();
		pw.println("<!DOCTYPE html>");
		pw.println("<html>");
		pw.println("	<head> ");
		pw.println("		<meta charset=\"UTF-8\"> ");
		pw.println("		<title>index</title> ");
		pw.println("	</head> ");
		pw.println("	<body id = \"body\"> ");
		pw.println("		hello, world");
		pw.println("		<br>" + simple.format(date));
		pw.println("	</body> ");
		pw.println("</html> ");
		
		
		

		
		
		
		
	}
}

//정적 자료 : index.html -> url
//도엊ㄱ 자료 : servlet -> url mapping 구성이 필요하다 : web.xml에서 매핑가능