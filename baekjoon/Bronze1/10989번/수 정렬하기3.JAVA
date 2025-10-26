// import java.util.Scanner;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        // Scanner input = new Scanner(System.in);
        // input.close();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine()); // 총 입력할 수의 갯수
        int[] arr = new int[N]; // 배열 생성

        for(int i = 0; i<N; i++){
            arr[i] = Integer.parseInt(br.readLine()); // 배열에 수 입력
        }
        
        Arrays.sort(arr); // 배열 정렬

        for(int i=0; i<N; i++){
            sb.append(arr[i]).append('\n');
        }

        System.out.println(sb);

        // 시간제한 3초
        // 메모리 제한 512MB
    }
}