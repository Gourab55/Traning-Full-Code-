package com.Author.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class AuthorDetail {
	  
	@Id
	@GeneratedValue(strategy =GenerationType.AUTO)
	  private Integer aid;
	  private String authorEmail;
	  private String username;
	  private String password;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid = aid;
	}
	public String getAuthorEmail() {
		return authorEmail;
	}
	public void setAuthorEmail(String authorEmail) {
		this.authorEmail = authorEmail;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public AuthorDetail(Integer aid, String authorEmail, String username, String password) {
		super();
		this.aid = aid;
		this.authorEmail = authorEmail;
		this.username = username;
		this.password = password;
	}
	public AuthorDetail() {
		super();
	}
	  
	  
	  
	  
	  
	  
	
	

}
