package com.example.department.model;




import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Department {
	
 @Id
 private int departmenId;
 private String departmentName;
 
 
public int getDepartmenId() {
	return departmenId;
}
public void setDepartmenId(int departmenId) {
	this.departmenId = departmenId;
}
public String getDepartmentName() {
	return departmentName;
}
public void setDepartmentName(String departmentName) {
	this.departmentName = departmentName;
}
	 

}
