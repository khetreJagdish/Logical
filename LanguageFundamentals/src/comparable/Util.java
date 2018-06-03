package comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Util
{

	public static void main(String[] args)
	{
		List<Employee> col = new ArrayList<>();
		
		col.add(new Employee(5, "Frank", 28));
        col.add(new Employee(1, "Jorge", 19));
        col.add(new Employee(6, "Bill", 34));
        col.add(new Employee(3, "Michel", 10));
        col.add(new Employee(7, "Simpson", 8));
        col.add(new Employee(4, "Clerk",16 ));
        col.add(new Employee(8, "Lee", 40));
        col.add(new Employee(2, "Mark", 30));
		
        for (Employee emp :col)
		{
        	System.out.println("EmpId\tName\tAge");
			System.out.println(emp.getAge() + " " + emp.getEmpId() + " " + emp.getName());
		}
      
        Collections.sort(col);
      
        System.out.println("===============");
        
        for (Employee emp :col)
		{
        	System.out.println("EmpId\tName\tAge");
			System.out.println(emp.getAge() + " " + emp.getEmpId() + " " + emp.getName());
		}
	
	
	}
	
	

}
