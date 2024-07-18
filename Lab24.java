public class Lab22{
	public static void main(String[] arg){
		Scanner sc=new Scanner();
		System.out.println("Enter size of an array : ");
		int n=sc.nextInt();
		
		int arr[]=new int arr[n];
		for(i=0;i<n;i++){
			System.out.println("Enter value ");
			arr[i]=sc.nextInt();
		}

		for(i=0;i<n;i++){
			ans=(arr[i]>arr[i+1])?arr[i+1]:arr[i];
		}
		for(i=0;i<n;i++){
			if(arr[i]==ans){
				System.out.println("Location is "+i);
			}
		}
		}
}