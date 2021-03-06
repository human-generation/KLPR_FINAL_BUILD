package com.klpr.biz.e_review;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;

@XmlAccessorType(XmlAccessType.FIELD)
public class E_ReviewVO {
	@XmlAttribute
	private int e_vno; // 리뷰글 번호
	private int eno; // 헬피 번호
	private int rno; // 리뷰 쓴 헬퍼 번호
	private String ecomment; // 헬피에게 쓴 코멘트
	private int escore; // 헬피에게 준 평점
	private int mstate;
	public int getE_vno() {
		return e_vno;
	}
	public void setE_vno(int e_vno) {
		this.e_vno = e_vno;
	}
	public int getEno() {
		return eno;
	}
	public void setEno(int eno) {
		this.eno = eno;
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getEcomment() {
		return ecomment;
	}
	public void setEcomment(String ecomment) {
		this.ecomment = ecomment;
	}
	public int getEscore() {
		return escore;
	}
	public void setEscore(int escore) {
		this.escore = escore;
	}
	public int getMstate() {
		return mstate;
	}
	public void setMstate(int mstate) {
		this.mstate = mstate;
	}
	@Override
	public String toString() {
		return "E_ReviewVO [e_vno=" + e_vno + ", eno=" + eno + ", rno=" + rno + ", ecomment=" + ecomment + ", escore="
				+ escore + ", mstate=" + mstate + "]";
	}

	

}
