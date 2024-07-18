import java.util.*;
public class Lab17{
	public static void main(String args[]){
		int a;
		System.out.println("Enter value of a");
		Scanner sc= new  Scanner(System.in);
		a=sc.nextInt();
		int count=0,i=0;
		for(i=1;i<=a;i++){
			if(a%i==0){
				count++;
			}
		}
		if(count==2){
			System.out.println("prime");
		}
		else{
		System.out.println("not prime");
	}
	}
}