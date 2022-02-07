package com.icia.project.vo;

public class memVo {
	
	private String memno; // 회원번호
	private String memid;
	private String mempass;
	private String memname;
	private String memjoindate; // 가입일
//	private String memcheckdel; // 삭제여부
	private String memdpt; // 부서
	private String memrank; // 직급
	private int memcount; // 수정차수 
	public String getMemno() {
		return memno;
	}
	public void setMemno(String memno) {
		this.memno = memno;
	}
	public String getMemid() {
		return memid;
	}
	public void setMemid(String memid) {
		this.memid = memid;
	}
	public String getMempass() {
		return mempass;
	}
	public void setMempass(String mempass) {
		this.mempass = mempass;
	}
	public String getMemname() {
		return memname;
	}
	public void setMemname(String memname) {
		this.memname = memname;
	}
	public String getMemjoindate() {
		return memjoindate;
	}
	public void setMemjoindate(String memjoindate) {
		this.memjoindate = memjoindate;
	}
//	public String getMemcheckdel() {
//		return memcheckdel;
//	}
//	public void setMemcheckdel(String memcheckdel) {
//		this.memcheckdel = memcheckdel;
//	}
	public String getMemdpt() {
		return memdpt;
	}
	public void setMemdpt(String memdpt) {
		this.memdpt = memdpt;
	}
	public String getMemrank() {
		return memrank;
	}
	public void setMemrank(String memrank) {
		this.memrank = memrank;
	}
	public int getMemcount() {
		return memcount;
	}
	public void setMemcount(int memcount) {
		this.memcount = memcount;
	}
	
	
	
}
