import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("please enter a number you want to verify ");
	    int a=sc.nextInt();
	    if(a%2==0)
	    System.out.println("Even");
	    else 
	    System.out.println("Odd");
	    
	}
}
