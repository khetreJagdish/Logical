package com.java.seialization;

public class Person
{
	private String name;
	private int id;
	transient private int salary;
	
	@Override
	public String toString()
	{
		
		return " Person Name : " + name + " Person ID : " + id + " Person Salary : " + salary;
	}
	/**
	 * @return the name
	 */
	public String getName()
	{
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name)
	{
		this.name = name;
	}
	/**
	 * @return the id
	 */
	public int getId()
	{
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(int id)
	{
		this.id = id;
	}
	/**
	 * @return the salary
	 */
	public int getSalary()
	{
		return salary;
	}
	/**
	 * @param salary the salary to set
	 */
	public void setSalary(int salary)
	{
		this.salary = salary;
	}
	
	
}
