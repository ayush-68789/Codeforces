import java.util.Scanner;

public class Beautiful_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int n = 5 ; 
        int [][] mat = new int[n][n] ;
        int currR = 0 , currC = 0 ;
        for(int i = 0 ; i < n ; i ++)
        {
            for(int j = 0 ; j < n ; j++)
            {
                mat[i][j] = sc.nextInt() ; 
                if(mat[i][j] == 1)
                {
                    currR = i ; 
                    currC = j; 
                }
            }
        }
        int swap = 0  ;
        while(currR >= 0 && currR < 5 && currC >= 0 && currC < 5 ){
            if(currR == 2 && currC == 2)
            {
                System.out.println(swap) ;
                break ;
            }
            if(currR < 2)
            {
                currR ++ ;
                swap++ ; 
            }
            if(currR > 2)
            {
                swap++ ; 
                currR -- ; 
            }
            if(currC < 2)
            {
                swap++ ; 
                currC ++ ; 
            }
            if(currC > 2)
            {
                swap++ ; 
                currC -- ; 
            }
        }
        sc.close() ; 
    }
}
