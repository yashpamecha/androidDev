import java.util.Scanner;
public class Modify {
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
     String s=sc.nextLine();
     String replaced=sc.nextLine();
    String ans= modify(s,replaced);
    System.out.println(ans);
     
     }
     
     public static String modify(String s,String replaced)
     {   String s1= new String();
         for(int i=0;i<replaced.length()-1;i=i+2)
         {
             for(int j=0;j<s.length();j++)
             {
                 if(replaced.charAt(i)==s.charAt(j))
               s= s.replace(s.charAt(j),replaced.charAt(i+1));
             }
         }
              return s;
 
     
    }
    
    
}
     