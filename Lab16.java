import java.util.*;
public class Lab16{
	public static void main(String args[]){
		Scanner sc= new  Scanner(System.in);

		int x,y;
		System.out.println("Enter value of x");
				x=sc.nextInt();
		System.out.println("Enter value of y");
					y=sc.nextInt();
		
		int ans=1;
		for(int i=1;i<=y;i++){
			ans=ans*x;
		}
		System.out.println("Ans is "+ans);
	}
}