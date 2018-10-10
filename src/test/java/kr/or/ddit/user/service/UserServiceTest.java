package kr.or.ddit.user.service;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.user.model.UserVo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class UserServiceTest {
	
	// JUnit 실행주기
	// @BeforeClass 어노테이션이 적용된 메소드 실행(최초 1회), 단 static 메소드로 선언
	// @Before 어노테이션이 적용된 메소드 실행(테스트 메소드 실행전 실행)
	// @Test
	// @After 어노테이션이 적용된 메소드 실행(테스트 메소드 실행후 실행)
	// @AfterClass 어노테이션이 적용된 메소드 실행(최초 1회), 단 static 메소드로 선언
	
	// beforeClass
	// before → selectUserAll → after
	// before → selectUser(String) → after
	// before → selectUser(UserVo) → after
	// afterClass
	
	private UserServiceInf userService;
	
	
	@BeforeClass
	public static void beforeClass() {
		System.out.println("beforeClass");
	}
	
	@AfterClass
	public static void afterClass(){
		System.out.println("afterClass");
	}
	
	@Before
	public void before(){
		System.out.println("before");
		userService = new UserService();
	}
	
	@After
	public void after(){
		System.out.println("after");
	}	

	@Test
	public void selectUserAllTest() {
		/*** Given : 주어진 상황 ***/

		/*** When : 어떤 동작을 수행 ***/
		List<UserVo> result = userService.selectUserAll();

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertEquals(5, result.size());
		
		for(UserVo uv : result){
			System.out.println(result);
		}
	}
	
	@Test
	public void selectUserTest() {
		/*** Given : 주어진 상황 ***/
		String userId = "brown";

		/*** When : 어떤 동작을 수행 ***/
		UserVo userVo = userService.selectUser(userId);

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertNotNull(userVo);
		
		assertEquals("브라운", userVo.getName());
		System.out.println(userVo.getUserId());
	}
	
	@Test
	public void selectUserByVoTest() {
		/*** Given : 주어진 상황 ***/
		String userId = "brown";

		/*** When : 어떤 동작을 수행 ***/
		UserVo userVo = userService.selectUser(userId);

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertNotNull(userVo);
		
		assertEquals("브라운", userVo.getName());
		System.out.println(userVo.getUserId());
		
		assertEquals("brown", userVo.getUserId());
		System.out.println(userVo.getName());

	}
}