import java.util.Scanner;

public class Cover_in_Water {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in ) ; 
        int t = sc.nextInt() ; 
        while (t -- > 0) {
            int n = sc.nextInt() ; 
            String st = sc.next() ; 
            int cont = 0 ; 
            int dot = 0 ; 
            boolean flag = true ; 
            for(int i = 0 ; i < st.length() ; i++)
            {
                char ch = st.charAt(i) ;
                if(ch == '.')
                {
                    dot ++ ; 
                    cont ++ ; 
                    if(cont >= 3)
                    {
                        System.out.println(2);
                        flag = false ; 
                        break ;
                    }
                }
                else
                {
                    cont = 0 ; 
                }
            }
            if(flag)  System.out.println(dot) ;
        }
        sc.close();
    }
}
