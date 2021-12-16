public class EmployeeTest
{

	public static void main( String args[] )
	{
		Employee employee1 = new Employee("APJ Abdul ", "Kalaam", -30000);
		Employee employee2 = new Employee("John ", "Biden", 20000);
		
		employee1.displaySalary();
		employee2.displaySalary();
		employee1.setmonthlySalary(-33000);
		employee2.setmonthlySalary(22000);
		System.out.println("New Salaries of employees after the salary raise of 10% \n");
		employee1.displaySalary();
		employee2.displaySalary();

	}
}
