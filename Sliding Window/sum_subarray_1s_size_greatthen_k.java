import java.util.Scanner;

/**
 * sum_subarray_1s_size_greatthen_k
 */
public class sum_subarray_1s_size_greatthen_k {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        String st = "0111110001110" ;
        int k = sc.nextInt(); 
        int low = 0 ; 
        int high = 0 ; 
        int cnt = 0 ;
        while(high < st.length() )
        {
            char ch = st.charAt(high) ;
            if(ch == '0')
            {
                int size = high - low ;
                if(size >= k)
                {
                    cnt += ((size - k + 1 ) * (size - k + 2)) / 2 ;
                } 
                low = high+1 ; 
            }
            high ++ ; 
        }
        int size = high - low;

        if (size >= k) {
            cnt += ((size - k + 1) * (size - k + 2)) / 2;
        }
        System.out.println(cnt);
        sc.close();
    }
}