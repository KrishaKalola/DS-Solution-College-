

import java.util.Stack;
 
public class evaluationPrifix{
    
static boolean isOperator(char x)
{
    switch(x)
    {
        case '+':
        case '-':
        case '*':
        case '/':
        case '^':
        case '%':
            return true;
    }
    return false;
}
 
public static String convert(String str)
{
    Stack<String> stack = new Stack<>();
     
    int l = str.length();
     
    for(int i = l - 1; i >= 0; i--)
    {
        char c = str.charAt(i);
        if (isOperator(c))
        {
            String op1 = stack.pop();
            String op2 = stack.pop();
             
            String temp = "(" + op1 + c + op2 + ")";
            stack.push(temp);
        }
        else
        {
             
            stack.push(c + "");
        }
    }
    return stack.pop();
}
 
public static void main(String[] args)
{
	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter a prifix Expresion");
        String exp = sc.nextLine();
       
    System.out.println("Infix : " + convert(exp));
}
}
