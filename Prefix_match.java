import java.util.Scanner;
// import java.util.stream.Gatherer.Integrator;

public class Prefix_match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test -- > 0)
        {
            int n = sc.nextInt() ; 
            int [] arr = new int[n] ;
            int max = Integer.MIN_VALUE ;  
            int sum = 0 ; 
            int idx = 0 ; 
            for(int i = 0 ;i < arr.length ; i++)
            {
                arr[i] = sc.nextInt() ; 
                if(max < arr[i])
                {
                    max = arr[i] ; 
                    idx = i ;
                }
            }
            // System.out.println(max+idx); 
            int temp = arr[0] ;
            arr[0] = arr[idx] ; 
            arr[idx] = temp ; 
            int newmax = Integer.MIN_VALUE ; 
            for (int i = 0; i < arr.length; i++) 
            {
                newmax = Math.max(newmax, arr[i]) ;
                sum += newmax ; 
            }
            System.out.println(sum);
        }
        sc.close();
    }
}
