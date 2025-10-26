import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        input.close();

        int[] arr = new int[N*2];

        for(int i=1; i<=N; i++){
            arr[i] = i;
        }

        int index = 1;
        int xedni = N;

        while(N-- > 1){
            index++;
            arr[xedni+1] = arr[index];
            xedni++;
            index++;
        }
        System.out.println(arr[index]);
    }
}
