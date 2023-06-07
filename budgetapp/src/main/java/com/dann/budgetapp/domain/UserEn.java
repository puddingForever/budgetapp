package com.dann.budgetapp.domain;


import java.util.Set;
import java.util.TreeSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
public class UserEn 
{
	private Long user_id;
	private String username;
	private String user_password;
	//one-to-many 
	private Set<GroupEn> groupEn = new TreeSet<>();
	
	//Getters& setters
	@Id
	@GeneratedValue
	public Long getUser_id() {
		return user_id;
	}
	public void setUser_id(Long user_id) {
		this.user_id = user_id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getUser_password() {
		return user_password;
	}
	public void setUser_password(String user_password) {
		this.user_password = user_password;
	}
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.LAZY,mappedBy="group_user")
	public Set<GroupEn> getGroupEn() {
		return groupEn;
	}
	public void setGroupEn(Set<GroupEn> groupEn) {
		this.groupEn = groupEn;
	}
	
	
	
	

}
