package students;

import java.util.Scanner;
public class ArrayOfStudent {
	private static Scanner sc;
	private int n;
	private Student []a= new Student[100];
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
		Student e = new Student();
		e.input();
		e.output();
	}
	public void editStudent() {
		int id = 0;
		System.out.println("Please choose position of student that you want to edit");
		id = sc.nextInt();
		
	}
	public void print() {
		output();
	}
	
	public void manage() {
		System.out.println("student management");
		System.out.println("1- Add Student");
		System.out.println("2- Edit Student");
		System.out.println("3- Delete Student");
		System.out.println("4- Print Student");
		int x = 0;
		while (x < 5) {
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
			break;
		case 3: 
			System.out.println("Deleted");
			break;
		case 4: 
			System.out.println("list student");
			print();

			break;
		default:
			System.out.println("invalid option");
			break;
		}
		
		
		}
	}
	
	public static void main(String[]args) {
		ArrayOfStudent yen=new ArrayOfStudent();
		yen.manage();
//		yen.input();
//		System.out.println("--");
//		yen.output();
	}
}
