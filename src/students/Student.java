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
	
	
	
	public void output() {
		super.output();
		System.out.println("studentID "+ studentID);
		System.out.println("studentyears"+ studentyears);
	}
	public static void main(String[]args) 
	{

		Student yen = new Student();
		yen.input();
		yen.output();
	}	
}

