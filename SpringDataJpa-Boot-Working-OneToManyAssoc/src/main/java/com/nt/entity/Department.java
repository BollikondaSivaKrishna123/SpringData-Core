package com.nt.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.LazyCollection;
import org.hibernate.annotations.LazyCollectionOption;

import lombok.Getter;
import lombok.Setter;

@Entity
@Setter
@Getter
@Table(name ="Department_OTM")
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Integer deptNo;
private String deptName;
private String deptLocation;

@OneToMany(targetEntity =com.nt.entity.Employee.class,cascade = CascadeType.ALL,fetch = FetchType.LAZY)
@JoinColumn(name = "deptno",referencedColumnName = "deptNo")
//@LazyCollection(LazyCollectionOption.FALSE)
private Set<Employee> emps;

@Override
public String toString() {
	return "Department [deptNo=" + deptNo + ", deptName=" + deptName + ", deptLocation=" + deptLocation + "]";
}



}
