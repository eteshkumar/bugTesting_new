package com.iris.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="Usertable_12")
public class User {
	@Id
	@Column(name="userid")
	private int userid;
	
	@Column(name="username")
	private String username;
	
	@Column(name="password")
	private String password;
	
	@Column(name="designation")
	private String designation;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name="project_allocation",
	joinColumns={@JoinColumn(name="userid")},
	inverseJoinColumns={@JoinColumn(name="p_id")})
	
	private List<Project> project=new ArrayList<Project>();
	

	public List<Project> getProject() {
		return project;
	}

	public void setProject(List<Project> project) {
		this.project = project;
	}

	public int getUserid() {
		return userid;
	}

	public void setUserid(int userid) {
		this.userid = userid;
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

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	
	}
	
	

