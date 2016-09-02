package com.Test.ejb;

import java.util.List;

import javax.ejb.Local;

import model.Employee;

@Local
public interface HelloLocal {
	public String sayHello();
	public List<Employee> getEmployeeName();
	public Employee createInfo(int empID,String name,double salary,String region);
}