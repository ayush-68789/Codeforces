import java.util.Scanner;

public class koshary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test -- > 0)
        {
            int a = sc.nextInt() ; 
            int b = sc.nextInt() ; 
            if((a % 2 == 1) && (b % 2 == 1))
            {
                System.out.println("NO") ; 
            }
            else{
                System.out.println("YES") ;
            }
        }
    }
}