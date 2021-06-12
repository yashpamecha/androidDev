import java.util.Scanner;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 int cnt=0;
	 String s=sc.nextLine();
	 System.out.println("enter char that you want to check ");
	 char c=sc.nextLine().charAt(0);
	 for(int i=0;i<s.length();i++)
	 {
	     if(c == s.charAt(i))
	     cnt++;
	 }
	 System.out.println(cnt);
	 
	 
	
	 }
	 
	    
	
}
 