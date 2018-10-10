package kr.or.ddit.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserService;
import kr.or.ddit.user.service.UserServiceInf;

public class LoginServlet extends HttpServlet{
	
	//service  --> request.getMethod() : "POST", "GET" --> doGet, doPost
	
	private String USER_ID;
	private String PASSWORD;
	private UserServiceInf userService;
	private UserVo userVo;
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		//1. 사용자 아이디와 비밀번호를 request객체에서 받아옴
		//2. db 에서 조회해온 아이디, 비밀번호를 체크
		//3-1. 일치할 경우 main.jsp로 이동
		//3-2. 불일치할경오 login.jsp로 이동.
		
		//1
		String userId = req.getParameter("userId");
		String password = req.getParameter("password");
		
		// 2 DB대신 상수로 대체 → DB로 대체
		
		// 1. 사용자가 전송한 userId 파라미터로 사용자 정보조회
		// 2. DB에서 조회한 사용자 비밀번호가 파라미터로 전송된 비밀번호와 동일한지 비교
		// 3. session에 사용자 정보등록(as-is : 임의의 userVo 등록 / to-be : DB에서 조회한 userVo)
		// 4. pom.xml 에서 oracle dependency scope 삭제
		userService = new UserService();
		userVo = userService.selectUser(userId);
		
		
		//2 DB대신 상수로 대체함..
		//3-1
		if(userVo != null && userVo.getPass().equals(password)){
			
			//redirect방식
//			resp.sendRedirect("main.jsp?userId="+userId+"&password="+password);
			
			//1.Session에 사용자 정보 설정
//			kr.or.ddit.user.model.UserVo userVo = new kr.or.ddit.user.model.UserVo();
//			userVo.setUserId(userId);
//			userVo.setName("잉위 맘스턴");
//			userVo.setBirth(new Date());
			
			// req.getSession();
			
			//2.main.jsp body영역에 이름[별명]님 안녕하세요 출력
			HttpSession session = req.getSession();
			session.setAttribute("userVo", userVo);
			
			
			
			//Request Dispatch 방식
			RequestDispatcher rd = req.getRequestDispatcher("main.jsp");
			rd.forward(req, resp);
			
		//3-2
		} else {
			
			resp.sendRedirect("login/login.jsp");
			
		}

		
		
		
	}
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		
		
		//로그인을 위한 POST에 있던 기존 코드
//		req.setCharacterEncoding("utf-8");
//		resp.setContentType("text/html; charset=utf-8");
//
//		PrintWriter pw =resp.getWriter();
//		
//		pw.println("<!DOCTYPE html>");
//		pw.println("	<html>");
//		pw.println("		<head>");
//		pw.println("			<meta charset=\"UTF-8\">");
//		pw.println("			<title>Insert title here</title>");
//		pw.println("		</head>");
//		pw.println("		<body>");
//		
//		//userId : brwon / sally
//		String[] userIds = req.getParameterValues("userId");
//		for(String userId : userIds)
//			pw.println("		userId : " + userId + "<br>");
//		pw.println("		password : " + req.getParameter("password") + "<br>");
//		pw.println("		</body>");
//		pw.println("	</html>");
		
	}
	
	
	
}







