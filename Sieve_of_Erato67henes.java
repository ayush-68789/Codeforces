import java.util.Scanner;

public class Sieve_of_Erato67henes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            int n = sc.nextInt() ; 
            int [] arr = new int[n] ;
            boolean has = false ; 
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt() ;
                if(arr[i] == 67)
                    {
                        has = true ; 
                    } 
            }
            if(has)
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
        sc.close();
    }
}
