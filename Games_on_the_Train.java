import java.util.Scanner;

public class Games_on_the_Train {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt() ; 
        while(t -- > 0)
        {
            int n = sc.nextInt() ; 
            int [] arr = new int[n] ; 
            for(int i = 0 ; i < n ; i++)
            {
                arr[i] = sc.nextInt() ; 
            }
            int max = Integer.MIN_VALUE ; 
            int min = Integer.MAX_VALUE ;
            for(int x : arr)
            {
                min = Math.min(min , x) ; 
                max = Math.max(max , x) ; 
            }
            System.out.println(max-min+1);
        }
    }
}