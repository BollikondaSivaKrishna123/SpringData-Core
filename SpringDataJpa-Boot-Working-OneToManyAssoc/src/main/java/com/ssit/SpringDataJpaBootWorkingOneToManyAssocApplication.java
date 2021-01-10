package com.ssit;

import java.util.List;
import java.util.Set;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.nt.entity.Department;
import com.nt.entity.Employee;
import com.nt.service.ICompanyService;

@EntityScan(basePackages ="com.nt.entity")
@EnableAutoConfiguration
@ComponentScan("com.nt.service")
@EnableJpaRepositories(basePackages = "com.nt.repository")
@SpringBootApplication
public class SpringDataJpaBootWorkingOneToManyAssocApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(SpringDataJpaBootWorkingOneToManyAssocApplication.class, args);
		ICompanyService service=ctx.getBean("companyService",ICompanyService.class);
		/*Department dept=new Department();
		dept.setDeptName("ECE");
		dept.setDeptLocation("KMM");
		dept.setEmps(Set.of(new Employee("X",90000.0f,"Ryd", dept),
				new Employee("Y",40000.0f,"TVR", dept),
				new Employee("Z",70000.0f,"SPL", dept)
				));
		System.out.println(service.InsertCompanyDetails(dept));
		*/
		/*Department dept2=new Department();
		dept2.setDeptName("MECH");
		dept2.setDeptLocation("Delhi");
		
		Employee emp=new Employee("Raja",50000.0f, "Kolkata", dept2);
		Employee emp1=new Employee("Rajesh",200000.0f, "Chennai", dept2);
		Employee emp2=new Employee("Rani",10000.0f, "Mumbai", dept2);
		
		System.out.println(service.InsertCompanyDetailsByChild(List.of(emp,emp1,emp2)));*/
		
		service.loadCompanyDetailsByParent();
	}

}
