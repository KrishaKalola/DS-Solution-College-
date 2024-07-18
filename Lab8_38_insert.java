
import java.util.*;

public class Lab8_38_insert{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array : ");
		int n=sc.nextInt();

		int a[]=new int [n];

		for(int i=0;i<n;i++){
			System.out.println("Do you want to enter an element? yes==1 and or==0");
			int ans=sc.nextInt();
			if(ans==1){
			System.out.println("Enter an element");
			int x=sc.nextInt();
			a[i]=x;
			}
			else{
				break;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(a[i]);
		}

		
		}
}