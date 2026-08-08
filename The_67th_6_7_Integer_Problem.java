import java.util.Scanner;

public class The_67th_6_7_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test -- > 0)
        {
            int [] arr = new int [7] ; 
            for(int i = 0 ; i < 7 ; i++)
            {
                arr[i] = sc.nextInt() ; 
            }
            int sum = 0 ; 
            int max = Integer.MIN_VALUE ; 
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i] ; 
                max = Math.max(max , arr[i]) ;
            }

            int ans = sum - max - max ; 
            ans = -ans ; 
            System.out.println(ans);
        }
        sc.close();
    }
}
