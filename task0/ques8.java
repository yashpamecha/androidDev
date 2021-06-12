import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.print("please enter a alphabate you want to verify ");
	 char c=sc.nextLine().charAt(0);
	 if((c>='a' && c<='z') || (c>='A' && c<='Z') ){
	 if(c=='a' || c=='e' || c=='i' || c=='O' || c=='u')
	 System.out.println("Vowel");
	 else if (c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
	 System.out.println("Vowel");
	 else
	 System.out.println("Consonents");
	 
	 }
	 
	    
	}
}
