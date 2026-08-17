import java.util.HashMap;
import java.util.Scanner;

public class Ternary_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        int test = sc.nextInt() ;
        while(test -- > 0)
        {
            String st = sc.next() ; 
            HashMap<Character, Integer> map = new HashMap<>() ;
            int low = 0 ; 
            int high = 0 ; 
            int n = st.length() ;
            int minlen = Integer.MAX_VALUE ;
            while(high < n)
            {
                char ch = st.charAt(high) ; 
                if(map.containsKey(ch))
                {
                    map.put(ch , map.get(ch) + 1) ; 
                }
                else
                {
                    map.put(ch , 1) ;
                }
                while(map.size() == 3)
                {
                    minlen= Math.min(minlen , high - low + 1 );
                    map.put(st.charAt(low) , map.get(st.charAt(low)) - 1) ;
                    if(map.get(st.charAt(low)) == 0){
                        map.remove(st.charAt(low)) ;
                    }
                    low ++ ; 
                }
                high ++ ;
            }
            if(minlen == Integer.MAX_VALUE)
            {
                System.out.println(0);
            }
            else{
                System.out.println(minlen);
            }
        }
        sc.close();
    }
}
