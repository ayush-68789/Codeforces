import java.util.Scanner;

public class The_67th_Integer_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int test = sc.nextInt() ;
        while(test -- > 0)
        {
            int x = sc.nextInt() ; 
            if(x == 67 )
            {
                System.out.println(x);
            }
            else{
                System.out.println(x+1);
            }
        }
        sc.close();
    }
}