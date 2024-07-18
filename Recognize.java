import java.util.*;

public class Recognize{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Plzz provide a space after writinging a string.");
		System.out.println("enter a String : ");
		String x=sc.nextLine();
		char a[]= new char [x.length()];

		int top=0;
		top=1;
		a[top]='c';

		char next=x.charAt(1);
		int i=2;

		while(next!='c'){
			if(next==' '){
				System.out.println("Invalid String ");
				break;
			}
			else{
				top++;
				a[top]=next;
				next= x.charAt(i);
				i++;
			}
		}

		while(a[top]!='c'){
			next=x.charAt(i);
			int y=a[top];
			if(next!=y){
				System.out.println("Invalid String ");
				break;
			}
			top--;
			i++;
		}
		
		next= x.charAt(i+1);
		// System.out.println("Next "+next);
		//step1 to solve error check where invalid string is occur
		//then check space error
		//then check which charchter is comming and becoz of which error is occur

		if(next==' '){
			System.out.println("Valid String");
		}
		else{
			System.out.println("Invalid String ");
		}
		
		}
}