    import java.util.Scanner;

    public class Destruction_of_Dandelions {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in) ;
            int test = sc.nextInt() ;
            while(test > 0)
            {
                int n = sc.nextInt() ; 
                long[] res = new long[n] ; 
                for(int i = 0 ; i < n ; i++)
                {
                    res[i] = sc.nextLong() ;
                }

                long total = 0 ; 
                int oddcount = 0 ;
                long minOdd = Long.MAX_VALUE ; 

                for(long num : res)
                {
                    total += num ;
                    if(num % 2 != 0)
                    {
                        oddcount++ ;
                        minOdd = Math.min(num, minOdd) ;
                    }
                }
                if(oddcount == 0)
                {
                    System.out.println(0);
                }
                else if(oddcount % 2 == 1)
                {
                    System.out.println(total);
                }
                else{
                    System.out.println(total-minOdd);
                }
                test-- ;
            }
        }
    }
