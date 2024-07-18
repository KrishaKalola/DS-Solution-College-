//Lab3_15_secand_way
//Secand way using only one array.
import java.util.*;

public class Lab3_15_secand_way{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0;

		System.out.println("Enter a size of an array: ");
		int n=sc.nextInt();

		int a[] =new int [n+1];
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter Location : ");
		int x=sc.nextInt();
		System.out.println("Enter value: ");
		int y=sc.nextInt();

		

		for(i=(n-1);i>x;i--){
			a[i+1]=a[i];
		}
		a[x]=y;
		for (i=0;i<=n ;i++ ) {
			System.out.println(a[i]+" ");
		}
	}
}