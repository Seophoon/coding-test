import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner input = new Scanner(System.in);

        int K = input.nextInt(); // 반의 수
        for(int i=0; i<K; i++){
            int N = input.nextInt(); // 학생의 수
            Integer[] math= new Integer[N]; // 수학성적을 담을 배열

                for(int j=0; j<N; j++){
                    math[j] = input.nextInt(); // 수학 성적
                }

            Arrays.sort(math, Collections.reverseOrder());
            
            int max = math[0];
            int min = math[N-1];
            int gap = 0;

            for(int m=0; m<math.length-1; m++){
                gap = Math.max(math[m] - math[m+1], gap);
            }

            System.out.println("Class "+ (i+1));
            System.out.println("Max "+ max +", Min "+ min +", Largest gap "+ gap);
        }
        
        
    
        input.close();

        
    }
}
