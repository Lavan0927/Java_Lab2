public class Employee
{
	private String firstName;
	private String lastName;
	private double monthlySalary;

	public Employee( String fname, String lname,double msalary ) 
	{
		firstName = fname;
		lastName  = lname;
		if(msalary > 0){
			monthlySalary = msalary;
		}else{
			monthlySalary = 0;
		}
	}
	
	public void setfirstName ( String fname )
	{
		firstName = fname;
	}

	public String getfirstName ()
	{
		return firstName;
	}

	public void setlastName ( String lname )
	{
		lastName  = lname;
	}

	public String getlastName ()
	{
		return lastName;
	}

	public void setmonthlySalary ( double msalary )
	{
		if(msalary > 0){
			monthlySalary = msalary;
		}else{
			monthlySalary = 0;
		}
			
	}

	public double getmonthlySalary ()
	{
		return monthlySalary;
	}	

	public void displaySalary() 
	{
		System.out.println("Salary of Employee " + getfirstName () + getlastName () + " : " + ( getmonthlySalary () * 12 ) + "\n");
	}
}