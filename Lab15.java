import java.util.*;
public class Lab15{
	public static void main(String args[]){
		int a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextInt();
		 
		int x=fact(a);
		System.out.println("answer is "+ x);
	}
	public static int fact(int n){
		if (n==1){
			return 1;
		}
		else{
			return n*fact(n-1);
		}
	}
}