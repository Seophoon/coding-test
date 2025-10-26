import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int N = input.nextInt(); // 랭킹등록 점수의 갯수
        int score = input.nextInt(); // 태수의 점수
        Integer[] arr = new Integer[N]; // 랭킹 리스트의 점수들
        int P = input.nextInt(); // 랭킹 리스트

        for(int i=0; i<N; i++){
            arr[i] = input.nextInt(); // 랭킹 리스트의 점수 입력
        }
        
        input.close();
        Arrays.sort(arr, Collections.reverseOrder()); // 리스트 내 점수 내림차순 정렬
        
        if(P == N && score <= arr[arr.length-1]){
            System.out.println(-1); 
            // 리스트가 꽉 찼고 정렬한 리스트의 마지막 점수보다 태수의 점수가 낮으면
            // 랭킹등록 불가  -1 출력
        }else{
            int rank = 1;
            for(int j=0; j<arr.length; j++){
                if(score<arr[j]){ // 1등점수와 비교해서 작으면 2등과 비교
                    rank++;
                }else{
                    break;
                }
            }
            System.out.println(rank);
        }        
    }
}
