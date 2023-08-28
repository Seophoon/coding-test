import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 주어지는 동전의 종류
        int K = input.nextInt(); // 합계로 나와야 하는 수

        int [] arr = new int[N]; // 동전의 종류가 오름차 순으로 주어진다. 
        int coin = 0; // 필요한 동전의 수

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt(); // 동전 종류를 배열에 넣는다.
        }
        input.close();

        for(int i=N-1; i>=0; i--){ 
            if(arr[i] <= K){ // 오름차 순이니 거꾸로 꺼내서 값은 나눈다.
                coin += K/arr[i]; // 나눈 값을 coin에 더하고
                K = K % arr[i]; // 나머지를 가지고 다시 계산한다. 
            }
        }
        System.out.println(coin);
    }
}
