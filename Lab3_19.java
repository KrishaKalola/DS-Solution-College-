import java.util.*;

public class Lab3_19{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0;

		System.out.println("Enter a size of an array-a: ");
		int n=sc.nextInt();
		System.out.println("Enter a size of an array-b: ");
		int m=sc.nextInt();

		xyz obj=new xyz();
		obj.method(n,m);
		
	}
}
class xyz{
	void method(int n,int m){
		int i=0;
		Scanner sc=new Scanner(System.in);
		int a[] =new int [n];
		int b[] =new int [m];
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			a[i]=sc.nextInt();
		}
		for(i=0;i<m;i++){
			System.out.println("Enter value ");
			b[i]=sc.nextInt();
		}

		int c[] =new int[n+m];

		for(i=0;i<n;i++){
			c[i]=a[i];
		}
		
		for (int j=0; j<m ;j++ ) {
				c[j+n]=b[j];
		}
		
		for (i=0;i<(n+m) ;i++ ) {
			System.out.println(c[i]);
		}
	}
}