
import java.util.*;

public class Queue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array : ");
		int n=sc.nextInt();

		xyz obj=new xyz(n);

		obj.insert(n);
		obj.delete(n);
		
		}
}
class xyz{
	int top;
	int a[];
	int front;
	int rare;
	xyz(int n){
		a=new int[n];
		top=0;
	}
	void insert(int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("***********insert***********");
		front=0;
		rare=0;
		for(int i=0;i<n;i++){
			System.out.println("Do you want to enter an element? yes==1 and or==0");
			int ans=sc.nextInt();
			if(ans==1){
				if(rare>=n){
					System.out.println("Queue overflow");
					break;
				}
				else{

						System.out.println("Enter an element");
						int x=sc.nextInt();
						rare++;
						a[rare-1]=x;
							if(front==0){
									front=1;
							}	
				}
			}
			else{
				break;
			}
		}

		System.out.println("Final array is :");
		for(int i=0;i<rare;i++){
			System.out.println(a[i]);
		}
	}
	void delete(int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("*********delete***********");
		
		for(int i=0;i<rare;i++){
			System.out.println("Do you want to delete an element? yes==1 and or==0");
			int ans=sc.nextInt();
			if(ans==1){
					if(front==0){
						System.out.println("Queue UnderFlow");
						break;
					}
					else{
						int y=a[front-1];
						System.out.println("Deleted element is: "+y);
							if(front==rare){
								front=0;
								rare=0;
							}
							else{
								front++;
							}
					}
				}	
			else{
				break;
			}
		}
		System.out.println("Final array is :");
		if(front==0){
			System.out.println("Array is now empty");
		}
		else{
			for(int i=(front-1);i<rare;i++){
			System.out.println(a[i]);
			}	
		}

	}
}