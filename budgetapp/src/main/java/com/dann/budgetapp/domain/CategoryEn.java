package com.dann.budgetapp.domain;

import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class CategoryEn
{
	private Long cate_id;
	private BigDecimal budget;
	private String cate_name;
	private Date startDate;
	private Date endDate;
	private GroupEn groupEn;
	private Set<TransactionEn> transactionEns = new TreeSet<>();
	
	
	//getters & setters 
	@Id @GeneratedValue
	public Long getCate_id() {
		return cate_id;
	}
	public void setCate_id(Long cate_id) {
		this.cate_id = cate_id;
	}
	public BigDecimal getBudget() {
		return budget;
	}
	public void setBudget(BigDecimal budget) {
		this.budget = budget;
	}
	public String getCate_name() {
		return cate_name;
	}
	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}
	
	//@Column(name="start_date")
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	
	@ManyToOne
	public GroupEn getGroupEn() {
		return groupEn;
	}
	public void setGroupEn(GroupEn groupEn) {
		this.groupEn = groupEn;
	}
	
	@OneToMany(cascade=CascadeType.PERSIST,fetch=FetchType.LAZY, mappedBy="categoryEn")
	public Set<TransactionEn> getTransactionEns() {
		return transactionEns;
	}
	public void setTransactionEns(Set<TransactionEn> transactionEns) {
		this.transactionEns = transactionEns;
	}
	
	
	
}
