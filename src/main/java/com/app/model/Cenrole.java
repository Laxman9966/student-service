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
@NamedQuery(name="Cenrole.getCourseEnrolementsByStudent", query="select ce from Cenrole ce where ce.sname=?1")
@Table(name = "cenrols")
public class Cenrole {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "ID")
	private Long id;
	
	@Column(name = "CNAME")
	private String cname;
	
	@Column(name = "SNAME")
	private String sname;
	
	@Column(name = "EDATE")
	private Date edate;

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public Date getEdate() {
		return edate;
	}

	public void setEdate(Date edate) {
		this.edate = edate;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	@Override
	public String toString() {
		return "Cenrole [id=" + id + ", cname=" + cname + ", sname=" + sname + ", edate=" + edate + "]";
	}

	
	
	


	
	
}
