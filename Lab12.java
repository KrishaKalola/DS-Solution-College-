import java.util.*;
public class Lab12{
	public static void main(String args[]){
		int a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextInt();
		if(a%2==0){
			System.out.println("Given number is even");
		}
		else{
			System.out.println("Given no.is odd");
		}

	}
}