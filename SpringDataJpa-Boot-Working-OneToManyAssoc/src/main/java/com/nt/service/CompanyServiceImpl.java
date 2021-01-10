package com.nt.service;

import java.util.List;
import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.repository.DepartmentRepo;
import com.nt.repository.EmployeeRepo;

@Component
@Service("companyService")
public class CompanyServiceImpl implements ICompanyService {
	@Autowired
	private DepartmentRepo deptRepo;
	@Autowired
	private EmployeeRepo empRepo;

	@Transactional
	@Override
	public String InsertCompanyDetails(Department dept) {
		Department dept1 = deptRepo.save(dept);
		return "records inserted !! => Department";
	}

	@Override
	public String InsertCompanyDetailsByChild(List<Employee> emp) {
		empRepo.saveAll(emp);
		return "records inserted !! => Employee";
	}

	@Transactional
	@Override
	public void loadCompanyDetailsByParent() {
		List<Department> list = deptRepo.findAll();
		list.forEach(dept -> {
			// System.out.println(dept.getDeptName()+" "+dept.getDeptLocation()+" ");
			System.out.println("The Parent  :: " + dept);
			//System.out.println("The No.of Elements are :: "+list.size());
			Set<Employee> listemp = dept.getEmps();
			/*listemp.forEach(emp->{
					System.out.println(emp.getEname()+"   "+emp.getEaddr()+"   "+emp.getEsal());
				System.out.println("The Child  :: "+emp);	
			});*/
			System.out.println("-------------------------------------------");
		});

	}
}
