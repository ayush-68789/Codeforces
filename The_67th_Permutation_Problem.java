import java.util.Scanner;

public class The_67th_Permutation_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 
        int test = sc.nextInt() ;
        while(test -- > 0)
        {
            int n = sc.nextInt() ; 
            int size = n * 3 ;
            int low = 1 ; 
            int high = size ; 
            int [] arr = new int[size] ; 
            int idx = 0 ;
            while(low < high)
            {
                arr[idx] = low ; 
                idx ++ ; 
                low ++ ; 
                arr[idx] = high - 1 ;
                idx ++ ; 
                arr[idx] = high ;
                idx++ ; 
                high -= 2 ; 
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.print(arr[i] +" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
 