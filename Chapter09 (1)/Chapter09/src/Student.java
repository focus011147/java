public class Student {
    private String studentCode = "";
    private String studentName = ""; 
    private String studentSurname = "";
               
    /** Creates a new instance of Student */
    public Student() {
    }
    
    public Student(String code, String name, String surname) {
        setStudentCode(code);
        setStudentName(name);
        setStudentSurName(surname);
    }
        
    public void setStudentCode(String code) {
        studentCode = code;
    }
    
    public void setStudentName(String name) {
        studentName = name;
    }
     
    public void setStudentSurName(String surname) {
        studentSurname = surname;
    }
    
    public String getStudentCode() {
        return(studentCode);
    }
    
    public String getStudentName() {
        return(studentName);
    }
     
    public String getStudentSurName() {
        return(studentSurname);
    }
    
    public String toString() {
        return( getStudentCode() +" "+getStudentName() +" "+ getStudentSurName());
    } 
}
