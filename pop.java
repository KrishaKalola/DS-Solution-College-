import java.util.*;

public class pop{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter size of an array: ");
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
			top++;
		}


		for( i=0;i<n;i++){
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
		for(i=0;i<top;i++){
			System.out.println(a[i]);
		}
		}
}