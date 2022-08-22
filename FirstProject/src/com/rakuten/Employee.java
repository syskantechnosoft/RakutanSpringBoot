package com.rakuten;

public class Employee {
	private int id;
	private String name;

	// default or no-arg constructor
	public Employee() {
		super();
	}

	// parameterised constructor (all argument constructor)
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp = new Employee(100, "ABC");
		System.out.println(emp);
	}

}
