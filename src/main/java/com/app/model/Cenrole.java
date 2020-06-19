package com.app.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQuery(name="Cenrole.getCourseEnrolementsByStudent", query="select ce from Cenrole ce where ce.sid=?1")
@Table(name = "cenrols")
public class Cenrole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "CID")
	private int cid;
	
	@Column(name = "SID")
	private int sid;
	
	@Column(name = "EDATE")
	private Date edate;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	
	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	@Override
	public String toString() {
		return "Cenrole [id=" + id + ", cid=" + cid + ", sid=" + sid + ", edate=" + edate + "]";
	}
	
	
	
	
	


	
	
}
