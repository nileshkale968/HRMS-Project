package com.amigos;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.amigos.entities.Departments;
import com.amigos.entities.Employees;
import com.amigos.entities.Roles;
import com.amigos.services.DepartmentsService;
import com.amigos.services.EmployeesService;
import com.amigos.services.RolesService;

@Component
public class DataLoader implements CommandLineRunner{
	
	@Autowired
	private RolesService roleService;
	
	@Autowired
	private EmployeesService employeeService;
	
	@Autowired
	private DepartmentsService departmentService;

	@Override
	public void run(String... args) throws Exception {
		// add getter setter constructor and toString Method
	/*	Roles role1 = new Roles();
		role1.setRoleName("Manager");
		role1.setDescription("Manager role desc");
		roleService.addRole(role1);
		
		Roles role2 = new Roles();
		role2.setRoleName("Developer");
		role2.setDescription("Developer role desc");
		roleService.addRole(role2);
		
		Departments d1 = new Departments();
		d1.setDepartmentName("IT");
		d1.setDescription("IT Desc");
		departmentService.addDepartment(d1);
		
		Departments d2 = new Departments();
		d2.setDepartmentName("HR");
		d2.setDescription("HR Desc");
		departmentService.addDepartment(d2);
		
		
		Employees Manager = new Employees();
		Manager.setFirstName("Virat");
		Manager.setLastName("Kohli");
		Manager.setGender("Male");
		Manager.setDateOfBirth(LocalDate.of(1988, 2, 15));
		Manager.setEmail("viratkohli@gmail.com");
		Manager.setPhone("9864522255");
		Manager.setAddress("Delhi");
		Manager.setNationalId("jdghd28d");
		Manager.setMartialStatus("Married");
		Manager.setEmergencyContactName("Anushka");
		Manager.setEmergencyContactPhone("985537895");
		Manager.setPosition("Software Manager");
		Manager.setSkillSet("Java, Springboot, AWS, MySQL");
		Manager.setEmploymentStartDate(LocalDate.of(2019, 2, 15));
		Manager.setEmploymentEndDate(null);
		Manager.setSalary(new BigDecimal(120000.0));
		Manager.setEmploymentStatus("Active");
		Manager.setBankAccountNumber("354482221885");
		Manager.setManager(null);
		Manager.setDepartment(d2);
		Manager.setRole(role2);
		
		
		Employees emp1 = new Employees();
		emp1.setFirstName("Rohit");
		emp1.setLastName("Sharma");
		emp1.setGender("Male");
		emp1.setDateOfBirth(LocalDate.of(1987, 4, 25));
		emp1.setEmail("rohitsharma@gmail.com");
		emp1.setPhone("8564123789");
		emp1.setAddress("Mumbai");
		emp1.setNationalId("hcpk6528d");
		emp1.setMartialStatus("Married");
		emp1.setEmergencyContactName("Ritika");
		emp1.setEmergencyContactPhone("5641237895");
		emp1.setPosition("Software developer");
		emp1.setSkillSet("Java, Springboot");
		emp1.setEmploymentStartDate(LocalDate.of(2023, 12, 05));
		emp1.setEmploymentEndDate(null);
		emp1.setSalary(new BigDecimal(80000.0));
		emp1.setEmploymentStatus("Active");
		emp1.setBankAccountNumber("20292431885");
		emp1.setManager(Manager);
		emp1.setDepartment(d1);
		emp1.setRole(role1);
		
		employeeService.addEmployee(Manager);
		employeeService.addEmployee(emp1);
		*/
	}

}
