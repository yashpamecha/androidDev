import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter a and b ");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
	  
	  int quotient=a/b;
	  int rem= a%b;
	  System.out.println("quotient is"+quotient+"\nremainder is "+rem );
	}
}
