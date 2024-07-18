import java.util.*;

public class Lab5_30{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String: ");
		String x=sc.nextLine();

		char a[] =new char [x.length()];
		int top=0,count=0;
		for(int i=0;i<x.length();i++){

			a[top]=x.charAt(i);
			if(a[top]=='a'){
				count++;
			}
			else if(a[top]=='b'){
				count--;
			}
			else{
				System.out.println("Invalid String");
				break;
			}
			top++;
		}
		if(count==0){
			System.out.println("Valid String");
		}
		else{
			System.out.println("Invalid String");
		}


		
		}
}