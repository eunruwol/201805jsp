package kr.or.ddit.user.service;

import java.util.List;

import kr.or.ddit.user.dao.UserDao;
import kr.or.ddit.user.model.UserVo;

public class UserService implements UserServiceInf {
	
	public List<UserVo> selectUserAll(){
		UserDao userDao = new UserDao();
		return userDao.selectUserAll();
	}
	
	public UserVo selectUser(String userId){
		UserDao userDao = new UserDao();
		return userDao.selectUser(userId);
	}
	
	public UserVo selectUser(UserVo userVo){
		UserDao userDao = new UserDao();
		return userDao.selectUser(userVo);
	}

	@Override
	public List<UserVo> selectUserPageList(int page, int pageSize) {
		UserDao userDao = new UserDao();
		return userDao.selectUserPageList(page, pageSize);
	}
	
}