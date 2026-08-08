import java.util.Scanner;
public class square
{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in) ;
        int test = sc.nextInt() ;
        while(test-- > 0)
        {
            int a = sc.nextInt() ; 
            int b = sc.nextInt() ; 
            int c = sc.nextInt() ; 
            int d = sc.nextInt() ; 
            if(a==b && b==c && c==d && d==a)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        sc.close();
    }
}