import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ; 
        String [] st = new String[n] ; 
        for(int i = 0 ; i < n ; i++)
        {
            st[i] = sc.next() ;
        }

        int x = 0 ; 
        for(String s : st) 
        {
            char ch = s.charAt(1) ; 
            if(ch == '+')
            {
                x ++ ; 
            }
            else
            {
                x -- ; 
            }
        }
        System.out.println(x);
    }
}
