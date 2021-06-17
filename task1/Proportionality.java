
import java.util.Scanner;


public class Proportionality{


        public static int isDirectlyProportional(int[] arr1, int[] arr2,int n) {
           int ans=1;
            for(int i=0;i<n;i++)
            {
                if(arr1[i] % arr2[i]==0 || arr2[i] % arr1[i]==0)
                ans= 1;
                else 
                { ans = 0;
                break;
                    
                }
            }
            return ans;
          
}
        

        public static void main(String[] args) 
        {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int b;

            int[] arr1 = new int[n];
            int[] arr2=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("enter "+i+" value");
                arr1[i]=sc.nextInt();
            }
            for(int j=0;j<n;j++){
                 System.out.println("enter "+j+" value");
                arr2[j]=sc.nextInt();
            }
         b  =  isDirectlyProportional(arr1,arr2,n);
         if(b==1)
         System.out.println("proportional");
         else
         System.out.print("not proportional");
    }
}