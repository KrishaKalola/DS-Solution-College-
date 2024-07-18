import java.util.*;
public class Lab13{
	public static void main(String args[]){
		char x;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a letter");

		x=sc.next().charAt(0);

		if(x=='a' || x=='e'||x=='i'||x=='o'||x=='u'){
			System.out.println("Vowel");
		}
		else {
			System.out.println("consonent");
		}
	}
}