import java.util.*;

public class peep{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array: ");
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
			System.out.println("Do you want to peep an element? yes=1 and no=0");
			int ans=sc.nextInt();
			if(ans==1){
				System.out.println("Enter a ith value to remove from top= ");
				int x=sc.nextInt();
				
				if((top-x+1)<=0){
				System.out.println("Stack under0flow");
				System.out.println("NO element ,okkay!");
				break;
			}
			else{
				System.out.println("peep element is : "+a[top-x+1]);
				}

			}
			else{
				break;
			}
			
		}

		System.out.println(" array remains as it is:");
		for(i=0;i<top;i++){
			System.out.println(a[i]);
		}
		}
}