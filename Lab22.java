import java.util.*;

public class Lab22{
	public static void main(String[] arg){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value of m: ");
		int m=sc.nextInt();
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();

		int	a=(m>n)?n:m;
		int b=(m>n)?m:n;
		int count=0;
		for(int i=a;i<=b;i++){
			count=count+i;
		}
		System.out.println("Summation of m to n is ="+count);
	}
}