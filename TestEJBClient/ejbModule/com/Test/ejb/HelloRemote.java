package com.Test.ejb;

import java.util.List;

import javax.ejb.Remote;

import model.Employee;

@Remote
public interface HelloRemote {
	public String sayHello();
	public List<Employee> getEmployeeName();
	
	public Employee createInfo(int empID,String name,double salary,String region);
}