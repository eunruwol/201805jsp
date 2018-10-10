package kr.or.ddit.user.model;

import java.util.Date;

public class UserVo {
	
	private String userId;		// 회원아이디
	private String name;		// 이름
	private String pass;		// 비밀번호
	private String addr1;		// 도로주소
	private String addr2;		// 도로주소상세
	private String zipcd;		// 우편번호
	private Date birth;			// 생년월일
	private String email;		// 이메일
	private String tel;			// 전화번호
	private String profile;		// 프로필경로
	
	public UserVo(){}

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

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public String getAddr1() {
		return addr1;
	}

	public void setAddr1(String addr1) {
		this.addr1 = addr1;
	}

	public String getAddr2() {
		return addr2;
	}

	public void setAddr2(String addr2) {
		this.addr2 = addr2;
	}

	public String getZipcd() {
		return zipcd;
	}

	public void setZipcd(String zipcd) {
		this.zipcd = zipcd;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	@Override
	public String toString() {
		return "UserVo [userId=" + userId + ", name=" + name + ", pass=" + pass
				+ ", addr1=" + addr1 + ", addr2=" + addr2 + ", zipcd=" + zipcd
				+ ", birth=" + birth + ", email=" + email + ", tel=" + tel
				+ ", profile=" + profile + "]";
	}
}
