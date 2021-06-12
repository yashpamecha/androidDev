import java.util.Scanner;
public class MyClass {
    public static void main(String args[]) {
     Scanner sc=new Scanner(System.in);
     System.out.println(" Enter string");
     
    String s=sc.nextLine();
     
     System.out.println("string is "+Check(s));
     
     
     
     
     
     
     
         }
         
    public static String Check(String s)
    {
        if(s==null)
        return "null";
        else if(s.isEmpty())
        return "empty";
        else
        return "not empty nor null";
        
    }
    
         
         
         
}