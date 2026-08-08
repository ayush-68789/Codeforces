import java.util.Scanner;

public class Sublime_Sequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ;
        while(test > 0)
        {
            int x = sc.nextInt() ; 
            int n = sc.nextInt() ; 
            int sum = 0 ; 
            for(int i = 1 ; i <= n ; i++)
            {
                if(i % 2 != 0)
                {
                    sum += x ;
                }
                else{
                    sum += -x ;
                }
            }
            System.out.println(sum);
            test-- ;
        }
    }
}
