import java.util.*;
public class Lab11{
	public static void main(String args[]){
		double a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextDouble();
		double area;
		area= 3.14*a*a;

		System.out.println("Area of circle is "+area);
	}
}