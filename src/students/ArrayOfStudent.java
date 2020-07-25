package students;

import java.util.Scanner;
public class ArrayOfStudent {
	private static Scanner sc;
	private int n;
	private Student []a= new Student[3];
	public void input() {
		sc= new Scanner (System.in);
		System.out.println("Enter n: ");
		n=sc.nextInt();
		for (int i=0;i<n;i++) {
			System.out.println("Enter student: "+i);
			Student e=new Student();
			e.input();
			a[i]=e;
		}
	}
	public void output() {
		for(int i=0;i<n;i++) {
			System.out.println("------------------------");
			a[i].output();
		}
	}
	
	
	public void addNewStudent() {
		Student p =new Student();
		p.input();
		a[n]=p;
		n++;
	}
	
	
	public void editStudent() {
	sc=new Scanner(System.in);
	System.out.println("Enter StudentID: ");
	String coID=sc.nextLine();
	for(int i=0;i<n;i++) {
		if(a[i].getStudentID().equals(coID)) {
			System.out.println("student"+ i);
			a[i].input();
		}
	}
		
	}
	
	public void find() {
		sc=new Scanner(System.in);
		System.out.println("Enter StudentID: ");
		String coID=sc.nextLine();
		for(int i=0;i<n;i++) {
			if(a[i].getStudentID().equals(coID)) {
				System.out.println("student"+ i);
				a[i].output();
			}
		}
	}
	
	public void remove(int index) {
		for(int i= index;i<n-1;i++) {
			a[i]=a[i+1];
		}
		n--;
	}
	
	public void delete() {
		sc=new Scanner(System.in);
		System.out.println("Enter studentID: ");
		String coID=sc.nextLine();
		for(int i=n-1;i>=0;i--) {
			if(a[i].getStudentID().equals(coID)) remove(i);
		}
	}
	

	public void manage() {
		System.out.println("student management");
		System.out.println("1- Add Student");
		System.out.println("2- Edit Student");
		System.out.println("3- Delete Student");
		System.out.println("4- Print Student");
		System.out.println("5- Find Student");

		System.out.println("6- Back");
		int x = 0;
		while (x < 7) {
			sc = new Scanner(System.in);
			System.out.println("Please enter the option: ");
			x = sc.nextInt();
		
		switch(x) {
		case 1: 
			System.out.println("Welcome to add new student");
			addNewStudent();
			break;

		case 2: 
			System.out.println(" please, enter new information");
			editStudent();
			output();
			break;
		case 3: 
			delete();
			output();
			System.out.println("Deleted");
			break;
		case 4: 
			System.out.println("list student");
			output();

			break;
		case 5: 
			System.out.println("Find student");
			find();

			break;
		case 6: 
			System.out.println("Welcome to system student management");
			manage();

			break;
		default:
			System.out.println("invalid option");
			break;
		}
		
		
		}
	}
	
	
}
