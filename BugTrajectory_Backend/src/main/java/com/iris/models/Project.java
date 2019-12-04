package com.iris.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

@Entity
@Table(name="Projects")
public class Project {
	@Id
	@Column(name="p_id")
	private int p_Id;
	
	@Column(name="p_name")
	private String p_name;
	
	@ManyToMany(mappedBy="project",fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	
	private List<User> users=new ArrayList<User>();

	public int getP_Id() {
		return p_Id;
	}

	public void setP_Id(int p_Id) {
		this.p_Id = p_Id;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	@Override
	public String toString() {
		return "Project [p_Id=" + p_Id + ", p_name=" + p_name + ", users=" + users + "]";
	}
	
	
	

}
