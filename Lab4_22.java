import java.util.*;

public class Lab4_22{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int a=sc.nextInt();

		
		xyz obj=new xyz();
		obj.method(a);
		
	}
}
class xyz{
	void method(int a){
		int temp =a,sum=0,r=0;
		while(a>0){
			r=a%10;
			sum=(sum*10)+r;
			a=a/10|0;
		}

		System.out.println("Swiped number is: "+ sum);		
	}
}