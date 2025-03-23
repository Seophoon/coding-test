import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }

        // 배열 정렬
        Arrays.sort(arr);

        int M = sc.nextInt();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            if (Arrays.binarySearch(arr, sc.nextInt()) >= 0) {
                sb.append(1).append('\n');
            } else {
                sb.append(0).append('\n');
            }
        }
        
        System.out.println(sb);
        sc.close();
    }
}
