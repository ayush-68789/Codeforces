import java.util.Arrays;
import java.util.Scanner;
public class Your_name 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            int n = sc.nextInt()  ; 
            String s1 = sc.next() ;
            String s2 = sc.next() ;
            if(s1.length() != s2.length())
            {
                System.out.println("NO");
                continue ;
            }
            char [] str1 = s1.toCharArray() ; 
            char [] str2 = s2.toCharArray() ;

            Arrays.sort(str1) ; 
            Arrays.sort(str2) ;

            boolean issame = true ;
            for (int i = 0; i < n ; i++) {
                if(str1[i] != str2[i])
                {
                    issame = false ;
                }
            }

            if(issame)
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
