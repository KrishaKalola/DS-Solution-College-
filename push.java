import java.util.*;

public class push{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number: ");
		int n=sc.nextInt();

		
		xyz obj=new xyz();
		obj.method(n);
		
	}
}
class xyz{
	void method(int n){
		Scanner sc=new Scanner(System.in);
		int a[]=new int [n];
		int top=0;
		for(int i=0;i<n;i++){
			System.out.println("Enter value of x: ");
			int x=sc.nextInt();

			if(top>=n){
				System.out.println("Stack overflow");
				break;
			}
			else{
				top++;
				a[i]=x;
			}

		}

		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		}
}