package com.dann.budgetapp.domain;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class TransactionEn
{
	
	private Long tran_id;
	private Date tran_date;
	private BigDecimal tran_total;
	private String tran_type;
	private String tran_note;
	private CategoryEn categoryEn;
	
	//getters & setters
	@Id @GeneratedValue
	public Long getTran_id() {
		return tran_id;
	}
	public void setTran_id(Long tran_id) {
		this.tran_id = tran_id;
	}
	public Date getTran_date() {
		return tran_date;
	}
	public void setTran_date(Date tran_date) {
		this.tran_date = tran_date;
	}
	public BigDecimal getTran_total() {
		return tran_total;
	}
	public void setTran_total(BigDecimal tran_total) {
		this.tran_total = tran_total;
	}
	public String getTran_type() {
		return tran_type;
	}
	public void setTran_type(String tran_type) {
		this.tran_type = tran_type;
	}
	public String getTran_note() {
		return tran_note;
	}
	public void setTran_note(String tran_note) {
		this.tran_note = tran_note;
	}
	
	@ManyToOne
	public CategoryEn getCategoryEn() {
		return categoryEn;
	}

	public void setCategoryEn(CategoryEn categoryEn) {
		this.categoryEn = categoryEn;
	}
	

}
