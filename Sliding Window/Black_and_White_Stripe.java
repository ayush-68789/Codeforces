import java.util.Scanner;

/**
 * Black_and_White_Stripe
 */
public class Black_and_White_Stripe {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ; 
        int test = sc.nextInt() ; 
        while(test -- > 0)
        {
            int n = sc.nextInt() ;
            int k = sc.nextInt() ; 
            String st = sc.next() ; 
            
            int low = 0 ;
            int high = 0 ; 
            int white = 0 ;
            int min = Integer.MAX_VALUE ;
            while(high < n)
            {
                char ch = st.charAt(high) ; 
                
                high ++ ;
            }
            System.out.println(min) ;
        }
    }
}