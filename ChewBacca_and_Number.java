import java.util.Scanner;

public class ChewBacca_and_Number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        long n = sc.nextLong() ; 
        long ans = 0 ; 
        long mul = 1 ; 
        while(n > 0)
        {
            long digi = n % 10 ;
            if(n < 10 && digi == 9)
            {
                ans = digi* mul + ans ;
            }
            else if(digi >= 5)
            {
                ans = ans + ( 9 - digi)* mul ; 
            }
            else{
                ans = ans + digi * mul ;
            }
            mul = mul * 10 ; 
            n =n /10 ; 
        }
        System.out.println(ans);
        sc.close();
    }
}