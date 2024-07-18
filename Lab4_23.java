//Create class Employee_Detail with attributes Employee_ID, Name, Designation, and Salary. 
//Write a program to read the detail from user and print it.

import java.util.*;

public class Lab4_23{
	public static void main(String[] args){

		Emplyoee_Detail emp=new Emplyoee_Detail();
			System.out.println("**********Enter details below**********");
			emp.getInput();
			System.out.println("********* Details are: *************");
			emp.display();
		
		
	}
}

class Emplyoee_Detail{
	int Employee_ID;
	String Name;
	String Designation;
	double Salary;


	public void getInput(){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter employee id: ");
		Employee_ID=sc.nextInt();
		System.out.println("Enter Name of employee: ");
		Name=sc.next();
		System.out.println("Enter Designation of employee: ");
		Designation=sc.next();
		System.out.println("Enter Salary of employee: ");
		Salary=sc.nextDouble();
	}

	public void display(){
		System.out.println("Employee_ID = "+ Employee_ID);
		System.out.println("Name is = "+ Name);
		System.out.println("Designation= "+ Designation);
		System.out.println("Salary = "+ Salary);
	}

}
