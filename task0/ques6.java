import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter a ");
	  int a=sc.nextInt();
	  	System.out.print("enter b ");
	  int b=sc.nextInt();
	  
	 System.out.println("before swapping "+" a= "+a+"\nb= "+b);
	 int temp;
	 temp=a;
	 a=b;
	 b=temp;
	  System.out.println("after swapping "+" a= "+a+"\nb= "+b);
	}
}
