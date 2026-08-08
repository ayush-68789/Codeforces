import java.util.Scanner;

public class out_of_memoryError {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int test = sc.nextInt() ; 
        while (test -- > 0) 
        {
            int n = sc.nextInt() ; 
            int m = sc.nextInt() ; 
            int h = sc.nextInt() ; 
            int [] arr = new int[n] ;
            int [] copy = new int[n] ;

            for (int i = 0; i < arr.length; i++) 
            {
                arr[i] = sc.nextInt() ;
                copy[i] = arr[i] ;
            }
        
            while(m-- > 0)
            {
                int idx = sc.nextInt() ; 
                int num = sc.nextInt() ;
                arr[idx-1] += num ;
                if(arr[idx-1] > h)
                {
                    for (int i = 0; i < arr.length; i++) 
                    {
                        arr[i] = copy[i] ;
                    }
                }
            }

            // op
            for (int i = 0; i < arr.length; i++) 
            {
                System.out.print(arr[i]+ " ");
            }
        }
        sc.close();

    }
}
