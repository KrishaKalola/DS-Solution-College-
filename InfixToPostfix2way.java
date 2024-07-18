import java.io.*;
import java.util.*;
import java.util.Stack;

public class InfixToPostfix2way{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);

		System.out.println("Enter a string:");
		String infix=sc.nextLine();

		solution(infix);

		
	}
	public static void solution(String infix){
		xyz obj=new xyz();
		Stack<Character> s = new Stack<Character>();

		int i=0;
		int top=0;
		String polish="";
		int rank=0;

		char next=infix.charAt(0);
		
		char temp;
		s.push('(');

		while(next!=' '){
			if(top<0){
				System.out.println("Invalid String");
				break;
			}
			
			while(obj.funcF(s.peek())>obj.funcG(next)){
				temp=s.pop();
				top--;
				polish=polish+temp;
				rank=rank+obj.rank(next);
				if(rank<1){
					System.out.println("Invalid String");
					break;
				}
			}
			if(obj.funcG(s.peek())!=obj.funcF(next)){
				top++;
				s.push(next);

			}
			else{
				s.pop();
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
		int f=-1;
		if(c=='+' || c=='-'){
			f=1;
		}
		else if(c=='*' || c=='/'){
			f=3;
		}
		else if(c=='^'){
			f=6;
		}
		else if((c>='a'&& c<='z')||(c>='A' && c<='Z')){
			f=7;
		}
		else if(c=='('){
			f=9;
		}
		else if(c==')'){
			f=0;
		}
		return f;
	}

	public int funcG(char c){
		int g=-1;
		if(c=='+' || c=='-'){
			g=2;
		}
		else if(c=='*' || c=='/'){
			g=4;
		}
		else if(c=='^'){
			g=5;
		}
		else if((c>='a'&& c<='z')|| (c>='A'&& c<='Z')){
			g=8;
		}
		else if(c=='('){
			g=0;
		}
		return g;
	}

	public int rank(char c){
		int r=0;
		if(c=='+'|| c=='-'|| c=='*'|| c=='/' ||c=='^'){
			r=-1;
		}
		else{
			r=1;
		}
		return r;
	}
}
