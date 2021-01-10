package com.nt.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter

@Table(name="Employee_MTO")
public class Employee {
	@Id
	@SequenceGenerator(initialValue = 1000,allocationSize = 1, name = "gen")
	@GeneratedValue(generator = "gen",strategy = GenerationType.SEQUENCE)
private Integer eid;
private String ename;
private  Float esal;
private String eaddr;
@ManyToOne(targetEntity = com.nt.entity.Department.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "deptno",referencedColumnName = "deptNo")
private Department dept;




@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", eaddr=" + eaddr + "]";
}


public Employee()
{}

public Employee(String ename, Float esal, String eaddr, Department dept) {

	this.ename = ename;
	this.esal = esal;
	this.eaddr = eaddr;
	this.dept = dept;
}






}
