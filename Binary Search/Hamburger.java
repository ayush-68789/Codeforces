import java.util.Scanner;

public class Hamburger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        String st = sc.next() ; 
        int nb = sc.nextInt() ;
        int ns = sc.nextInt() ;
        int nc = sc.nextInt() ;
        int pb = sc.nextInt() ;
        int ps = sc.nextInt() ;
        int pc = sc.nextInt() ;
        int r = sc.nextInt() ;
        int b=0, s=0 ,c=0 ; 
        for(int i = 0 ; i < st.length() ; i++)
        {
            char ch = st.charAt(i) ; 
            if(ch == 'B')
            {
                b++ ; 
            }
            else if(ch == 'S')
            {
                s++ ; 
            }
            else
            {
                c++ ;
            }
        } // ratio of them B : S : C -> 3 : 2 : 1

        long ans = 0 ;
        long low = 0 ; 
        long high = 1000000000000L + 100L ;
        while(low <= high)
        {
            long mid = low + (high - low) / 2 ;
            if(isPossible(mid, b, c, s, r , pb, ps, pc, nb ,ns, nc))
            {
                ans = mid ;
                low = mid + 1 ; 
            }
            else
            {
                high = mid - 1 ;
            }
        }
        System.out.println(ans);
    }

    public static boolean isPossible(long mid, int b, int s, int c, int price , int pb, int ps, int pc, int nb, int ns, int nc)
    {
        long brem = mid * b ; 
        long crem = mid * c; 
        long srem = mid * s ;
        brem = Math.max(0L, (brem - nb)) * pb ; 
        crem = Math.max(0L, (crem - nc)) * pc ;
        srem = Math.max(0L, (srem - ns))* ps ;
        if(brem + crem + srem <= price)
        {
            return true ;
        }
        else{
            return false ;
        }
    }
}
