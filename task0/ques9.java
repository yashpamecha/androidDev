import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("please enter a , b , c ");
	
	int a=sc.nextInt();
		int b=sc.nextInt();
			int c=sc.nextInt();
			int largest= a>b?a>c?a:c:b>c?b:c;
	System.out.println("largest element is "+largest);
	
	
	
	 }
	 
	    
	
}
