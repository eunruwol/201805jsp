package request;

import java.io.IOException;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/requestServlet")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//파라미터를 받아올 수 있다
		request.setCharacterEncoding("UTF-8"); 
		String userId = request.getParameter("userId");
		String name = request.getParameter("name");
		
		//request 정보에 값을 저장
		kr.or.ddit.user.model.UserVo userVo = getUser(userId);
//		request.setAttribute("userVo", userVo);
		
		
		
		//dispatch forward -> request/requestResult.jsp
//		RequestDispatcher rd = request.getRequestDispatcher("request/requestResult.jsp");
//		rd.forward(request, response);
		
		//redirect
		HttpSession session = request.getSession();
		session.setAttribute("userVo", userVo);
		response.sendRedirect("request/requestResult.jsp");
		
		
		
	}
	
	public kr.or.ddit.user.model.UserVo getUser(String userId){
		//userId 매개변수를 이용 사용자 정보를 db에서 조회
		kr.or.ddit.user.model.UserVo userVo = new kr.or.ddit.user.model.UserVo();
		userVo.setUserId(userId);
		userVo.setName("잉위 맘스턴");
		userVo.setBirth(new Date());
		
		return userVo;
		
	}
	
	

}
