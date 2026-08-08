import java.util.Scanner;

public class Shizuku_Hoshikawa_and_Farm_Legs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            int n = sc.nextInt() ; 
            // 2*c + 4*w = n 
            // c + 2*w = n/2  
            if( n % 2 == 1)
            {
                System.out.println(0);
            }
            else
            {
                // Let S = n/2
                // Equation becomes: c + 2w = S
                // For each valid w, c is determined.
                int s = n / 2 ; 

                // w can be from 0 to floor(S/2)
                // Number of valid w values = floor(S/2) + 1
                System.out.println(s/2 + 1 ); 
            }
        }
        sc.close();
    }
}
