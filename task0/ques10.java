import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("please enter coefficients of (a)(x^2)+b(x^1)+c as -- a , b , c ");
	 int a=sc.nextInt();
	 int b=sc.nextInt();
	 int c=sc.nextInt();
	 int D= (b*b) - (4*a*c);
	 System.out.println("discriminent is "+D);
	 double r1=0,r2=0;
	 if(D>0)
	 {
	     System.out.println("real roots ");
	     r1 = ((-b) + Math.sqrt(D))/(2*a);
	    r2 =((-b)- Math.sqrt(D))/(2*a);
	 }
	else
	System.out.println("imaginary");
	
	System.out.println(r1);
		System.out.println(r2);
	 }
	 
	    
	
}
 