package comparable;

public class Employee implements Comparable<Employee>
{
	private int empId;
	private String name;
	private int age;
	
	
	
	
	public Employee(int empId , String name ,  int age )
	{
		this.empId = empId;
		this.name =name;
		this.age = age;
	}

	/**
	 * @return the empId
	 */
	public int getEmpId()
	{
		return empId;
	}

	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(int empId)
	{
		this.empId = empId;
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
	 * @return the age
	 */
	public int getAge()
	{
		return age;
	}

	/**
	 * @param age the age to set
	 */
	public void setAge(int age)
	{
		this.age = age;
	}
	
	@Override
	public String toString()
	{
		
		return  " "+this.getName() + " :  "+this.getEmpId() + " :  " + this.age;
	}

	public int compareTo(Employee o)
	{
	
		return this.empId - o.getEmpId();
	}
	
	
	
	
}
