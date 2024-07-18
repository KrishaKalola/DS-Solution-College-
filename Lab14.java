import java.util.*;
public class Lab14{
	public static void main(String args[]){
		int a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextInt();
		int ans=1;
		for(int i=1;i<=a;i++){
			ans=ans*i;
		}
		System.out.println("Factorial  is "+ ans);
	}
}