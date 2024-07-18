import java.util.*;
public class Lab18{
	public static void main(String args[]){
		int a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextInt();
		
		for(int i=1;i<=a;i++){
			if(a%i==0){
				System.out.println("factor is "+i);
			}
		}

		
	}
}