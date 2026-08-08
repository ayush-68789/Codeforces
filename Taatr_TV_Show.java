import java.util.Scanner;

public class Taatr_TV_Show {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int t = sc.nextInt() ; 
        while(t -- > 0 )
        {
            int n = sc.nextInt() ;
            int k = sc.nextInt() ; 
            String st = sc.next() ;
            boolean poss = true;
            for (int r = 0; r < k; r++) 
            {
                int ones = 0 ;
                for (int i = r; i < n; i += k) 
                {
                    if (st.charAt(i) == '1') 
                    {
                        ones++;
                    }
                }

                if ((ones & 1) == 1) 
                {
                    poss = false;
                    break;
                }
            }

            if(poss)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }   
}
