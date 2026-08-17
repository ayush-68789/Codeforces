import java.util.Scanner;

public class Soft_Drinking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = sc.nextInt() ; 
        int k = sc.nextInt() ; 
        int l = sc.nextInt() ; 
        int c = sc.nextInt() ; 
        int d = sc.nextInt() ; 
        int p = sc.nextInt() ; 
        int nl = sc.nextInt() ; 
        int np = sc.nextInt() ; 
        int drink = (l * k) / 3 ; 
        int limes = c * d ;
        int salt = p / np ; 
        int toasts = Math.min(drink, Math.min(limes, salt)) / 3 ; 
        System.out.println(toasts);
    }
}
