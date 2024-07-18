import java.util.*;

public class Lab3_20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int i=0;

		int j=0;
		int a[][] =new int [2][2];

		int b[][] =new int [2][2];
		
		for(i=0;i<2;i++){
			for (j=0;j<2 ;j++) {
				System.out.println("Enter value: ");
				a[i][j]=sc.nextInt();
			}
		}
		for(i=0;i<2;i++){
			for (j=0;j<2 ;j++) {
				System.out.println("Enter value: ");
				b[i][j]=sc.nextInt();
			}
		}
		int c[][]=new int [2][2];

		for(i=0;i<2;i++){
			for(j=0;j<2;j++){
				c[i][j]=a[i][j]+b[i][j];
			}
		}
		for (i=0;i<2 ;i++ ) {
			for(j=0;j<2;j++){
				System.out.println(c[i][j]);
			}
		}
	}
}