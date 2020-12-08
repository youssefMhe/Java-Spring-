package com.example.demo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Job implements Serializable {
	private static final long serialVersionUID = 6 ;
	
	@Id
	@GeneratedValue
	private int id;
	private String service ;
	private Boolean etat ;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getService() {
		return service;
	}
	public void setService(String service) {
		this.service = service;
	}
	public Boolean getEtat() {
		return etat;
	}
	public void setEtat(Boolean etat) {
		this.etat = etat;
	}
	public Job() {
		super();
		
	}
	public Job(Boolean etat) {
		super();
		this.etat = etat;
	}
	public Job(String service) {
		super();
		this.service = service;
		
	}
	public Job(String service, Boolean etat) {
		super();
		this.service = service;
		this.etat = etat;
	}
	
	
}
