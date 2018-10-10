package kr.or.ddit.user.model;

import java.util.Date;

public class PageVo {
	private int rnum;
	private String userId;
	private String name;
	private Date birth;
	public int getRnum() {
		return rnum;
	}
	public void setRnum(int rnum) {
		this.rnum = rnum;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirth() {
		return birth;
	}
	public void setBirth(Date birth) {
		this.birth = birth;
	}
	
	@Override
	public String toString() {
		return "PageVo [rnum=" + rnum + ", userId=" + userId + ", name=" + name
				+ ", birth=" + birth + "]";
	}	
}