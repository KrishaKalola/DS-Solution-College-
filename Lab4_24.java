//Create array of object of class Student_Detail with attributes
// Enrollment_No, Name, Semester, CPI for 5 students, scan their information and print it.

import java.util.*;

public class Lab4_24{
	public static void main(String[] args){

		Scanner sc=new Scanner(System.in);
		Student_detail s[]=new Student_detail[5];
		int i=0;

		for(i=0;i<5;i++){
			System.out.println("**********Enter details below**********");
			s[i]= new Student_detail();
			s[i].getInput();
			System.out.println("********* Details are: *************");
			s[i].display();
		}
		
	}
}

class Student_detail{
	int Enrollment_no;
	String Name;
	int Semester;
	double CPI;


	public void getInput(){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter student id: ");
		Enrollment_no=sc.nextInt();
		System.out.println("Enter Name of student: ");
		Name=sc.next();
		System.out.println("Enter Semester : ");
		Semester=sc.nextInt();
		System.out.println("Enter CPI : ");
		CPI=sc.nextDouble();
	}

	public void display(){
		System.out.println("Enrollment_no = "+ Enrollment_no);
		System.out.println("Name is = "+ Name);
		System.out.println("Semester = "+ Semester);
		System.out.println("CPI = "+ CPI);
	}

}
