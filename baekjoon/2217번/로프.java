import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        Integer[] arr = new Integer[N];
        int max = 0;

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        Arrays.sort(arr, Collections.reverseOrder());

        for(int i=0; i<N; i++){
            max = Math.max(max, arr[i]*(i+1));
        }

        System.out.println(max);

    }
}
