import java.util.*;
//using only one array............
public class Lab3_18{
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
		int a[] =new int [n];
		int i=0,j=0;
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			a[i]=sc.nextInt();
		}

		System.out.println("Enter value of a number to delete : ");
		int x=sc.nextInt();
		int index=0;
		for(i=0;i<n;i++){
			if( a[i]>x){
				 index=i;
				break;
			}
		}

		for(i=(index-1);i<(n-1);i++){ 
        a[i]=a[i+1];
        } 
		for (i=0;i<(n-1) ;i++ ) {
			System.out.println(a[i]);
		}
	}
}