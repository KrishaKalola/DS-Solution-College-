import java.util.*;

public class Lab3_21{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		

		
		xyz obj=new xyz();
		obj.method();
		
	}
}
class xyz{
	void method(){
		int i=0,j=0;
		Scanner sc=new Scanner(System.in);
		int a[][] =new int [3][2];
		int b[][] =new int [2][3];
		for(i=0;i<3;i++){
			for(j=0;j<2;j++){
				System.out.println("Enter value ");
			a[i][j]=sc.nextInt();
			}
			
		}
		for(i=0;i<2;i++){
			for(j=0;j<3;j++){
				System.out.println("Enter value ");
			b[i][j]=sc.nextInt();
			}
			
		}
		int c[][] =new int[3][3];
		
		for(i=0;i<3;i++){
			for(j=0;j<3;j++){
				
					c[i][j]=(a[i][0]*b[0][j])+(a[i][1]*b[1][j]);
				
			}
		}
 
		
		
		for (i=0;i<3 ;i++ ) {
			for (j=0;j<3;j++ ) {
			System.out.println(c[i][j]);
			}
		}
	}
}