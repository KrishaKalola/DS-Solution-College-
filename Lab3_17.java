import java.util.*;
//using only one array............
public class Lab3_17{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0;

		System.out.println("Enter a size of an array: ");
		int n=sc.nextInt();
		xyz obj=new xyz();

		obj.method(n);
		
	}
}
class xyz{
	void method(int n){
		Scanner sc=new Scanner(System.in);
		int a[] =new int [n+1];
		int i=0,j=0;
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter value of a number to insert : ");
		int x=sc.nextInt();
		int index=0;
		for(i=0;i<n;i++){
			if( a[i]>x){
				 index=i;
				break;
			}
		}

		for(i=(n-1);i>=index;i--){ 
        a[i+1]=a[i];
        } 
        a[index]=x;
		for (i=0;i<=n ;i++ ) {
			System.out.println(a[i]);
		}
	}
}