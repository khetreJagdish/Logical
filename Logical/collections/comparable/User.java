package comparable;

public class User implements Comparable<User>
{
	private String usesrname;
	private String password;
	/**
	 * @return the usesrname
	 */
	public String getUsesrname()
	{
		return usesrname;
	}
	/**
	 * @param usesrname the usesrname to set
	 */
	public void setUsesrname(String usesrname)
	{
		this.usesrname = usesrname;
	}
	/**
	 * @return the password
	 */
	public String getPassword()
	{
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password)
	{
		this.password = password;
	}
	
	@Override
	public int compareTo(User o)
	{
		
		return this.usesrname.compareTo(o.getUsesrname());
	}
}
