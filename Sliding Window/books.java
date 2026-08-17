import java.util.Scanner;

/**
 * books
 */
public class books {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int t = sc.nextInt() ;
        int [] arr = new int [n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            arr[i] = sc.nextInt() ; 
        }

        int low = 0 ; 
        int high = 0 ;
        int read = 0 ; 
        int max = 0 ; 
        while(high < n)
        {
            read += arr[high] ;
            while(read > t)
            {
                read = read - arr[low] ; 
                low ++ ; 
            }
            max = Math.max(max , high-low+1) ; 
            high ++ ; 
        }
        System.out.println(max);
        sc.close();
    }
}