public class GradeBook 
{
	private String courseName; // course name for this GradeBook 
	/* write code to declare a second String instance variable */ 
	private String instructorName;

	// constructor initializes courseName with String supplied as argument 
	public GradeBook( String name, String insname )
	{ 
		courseName = name; // initializes courseName 
		instructorName = insname;
	} // end constructor 

	// method to set the course name 
	public void setCourseName( String name ) 
	{ 
		courseName = name; // store the course name 
	} // end method setCourseName 

	// method to retrieve the course name 
	public String getCourseName() 
	{ 
		return courseName; 
	} // end method getCourseName
 
	/* write code to declare a get and a set method for the instructor's name */
 	
	// method to set the instructor name 
	public void setInstructorName( String insname ) 
	{ 
		instructorName = insname; // store the instructor name 
	} // end method setinstructorName 

	// method to retrieve the instructor name 
	public String getInstructorName() 
	{ 
		return instructorName; 
	} // end method getInstructorName	

	// display a welcome message to the GradeBook user 
	public void displayMessage() 
	{ 
		// this statement calls getCourseName to get the 
		// name of the course this GradeBook represents 
		System.out.printf( "welcome to the grade book for\n%s!\n", getCourseName() );
		/* write code to output the instructor's name */
		System.out.println( "This course is presented by: " + getInstructorName() + "\n"); 
	} // end method displayMessage 
} 

