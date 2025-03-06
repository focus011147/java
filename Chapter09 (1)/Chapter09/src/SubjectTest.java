public class SubjectTest {
    public static void main( String args[] ) {
		Subject sub1 = new Subject( );
		Subject sub2 = new Subject("060243102","Computer Programming", 3 );
		sub1.setSubjectCode("060243104");
		sub1.setSubjectName("Object-oriented Programming");
		sub1.setSubjectCredit(3);
		System.out.println("Testing Class Student");
		System.out.println( sub1.toString()  );	
        System.out.println( sub2.toString()  );	
        String strs[] = sub2.toString().split(" ");
        for (String s : strs) 
            System.err.println( s );
    }   
}
