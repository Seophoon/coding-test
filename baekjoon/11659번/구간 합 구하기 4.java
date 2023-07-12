import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        Scanner in = new Scanner(System.in);

        int N = in.nextInt(); //수의 갯수
        int M = in.nextInt(); //계산의 횟수

        int[] z = new int[N+1]; //누적합이 들어갈 배열
        int sum = 0;
        z[0] = 0;
        for(int k=1; k<=N; k++){
            int d = in.nextInt(); //수의 나열 
            sum += d; // 배열에 미리 수를 더한 값을 넣어 시간을 줄인다.
            z[k] = sum; 
        }
        // 5 4 3 2 1 을 입력했으면
        // 0 5 9 12 14 15 가 배열에 입력된다. 
        
        for(int h=0; h<M; h++){
            int i = in.nextInt(); // 시작할 수의 위치
            int j = in.nextInt(); // 끝나는 수의 위치
            int answer = 0;
            
            answer = z[j] - z[i-1];
        
            System.out.println(answer);
        }
        in.close();
    }
}