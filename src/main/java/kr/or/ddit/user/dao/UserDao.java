package kr.or.ddit.user.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import kr.or.ddit.db.SqlFactoryBuilder;
import kr.or.ddit.user.model.UserVo;

public class UserDao implements UserDaoInf {
	
	public List<UserVo> selectUserAll(){
		List<UserVo> result = null;
		
		SqlSessionFactory sqlFactory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = sqlFactory.openSession();
		
		// selectOne : 데이터가 한건일때
		// selectList : 여러건의 데이터를 조회
		// 메소드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디
		
		result = session.selectList("user.selectUserAll");
		
		return result;
	}
	
	public UserVo selectUser(String userId){
		UserVo result = null;
		
		SqlSessionFactory sqlFactory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = sqlFactory.openSession();
		
		result = session.selectOne("user.selectUser", userId);
		
		return result;
	}
	
	public UserVo selectUser(UserVo userVo){
		UserVo result = null;
		
		SqlSessionFactory sqlFactory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = sqlFactory.openSession();
		
		result = session.selectOne("user.selectUserByVo", userVo);
		
		return result;
	}

	@Override
	public List<UserVo> selectUserPageList(int page, int pageSize) {
		List<UserVo> result = null;
		
		SqlSessionFactory sqlFactory = SqlFactoryBuilder.getSqlSessionFactory();
		SqlSession session = sqlFactory.openSession();
		
		// selectOne : 데이터가 한건일때
		// selectList : 여러건의 데이터를 조회
		// 메소드 인자 : 문자열 = 네임스페이스(모듈명).쿼리아이디
		
		result = session.selectList("user.selectUserPageList");
		
		return result;
	}
}