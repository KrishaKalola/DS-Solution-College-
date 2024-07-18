public class Lab23{
	public static void main(String[] arg){
		Scanner sc=new Scanner();
		System.out.println("Enter value of n: ");
		int n=sc.nextInt();
		
		int i,sum=0;
		for(i=1;i<=n;i++){
			sum=sum +i;
		}
		int ans=(sum/n);
		System.out.println("average is: "+ans);
		}
}