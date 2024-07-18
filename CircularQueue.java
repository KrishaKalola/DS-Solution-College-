
import java.util.*;

public class CircularQueue{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a size of an array : ");
		int n=sc.nextInt();

		xyz obj=new xyz(n);

		while (1!=0) {
			System.out.println("Press 1 for insert and 0 for delete and press 2 to exit the progrram:");
			int aans=sc.nextInt();
			if(aans==1){
				obj.insert(n);
			}
			else if(aans==0){
	   			obj.delete(n);				
			}
			else{
				obj.display();
				break;
			}

		}
		}
}
class xyz{
	int top;
	int a[];
	int front=0;
	int rare=0;
	xyz(int n){
		a=new int[n];
		top=0;
	}


	void insert(int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("***********insert***********");
				System.out.println("Enter an element");
						int x=sc.nextInt();
						
				if(rare>=n && front==1){
					System.out.println("Queue overflow");
					
				}
				else if(rare==n && front!=1){
					rare=1;
					a[rare-1]=x;
				}
				else if(front==0 && rare==0){
						rare++;
						if(front==0){
						front=1;							
						}
						a[rare-1]=x;
				}
		
	}
	void delete(int n){
		Scanner sc=new Scanner(System.in);
		System.out.println("*********delete***********");
		
					if(front==0 ){
						System.out.println("Queue UnderFlow");
					}
					else{
						int y=a[front-1];
						System.out.println("Deleted element is: "+y);
							if(front==rare){
								front=0;
								rare=0;
							}
							if(front==n ){
									front=1;
							}
							else{
								front++;
							}
					}
			
		
	}
	void display(){

			System.out.println("Final array is: ");
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