import java.util.Arrays;
import java.util.Scanner;

public class ismtauddin_Magic_wand {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ;
        while(test-- > 0)
        {
            int n = sc.nextInt() ; 
            int arr[] = new int[n] ;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt() ;
            }
            int odd = 0 ; 
            int even = 0 ;
            for (int i = 0; i < arr.length; i++) {
                if(arr[i] % 2 == 0)
                {
                    even ++ ; 
                }
                else{
                    odd++ ;
                }
            }

            if(odd == 0 || even == 0)
            {
                for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                continue ;
            }
            if(odd > 0 && even > 0)
            {
                Arrays.sort(arr) ;
                 for (int i = 0; i < arr.length; i++) {
                    System.out.print(arr[i]+" ");
                }
                continue ;
            }
        }
        sc.close();
    }
}
