package kr.or.ddit.user.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.or.ddit.user.model.UserVo;
import kr.or.ddit.user.service.UserService;
import kr.or.ddit.user.service.UserServiceInf;

@WebServlet("/userAllList")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 전체 사용자 정보 조회 : 파라미터 필요 없음
		
		// 1. 객체 생성
		UserServiceInf userService = new UserService();
		
		// 2. 호출 (리턴타입 List<UserVo>)
		List<UserVo> userList = userService.selectUserAll();
		
		// 3. 조회된 사용자 정보를 userAllList.jsp를 통해 화면 처리
		// userAllList.jsp에서 userList를 참조하려면????
		// attribute
		
		// session 특징 : 해당 사용자만 접근이 가능 (사용자 전용 공간)
		// → 자주 참조하는 데이터, 너무 많은 데이터를 저장할 경우 OOM(과부하) 유발 가능성
		
		// application 특징 : 모든 사용자가 접근 가능 (서버당 하나만 생성)
		// → 일반적으로 설정과 관련된 값을 저장
		
		// request 특징 : 해당 요청의 응답이 끝날때 까지
		request.setAttribute("userList", userList);
		
		// 4. 화면으로 위임
		// dispatch : 조회만 했을 때 (보통/일반적으로 사용)
		// sendRedirect : 서버에 데이터가 변경되었을 때 F5키를 누르면 조회에 대한 요청이 반복적으로 됨
		RequestDispatcher rd = request.getRequestDispatcher("/user/userAllList.jsp");
		rd.forward(request, response);
	}
}