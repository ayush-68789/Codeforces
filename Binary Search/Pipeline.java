import java.util.*;
public class Pipeline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() ;
        long k = sc.nextLong() ;
        if (n == 1) {
            System.out.println(0);
            sc.close();
            return;
        }
        long sum = sum(k-1) ;
        n = n-1 ;
        if(sum < n)
        {
            System.out.println(-1);
        }
        else
        {
            long low = 0; 
            long high = k-1 ; 
            while(low <= high)
            {
                long mid = low + (high-low) /2 ; 
                if(sum - sum(mid) >= n)
                {
                    low = mid + 1 ;
                }
                else
                {
                    high = mid -1 ; 
                }
            }
            System.out.println(k - low);
        }
        sc.close();
    }

    public static long sum (long n)
    {
        long ans = (n * (n+1)) /2; 
        return ans ;
    }
}
