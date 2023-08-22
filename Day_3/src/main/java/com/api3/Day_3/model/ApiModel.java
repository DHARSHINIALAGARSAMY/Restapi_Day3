package com.api3.Day_3.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="Employee")
public class ApiModel {
	@Id
private int id;
private String employeeName;
private String employeeAge;
private long salary;
public ApiModel(int id, String employeeName, String employeeAge, long salary) {
	super();
	this.id = id;
	this.employeeName = employeeName;
	this.employeeAge = employeeAge;
	this.salary = salary;
}
public ApiModel() {
	super();
	// TODO Auto-generated constructor stub
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getEmployeeAge() {
	return employeeAge;
}
public void setEmployeeAge(String employeeAge) {
	this.employeeAge = employeeAge;
}
public long getSalary() {
	return salary;
}
public void setSalary(long salary) {
	this.salary = salary;
}

}
