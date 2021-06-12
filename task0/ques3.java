import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("enter first float ");
		float a=(float)sc.nextFloat();
		System.out.print("enter second float ");
		float b=(float)sc.nextFloat();
		float product =0.0f;
		product=a*b;
		System.out.println("sum of numbers is "+product);
	}
}
