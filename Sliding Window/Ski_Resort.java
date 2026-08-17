import java.util.Scanner;

public class Ski_Resort {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int test = sc.nextInt() ; 
        while(test -- > 0)
        {
            int n = sc.nextInt() ; 
            long k = sc.nextInt() ; 
            int q = sc.nextInt() ;
            int [] arr = new int [n] ; 
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt() ; 
            }
            int low = 0 ; 
            int high = 0 ; 
            long cnt = 0 ; 
            while(high < arr.length) 
            {
                if(arr[high] > q)
                {
                    long size = high - low ; 
                    if(size >= k)
                    {
                        cnt += ((size - (long)k + 1L) * (size - (long)k + 2L)) / 2;
                    }
                    low = high + 1 ; 
                }
                high ++ ; 
            }
            long size = high - low;
            if (size >= k) {
                cnt += ((size - (long)k + 1L) * (size - (long)k + 2L)) / 2 ;
            }
            System.out.println(cnt) ;
        }
        sc.close();
    }
}
