import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException{
        // Scanner input = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int min[] = {300, 60, 10};
        int answer[] = new int[3];

        int T = Integer.parseInt(br.readLine());
        
        if(T%10 > 0){
            System.out.println("-1");
        }else{
            for(int i=0; i<answer.length; i++){
                answer[i] = T/min[i];
                T %= min[i];
                System.out.print(answer[i]+" ");
            }
        }
    }
}
