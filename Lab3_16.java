import java.util.*;

public class Lab3_16{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0;

		System.out.println("Enter a size of an array: ");
		int n=sc.nextInt();

		int a[] =new int [n];
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter Location : ");
		int x=sc.nextInt();
		
		int b[]=new int [n-1];

		for(i=0;i<(n-1);i++){
			
			if(i<x){
				b[i]=a[i];
			}
			else if(i>=x){
				b[i]=a[i+1];
			}
		}
		for (i=0;i<=(n-1) ;i++ ) {
			System.out.println(b[i]+" ");
		}
	}
}