package equalsmethod;

public class Student
{
	private String name;
	private int roll_no;

	public Student(String name , int roll_no)
	{
		this.name = name;
		this.roll_no = roll_no;
		
	}
	
//	@Override
//	public boolean equals(Object student)
//	{
//		
//		
//		try
//		{
//						
//			Student student2 = (Student)student;
//	
//			if (name.equals(student2.name) && roll_no == student2.roll_no)
//			{
//				return true;
//			}
//			else
//			{
//				return false;
//			}
//		} catch (ClassCastException  | NullPointerException e)
//		{
//			return false;
//		}
//	
//	}
	
	
	@Override
	public boolean equals(Object obj)
	{
		
		if (this == obj)
		{
			return true;
		}
		
		if (obj instanceof Student)
		{
			Student student2 = (Student)obj;
			
			if (name.equals(student2.name) && roll_no == student2.roll_no)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		
		return false;
		
		}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	@Override
	protected void finalize() throws Throwable
	{
		// TODO Auto-generated method stub
		super.finalize();
	}
	
	
	}

	

