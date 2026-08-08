import java.util.Scanner;

public class Yet_another_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            int n = sc.nextInt() ; 
            int [] arr = new int[n] ;
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt() ;
            }

            long hcf = 0 ; 
            for(int i = 0 ; i < n ; i++)
            {
                hcf = gcd(hcf , arr[i]) ;
            }

            if(hcf == 1 )
            {
                System.out.println(2);
                continue ; // agle test case pr bdho baaki skip krdo 
            }

            boolean found = false ;
            for (int i = 2; i < 51 ; i++) {
                if(gcd(hcf, i) == 1)
                {
                    System.out.println(i);
                    found = true ; 
                    break ;
                }
            }

            if(!found)
            {
                System.out.println(-1);
            }
        }
        sc.close();
    }
    public static long gcd(long a,long b)
    {
        while (b != 0 ) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a ;  
    }
}
