package kr.or.ddit.user.dao;

import static org.junit.Assert.*;

import java.util.List;

import kr.or.ddit.user.model.PageVo;
import kr.or.ddit.user.model.UserVo;

import org.junit.Test;

public class UserDaoTest {

	@Test
	public void selectUserAllTest() {
		/*** Given : 주어진 상황 ***/
		UserDao userDao = new UserDao();

		/*** When : 어떤 동작을 수행 ***/
		List<UserVo> result = userDao.selectUserAll();

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertEquals(5, result.size());
		
		for(UserVo uv : result){
			System.out.println(result);
		}
	}
	
	@Test
	public void selectUserTest() {
		/*** Given : 주어진 상황 ***/
		UserDao userDao = new UserDao();
		String userId = "brown";

		/*** When : 어떤 동작을 수행 ***/
		UserVo userVo = userDao.selectUser(userId);

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertNotNull(userVo);
		
		assertEquals("브라운", userVo.getName());
		System.out.println(userVo.getUserId());
	}
	
	@Test
	public void selectUserByVoTest() {
		/*** Given : 주어진 상황 ***/
		UserDao userDao = new UserDao();
		String userId = "brown";

		/*** When : 어떤 동작을 수행 ***/
		UserVo userVo = userDao.selectUser(userId);

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		assertNotNull(userVo);
		
		assertEquals("브라운", userVo.getName());
		System.out.println(userVo.getUserId());
		
		assertEquals("brown", userVo.getUserId());
		System.out.println(userVo.getName());
	}
	
	@Test
	public void selectUserPageList() {
		/*** Given : 주어진 상황 ***/
		UserDao userDao = new UserDao();
		PageVo pageVo = new PageVo();
//		pageVo.setPage(2);
//		pageVo.setPageSize(10);

		/*** When : 어떤 동작을 수행 ***/
//		List<UserVo> result = userDao.selectUserPageList(page, pageSize);

		/*** Then : 결과가 어떠해야 하는지 정의 ***/
		

	}
}