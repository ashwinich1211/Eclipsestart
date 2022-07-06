package com.Generics;

import java.util.HashSet;

public class Employee {
	private int id;
	private String name;
	private long salary;
	private String department;

	public Employee(int id, String name, long salary, String department) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		this.department = department;

		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", department=" + department + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<Employee> h = new HashSet<>();
		h.add(new Employee(1, "Ashwini", 10000, "I.T"));
		h.add(new Employee(2, "Swathi", 20000, "CSE"));
		h.add(new Employee(3, "Mallesh", 30000, "ECE"));
		System.out.println(h);

	}

}
