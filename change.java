import java.util.*;

public class change{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an: ");
		int n=sc.nextInt();

		
		xyz obj=new xyz();
		obj.method(n);
		
	}
}
class xyz{
	void method(int n){
		Scanner sc=new Scanner(System.in);
		int a[]=new int [n];
		int top=0,i=0;
		for(i=0;i<n;i++){
			System.out.println("Enter values: ");
			a[i]=sc.nextInt();
		}
		top=(n-1);
		
		for( i=0;i<n;i++){
			System.out.println("Do you want to change an element? yes=1 and no=0");
			int ans=sc.nextInt();
			if(ans==1){
				System.out.println("Enter a ith value to change from top= ");
				int x=sc.nextInt();
				
				System.out.println("Enter a value to replace the original value= ");
				int y=sc.nextInt();

				if((top-x+1)<=0){
				System.out.println("Stack under0flow");
				System.out.println("NO element ,okkay!");
				break;
			}
			else{
				a[top-x+1]=y;
				}

			}
			else{
				break;
			}
			
		}

		System.out.println("final array is:");
		for(i=0;i<n;i++){
			System.out.println(a[i]);
		}
		}
}