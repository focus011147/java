public class StudentTest {

	public static void main( String args[] ) {
		Student std1 = new Student( );
		Student std2 = new Student("12345","Somchai","Cheingpongpan" );
		std1.setStudentCode("77777");
		std1.setStudentName("John");
		std1.setStudentSurName("Smith");
		System.out.println("Testing Class Student");
		System.out.println( std1.toString()  );	
        System.out.println( std2.toString()  );	
    }   
}
