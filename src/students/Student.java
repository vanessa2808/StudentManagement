package students;
import java.util.Scanner;
public  class Student extends Person
{
	protected String studentID;
	protected int studentyears;
	public Student() {
		super();
		this.studentID = null;
	}
	public String getStudentID() {
		return studentID;
	}
	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}
	public Student(String name,boolean sex, String studentID, DateOfBirth dob, Address add, int studentyears ) {
		super(name,sex,dob,add);
		this.studentID = studentID;
		this.studentyears = studentyears;
	}
	public void input() {
		super.input();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter studentId");
		studentID = sc.nextLine();
		System.out.println("Enter student year");
		studentyears = sc.nextInt();
	}
	public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name   +
                ", add='" + add  +
                ", sex='" + sex + 
                ", dob='" + dob +
                ", studentyears='" + studentyears +
                '}';
    }

	
	public void output() {
		super.output();
		System.out.println("studentID "+ studentID);
		System.out.println("studentyears"+ studentyears);
	}
	
}

