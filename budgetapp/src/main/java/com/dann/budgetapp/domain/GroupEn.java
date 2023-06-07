package com.dann.budgetapp.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class GroupEn
{
	private Long group_id;
	private String group_name;
	private UserEn group_user;
	private Set<CategoryEn> categoryEn =  new TreeSet<>();
	
	@Id @GeneratedValue
	public Long getGroup_id() {
		return group_id;
	}

	public void setGroup_id(Long group_id) {
		this.group_id = group_id;
	}

	public String getGroup_name() {
		return group_name;
	}

	public void setGroup_name(String group_name) {
		this.group_name = group_name;
	}

	@ManyToOne
	public UserEn getGroup_user() {
		return group_user;
	}

	public void setGroup_user(UserEn group_user) {
		this.group_user = group_user;
	}
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY,mappedBy="groupEn")
	public Set<CategoryEn> getCategoryEn() {
		return categoryEn;
	}

	public void setCategoryEn(Set<CategoryEn> categoryEn) {
		this.categoryEn = categoryEn;
	}

	
	/*
	 * @OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY,
	 * mappedBy="groupEn") public Set<CategoryEn> getCategories() { return
	 * categoryEn; }
	 * 
	 * public void setCategories(Set<CategoryEn> categoryEn) { this.categoryEn =
	 * categoryEn; }
	 * 
	 */
	
	
	

}
