import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt(); // n 번째 수
        
        input.close();

        int answer = Fibonacci(n);
        System.out.println(answer);
        
    }

    public static int Fibonacci(int n){
        // System.out.println(n);
        if (n == 0) return 0;
        if (n == 1) return 1;

        int k = n+1;
        int[] arr = new int[k];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2; i<k; i++){
            arr[i] = arr[i-2] + arr[i-1]; 
        }
        return arr[n];
    }
}