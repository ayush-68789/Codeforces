import java.util.Scanner;

public class Heapify_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in)  ; 
        int test = sc.nextInt() ; 
        while(test-- > 0)
        {
            int n = sc.nextInt() ; 
            int arr[] = new int[n] ; 
            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt() ; 
            }
            for(int i = 1 ; i <= n/2 ; i++)
            {
                if(arr[i] > arr[i*2])
                {
                    swap(arr,i , 2*i);
                }
            }
            for (int i = 0; i < arr.length-1 ; i++) {
                if(arr[i] > arr[i+1])
                {
                    System.out.println("NO");
                    return ;
                }
            }
            System.out.println("YES");
        }
    }

    public static void swap(int arr[], int a, int b)
    {
        int temp = arr[a] ; 
        arr[a] = arr[b] ; 
        arr[b] = temp ; 
    }
}
