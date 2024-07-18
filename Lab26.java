public class Lab26{
	public static void main(String[] arg){
		Scanner sc=new Scanner();
		System.out.println("Enter size of an array : ");
		int n=sc.nextInt();
		
		int arr[]=new int arr[n];
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			arr[i]=sc.nextInt();
		}

		System.out.println("Enter the value you wantto replace: ");
		int a=sc.nextInt();
		System.out.println("Enter the new value: ");
		int b=sc.nextInt();
		

		for(i=0;i<n;i++){
			if(arr[i]==a){
				arr[i]==b;
				System.out.println("index(Location) is: "+i);
			}	
			}
		for(int j=0;j<n;j++){
			System.out.println(arr[i]);
		}					
		}
}