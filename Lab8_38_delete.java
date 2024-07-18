
import java.util.*;

public class Lab8_38_delete{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array : ");
		int n=sc.nextInt();

		int a[]=new int [n];
		for(int i=0;i<n;i++){
			System.out.println("Enter an element: ");
			a[i]=sc.nextInt();
		}
		int j=n;
		for(int i=0;i<n;i++){
			System.out.println("Do you want to delete an element? yes==1 and or==0");
			int ans=sc.nextInt();
			if(ans==1){
				j--;
				for(int k=0;k<j;k++){
					a[k]=a[k+1];
				}
			}
			else{
				break;
			}
		}
		for(int i=0;i<j;i++){
			System.out.println(a[i]);
		}

		
		}
}