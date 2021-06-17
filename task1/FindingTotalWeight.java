import java.util.Scanner;
public class FindingTotalWeight{
    public static void main(String args[]) {
     Scanner sc= new Scanner(System.in);
   String s=sc.nextLine();
   int weight[]=new int[26];
   System.out.println("enter size of weight array");
   int n=sc.nextInt();
   System.out.println("enter weights now");
   for(int i=0;i<n;i++)
   {
       weight[i]=sc.nextInt();
   }
   
   int sum= totalWeight(s,weight);
   
   System.out.println(sum);
   
   
     
     }
     
  
  public static int totalWeight(String s, int[] weight)
  { int sum=0;
     for(char c: s.toCharArray())
     {
         sum=sum+(weight[c-'A']);
     }
      return sum;
      
  }
  
  
     
    }
