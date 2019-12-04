package com.iris.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Bug_status")
public class BugStatus {
	
@Id
private String status_id;
private String status_name;
public String getStatus_id() {
	return status_id;
}
public void setStatus_id(String status_id) {
	this.status_id = status_id;
}
public String getStatus_name() {
	return status_name;
}
public void setStatus_name(String status_name) {
	this.status_name = status_name;
}
@Override
public String toString() {
	return "BugStatus [status_id=" + status_id + ", status_name=" + status_name + "]";
}

}
