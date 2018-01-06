package com.jpa_boot.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UnitOfMeasure {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String descrpiton;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescrpiton() {
		return descrpiton;
	}
	public void setDescrpiton(String descrpiton) {
		this.descrpiton = descrpiton;
	}
	
	

}
