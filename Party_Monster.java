import java.util.Scanner;

public class Party_Monster {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while (test-- > 0) {
            int n = sc.nextInt() ; 
            String st = sc.next() ; 
            int countO = 0  , countC = 0 ;
            for (int i = 0; i < st.length() ; i++) {
                char ch = st.charAt(i) ; 
                if(ch == '(')
                {
                    countO++ ; 
                }
                else
                {
                    countC++ ;
                }
            }
            if(countC == countO)
            {
                System.out.println("YES") ; 
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
