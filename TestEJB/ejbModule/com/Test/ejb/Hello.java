package com.Test.ejb;

import java.util.List;
import java.util.Scanner;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import model.Employee;

/**
 * Session Bean implementation class Hello
 */
@Stateless
public class Hello implements HelloRemote, HelloLocal {
@PersistenceContext(unitName = "TestJPA")
EntityManager em;
	
    /**
     * Default constructor. 
     */
    public Hello() {
        // TODO Auto-generated constructor stub
    }

	@Override
	public String sayHello() {
		return "Hello World!!!";
	}

	@Override
	public List<Employee> getEmployeeName() {
		TypedQuery query = em.createQuery("Select e from Employee as e",Employee.class);
		List<Employee> name = query.getResultList();
		return name;
	}

	@Override
	public Employee createInfo(int empID, String name, double salary, String region) {
		//Scanner scan = new Scanner(System.in);
		Employee emp = new Employee();
		emp.setEmployeeID(10);
		emp.setName("Shubham Singh");
		emp.setSalary(1200);
		emp.setRegion("Aligarh");
		
		em.persist(emp);
		return emp;
	}
}
