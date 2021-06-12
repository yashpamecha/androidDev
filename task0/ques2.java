import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first int ");
		int a=sc.nextInt();
		System.out.print("enter second int ");
		int b= sc.nextInt();
		int sum=0;
		sum=a+b;
		System.out.println("sum of numbers is "+sum);
	}
}
