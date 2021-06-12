import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter num ");
     
     float num=(float)sc.nextDouble();
     
   System.out.println("rounded num up to two digits");
     System.out.format("%.2f",num);
     
     
     
     
         }
}