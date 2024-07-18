import java.util.*;

public class Stack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array: ");
		int n=sc.nextInt();

		
		xyz obj=new xyz(n);
		
		obj.push(n);
		obj.pop(n);
		obj.peep(n);
		obj.change(n);
		
	}
}
class xyz{
	int top;
	int a[];
	xyz(int n){
		a=new int[n];
		top=0;
	}
	//************PUSH*************
	void push(int n){
		System.out.println("**********PUSH**********");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++){
			System.out.println("Enter value of x: ");
			int x=sa.nextInt();

			if(top>=n){
				System.out.println("Stack overflow");
				break;
			}
			else{
				top++;
				a[i]=x;
			}

		}
		System.out.println("Final array is :");
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		}

		//*************POP****************
		void pop(int n){
		
			System.out.println("***********POP**********");
		Scanner sc=new Scanner(System.in);
		
		top=(n-1);

		for(int i=0;i<n;i++){
			System.out.println("Do you want to pop an element? yes=1 and no=0");
			int ans=sc.nextInt();
			if(ans==1){
				if(top==0){
				System.out.println("Stack under0flow");
				break;
			}
			else{
				top=top-1;
				}

			}
			else{
				break;
			}
			
		}

		System.out.println("Final array is:");
		for(int i=0;i<=top;i++){
			System.out.println(a[i]);
		}
		}
		//***************PEEP****************
	void peep(int n){
		
		System.out.println("************PEEP************");
		Scanner sc=new Scanner(System.in);
	
		top=(n-1);
		
		for(int i=0;i<n;i++){
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
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}
		}

		//****************CHANGE***********
	void change(int n){
		System.out.println("*************change**********");
		Scanner sc=new Scanner(System.in);
		
		int i=0;
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