package com.lara;

public class User implements Comparable<User> 
{
		
	private int rollno;
	private String password;
	
	/**
	 * @return the rollno
	 */
	public int getRollno() {
		return rollno;
	}

	/**
	 * @param rollno the rollno to set
	 */
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	public User(int rollno , String password) {
		
		this.rollno = rollno;
		this.password = password;
	}
	
	/*
	@Override
	public int compareTo(User o) 
	{
		return this.password.compareTo(o.password);
		
	}
	*/
	
	@Override
	public int compareTo(User o) 
	{
		if(this.rollno > o.rollno)
		{
			return 1;
		}
		else if(this.rollno < o.rollno)
		{
			return -1;
		}
		return 0;
	}
	@Override
	public String toString() {
		
		return "Rollno : " + rollno + " Password : " + password;
	}
	
}
