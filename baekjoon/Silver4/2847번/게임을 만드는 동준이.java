import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        // 스테이지는 뒤로갈 수 록 난이도가 어려워진다.
        // 어려울수록 점수를 더 받게 설정해야 한다.
        // 어려운 스테이지 점수를 올리는게 아니라 앞 스테이지 점수를 감소하는게 조건이다. 

        int N = input.nextInt(); // N개의 스테이지
        int[] score = new int[N]; // 스테이지에 따른 점수를 넣을 N개의 배열 선언
        int jumsu = 0; // 점수가 감소되는 횟수
        
        for(int i=0; i<N; i++){
            score[i] = input.nextInt(); // 배열안에 현재 상태의 점수를 넣는다.
        }
        input.close();

        for(int i=N-1; i>0; i--){
            // 뒤의 스테이지의 점수보다 바로 앞의 스테이지의 점수가 높으면
            while(score[i] <= score[i-1]){ 
                score[i-1] -= 1; // 앞의 스테이지 점수를 1빼고
                jumsu++; // 한 번 감소했으니 횟수를 +1한다.
                // 이것을 뒤 스테이지 점수가 높아질 때까지 반복 
            }
        }
        System.out.println(jumsu); // 횟수를 출력
    }
}
