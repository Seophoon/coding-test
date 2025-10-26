import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int N = input.nextInt();
        int count = 0;

        for(int i=0; i<N; i++){
            int M = input.nextInt();
            boolean flag = true;
            if(M == 1) continue;

            for(int j=2; j<M; j++){
                if(M%j == 0){
                    flag = false;
                    break;
                }
            }
            if(flag){
                count++;
            }
        }
        input.close();
        System.out.println(count);
    }
}