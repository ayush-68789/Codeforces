import java.util.Arrays;
import java.util.Scanner;

/**
 * Interesting_drink
 */
public class Interesting_drink {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ;
        int [] bottles = new int[n] ; 
        for(int i = 0; i < n ; i ++)
        {
            bottles [i] = sc.nextInt() ; 
        }   
        int q = sc.nextInt() ;
        int [] coins = new int[q] ;
        for(int i =0 ; i < q ; i++)
        {
            coins[i] = sc.nextInt() ; 
        }
        Arrays.sort(bottles) ; 
        for(int i = 0 ; i < q ; i++)
        {
            int target = coins[i] ; 
            int low = 0 ;
            int high = n-1 ; 
            int ans = -1 ; 
            while(low <= high)
            {
                int mid = low + (high-low) / 2 ; 
                if(bottles[mid] <= target)
                {
                    ans = mid ; 
                    low = mid + 1 ;
                }
                else
                {
                    high = mid - 1 ; 
                }
            }
            if(ans == -1) 
            {
                System.out.println(0);
            }
            else
            {
                System.out.println(ans+1);
            }
        }
        sc.close();
    }
}