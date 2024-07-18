import java.util.*;
//Using three looops....
public class Lab3_21_secand_way{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		

		
		xyz obj=new xyz();
		obj.method();
		
	}
}
class xyz{
	void method(){
		int i=0,j=0,k=0;
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
				c[i][j]=0;
				for(k=0;k<2;k++)
					c[i][j]=c[i][j]+(a[i][k]*b[k][j]);
				
			}
		}
 
		
		
		for (i=0;i<3 ;i++ ) {
			for (j=0;j<3;j++ ) {
			System.out.println(c[i][j]);
			}
		}
	}
}