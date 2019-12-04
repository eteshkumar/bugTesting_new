package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bug_type_table")
public class BugType {
	
	@Id
	@Column(name="bugtype_id")
	private String bugtype_id;
	
	@Column(name="bug_type")
	private String bug_type;
	public String getBugtype_id() {
		return bugtype_id;
	}
	public void setBugtype_id(String bugtype_id) {
		this.bugtype_id = bugtype_id;
	}
	public String getBug_type() {
		return bug_type;
	}
	public void setBug_type(String bug_type) {
		this.bug_type = bug_type;
	}
	@Override
	public String toString() {
		return "BugType [bugtype_id=" + bugtype_id + ", bug_type=" + bug_type + "]";
	}
	
	

}
