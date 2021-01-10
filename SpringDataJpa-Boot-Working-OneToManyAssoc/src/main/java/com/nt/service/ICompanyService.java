package com.nt.service;

import java.util.List;

import com.nt.entity.Department;
import com.nt.entity.Employee;

public interface ICompanyService {
public String InsertCompanyDetails(Department dept);
public String InsertCompanyDetailsByChild(List<Employee> emp);
public void loadCompanyDetailsByParent();

}
