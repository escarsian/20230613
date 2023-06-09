package com.yedam;

public class Member {
	public String id;
	public String pw;

	public Member() {
	}

	public Member(String id, String pw) {
		super();
		this.id = id;
		this.pw = pw;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
//		return this.id.hashCode(); // id 가 같다고 출력.
	}

	@Override
	public boolean equals(Object obj) {
//		return super.equals(obj);
		if (!(obj instanceof Member)) {
			return false;
		}

		Member member = (Member) obj; // this.id값은 String이기때문에 obj 형태를 바꿔줌
		if (this.id.equals(member.id) && this.pw.equals(member.pw)) {
			return true;
		}
		return false;

	}
	@Override
	public String toString() {
//		return super.toString();
		return "회원 아이디: " + id + ", 비밀번호: " + pw;
	}

}