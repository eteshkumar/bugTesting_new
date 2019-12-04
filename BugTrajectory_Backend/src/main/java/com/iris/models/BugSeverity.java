package com.iris.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Severity")
public class BugSeverity {
	@Id
	@Column(name="Severity_id")
	private int severity_id;
	
	@Column(name="Severity_name")
	private String severity_name;

	public int getSeverity_id() {
		return severity_id;
	}

	public void setSeverity_id(int severity_id) {
		this.severity_id = severity_id;
	}

	public String getSeverity_name() {
		return severity_name;
	}

	public void setSeverity_name(String severity_name) {
		this.severity_name = severity_name;
	}

	@Override
	public String toString() {
		return "BugSeverity [severity_id=" + severity_id + ", severity_name=" + severity_name + "]";
	}
 
	
	

}
