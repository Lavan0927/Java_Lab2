public class GradeBookTest
{

	public static void main( String args[] )
	{
		
		GradeBook gradeBook1 = new GradeBook("CS101 Introduction to Java Programming", "sam smith");

		gradeBook1.displayMessage();
		gradeBook1.setInstructorName("Judy Jones");
		System.out.println("Changing instructor name to " + gradeBook1.getInstructorName() + "\n" );
		gradeBook1.displayMessage();
	}
}
