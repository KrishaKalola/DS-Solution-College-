import java.util.*;

public class InfixToPostfix{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		xyz obj=new xyz();
		System.out.println("Enter a string:");
		String infix=sc.nextLine();

		int top=0;
		String polish="";
		int rank=0;
		char arr[]=new char[infix.length()];

		char next=infix.charAt(0);
		int i=0;
		char temp;
		arr[0]='(';

		while(next!=' '){
			if(top<0){
				System.out.println("Invalid String");
				break;
			}
			while(obj.funcF(arr[top])>obj.funcG(next)){
				temp=arr[top];
				polish=polish+temp;
				rank=rank+obj.rank(next);
				if(rank<1){
					System.out.println("Invalid String");
					break;
				}
			}
			if(obj.funcG(arr[top])!=obj.funcF(next)){
				top++;
				arr[top]=next;
			}
			else{
				top--;
			}
			i++;
			next= infix.charAt(i);
		}

		if(top!=-1 || rank!=1){
			System.out.println("Invalid String");
		}
		else{
			System.out.println("Valid String");
		}

		System.out.println("Postfix form is :"+ polish);

	}

}

class xyz{

	public int funcF(char c){
		
		if(c=='+' || c=='-'){
		return 1;
		}
		else if(c=='*' || c=='/'){
		return 3;
		}
		else if(c=='^'){
		return 6;
		}
		else if((c>='a'&& c<='z')||(c>='A' && c<='Z')){
		return 7;
		}
		else if(c=='('){
		return 9;
		}
		else if(c==')'){
		return 0;
		}
	}

	public int funcG(char c){
		
		if(c=='+' || c=='-'){
		return 2;
		}
		else if(c=='*' || c=='/'){
		return 4;
		}
		else if(c=='^'){
		return 5;
		}
		else if((c>='a'&& c<='z')|| (c>='A'&& c<='Z')){
		return 8;
		}
		else if(c=='('){
		return 0;
		}
	}

	public int rank(char c){
		
		if(c=='+'|| c=='-'|| c=='*'|| c=='/' ||c=='^'){
		return -1;
		}
		else{
		return 1;
		}
	}
}